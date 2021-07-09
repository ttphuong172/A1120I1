package controller;

import model.ThueNha;
import repository.ChoThueRepository;
import repository.ChoThueRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(name = "WelServlet", urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {
    ChoThueRepository choThueRepository = new ChoThueRepositoryImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ngaybatdau = convertDate(request.getParameter("ngaybatdau"));
        String ngayketthuc = convertDate(request.getParameter("ngayketthuc"));
        int giaChoThue = Integer.parseInt(request.getParameter("giachothue"));
        int dienTich = Integer.parseInt(request.getParameter("dientich"));
        String id = request.getParameter("id");
        String msg;
        long songay = dateIf(ngaybatdau, ngayketthuc);
        ThueNha thueNha = new ThueNha(id, ngaybatdau, ngayketthuc, giaChoThue,dienTich);


        if (songay < 60) {
            msg = "Ngay ko dung";
            request.setAttribute("msg", msg);
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
        } else if (choThueRepository.isExitId(id)) {
            msg = "ID trung";
            request.setAttribute("msg", msg);
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
        } else {
            choThueRepository.saveThueNha(thueNha);
            request.setAttribute("list", choThueRepository.selectAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null) {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            if (username != null) {
                request.setAttribute("username", username);
                request.setAttribute("list", choThueRepository.selectAll());
                RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
                dispatcher.forward(request, response);
            } else {
                response.sendRedirect("/login");
            }

        } else if(action.equals("create")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("search")){
            String giaChoThue=request.getParameter("giachothue") ;
            String dienTich=request.getParameter("dientich") ;
            System.out.println("Gia"+giaChoThue);
            System.out.println("Dien tich"+dienTich);
            if(giaChoThue!=""){
                int giaChoThueint=Integer.parseInt(giaChoThue);
                request.setAttribute("listSearch",choThueRepository.searchGia(giaChoThueint));
                RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
                dispatcher.forward(request, response);
            } else if (dienTich!=""){
                int dienTichint=Integer.parseInt(dienTich);
                request.setAttribute("listSearch",choThueRepository.searchDienTich(dienTichint));
                RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
                dispatcher.forward(request, response);
            }

        }

    }

    String convertDate(String ngayweb) {
        DateFormat kieungayweb = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat kieungaymysql = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaymid = null;
        try {
            ngaymid = kieungayweb.parse(ngayweb);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return kieungaymysql.format(ngaymid);
    }

    long dateIf(String ngaybatdau, String ngaykethuc) {
        DateFormat kieungay = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaybd = null;
        Date ngaykt = null;

        try {
            ngaybd = kieungay.parse(ngaybatdau);
            System.out.println(ngaybd);

            ngaykt = kieungay.parse(ngaykethuc);
            System.out.println(ngaykt);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        long miliseconds = ngaykt.getTime() - ngaybd.getTime();
        long days = miliseconds / (24 * 60 * 60 * 1000);
        return days;
    }

}
