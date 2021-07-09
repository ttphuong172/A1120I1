package controller;

import model.DanhMuc;
import model.SanPham;
import repository.DanhMucRepository;
import repository.DanhMucRepositoryImpl;
import repository.SanPhamRepository;
import repository.SanPhamRepositoryImpl;
import sun.plugin.com.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SanPhamServlet",urlPatterns = "/sanpham")
public class SanPhamServlet extends HttpServlet {
    SanPhamRepository sanPhamRepository=new SanPhamRepositoryImpl();
    DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action.equals("create")){
            String tenSanPham=request.getParameter("tensanpham");
            int giaSanPham=Integer.parseInt(request.getParameter("giasanpham"));
            int soLuong=Integer.parseInt( request.getParameter("soluong"));
            String mauSac=request.getParameter("mausac");
            String moTa=request.getParameter("mota");
            int idDanhMuc=Integer.parseInt(request.getParameter("iddanhmuc"));
            DanhMuc danhMuc=danhMucRepository.getDanhMucById(idDanhMuc);
            SanPham sanPham=new SanPham(tenSanPham,giaSanPham,soLuong,mauSac,moTa,danhMuc);
            sanPhamRepository.save(sanPham);
            request.setAttribute("listSanPham",sanPhamRepository.selectAllSanPham());
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request,response);
        } else if (action.equals("update")){
            int id=Integer.parseInt(request.getParameter("id"));
            String tenSanPham=request.getParameter("tensanpham");
            int giaSanPham=Integer.parseInt(request.getParameter("giasanpham"));
            int soLuong=Integer.parseInt( request.getParameter("soluong"));
            String mauSac=request.getParameter("mausac");
            String moTa=request.getParameter("mota");
            int idDanhMuc=Integer.parseInt(request.getParameter("iddanhmuc"));
            DanhMuc danhMuc=danhMucRepository.getDanhMucById(idDanhMuc);
            SanPham sanPham=new SanPham(tenSanPham,giaSanPham,soLuong,mauSac,moTa,danhMuc);
            sanPhamRepository.update(id,sanPham);
            request.setAttribute("listSanPham",sanPhamRepository.selectAllSanPham());
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            request.setAttribute("listSanPham",sanPhamRepository.selectAllSanPham());
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request,response);
        } else if (action.equals("create")){
            request.setAttribute("listDanhMuc",danhMucRepository.selectAllDanhMuc());
            RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
            dispatcher.forward(request,response);
        } else if(action.equals("edit")){
            int id=Integer.parseInt(request.getParameter("id"));
            request.setAttribute("sanPham",sanPhamRepository.findSanPhamById(id));
            request.setAttribute("listDanhMuc",danhMucRepository.selectAllDanhMuc());
            RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
            dispatcher.forward(request,response);
        } else if(action.equals("search")){
            String tenSanPham=request.getParameter("tensanpham");
            request.setAttribute("sanPhamSearch",sanPhamRepository.findSanPhamByName(tenSanPham));
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request,response);
        }
    }
}
