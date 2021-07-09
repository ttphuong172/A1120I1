package repository;

import model.ThueNha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChoThueRepositoryImpl implements ChoThueRepository {
    @Override
    public List<ThueNha> selectAll() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<ThueNha> thueNhaList=new ArrayList<>();

        try {
            preparedStatement=connection.prepareStatement("select * from chothue");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String ngayBatDau=resultSet.getString("ngaybatdau");
                String ngayKetThuc=resultSet.getString("ngayketthuc");
                int giaChoThue=resultSet.getInt("giachothue");
                String id=resultSet.getString("id");
                int dienTich=resultSet.getInt("dientich");
                ThueNha thueNha=new ThueNha(id,ngayBatDau,ngayKetThuc,giaChoThue,dienTich);
                thueNhaList.add(thueNha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thueNhaList;
    }

    @Override
    public void saveThueNha(ThueNha thueNha) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("insert into chothue(ngaybatdau,ngayketthuc,giachothue,id,dientich) values (?,?,?,?,?)");
            preparedStatement.setString(1,thueNha.getNgayBatDau());
            preparedStatement.setString(2,thueNha.getNgayKetThuc());
            preparedStatement.setInt(3,thueNha.getGiaChoThue());
            preparedStatement.setString(4,thueNha.getId());
            preparedStatement.setInt(5,thueNha.getDienTich());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isExitId(String id) {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=null;
            ResultSet resultSet =null;
            boolean isExist=false;
            try {
                preparedStatement= connection.prepareStatement("select id from chothue");
                resultSet=preparedStatement.executeQuery();
                while (resultSet.next()){
                    String abc=resultSet.getString("id");
                    System.out.println("Gia tri"+abc);
                    if(abc.equals(id)){
                        isExist=true;
                        break;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return isExist;

    }

    @Override
    public List<ThueNha> searchGia(int giaChoThue) {
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<ThueNha> thueNhaList=new ArrayList<>();
        try {
            preparedStatement=connection.prepareStatement("select * from chothue where giachothue=?");
            preparedStatement.setInt(1,giaChoThue);

            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String ngayBatDau=resultSet.getString("ngaybatdau");
                String ngayKetThuc=resultSet.getString("ngayketthuc");
                String id=resultSet.getString("id");
                int dienTich=resultSet.getInt("dientich");
                ThueNha thueNha=new ThueNha(id,ngayBatDau,ngayKetThuc,giaChoThue,dienTich);
                thueNhaList.add(thueNha);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thueNhaList;
    }

    @Override
    public List<ThueNha> searchDienTich(int dienTich) {
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<ThueNha> thueNhaList=new ArrayList<>();
        try {
            preparedStatement=connection.prepareStatement("select * from chothue where dientich=?");
            preparedStatement.setInt(1,dienTich);

            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String ngayBatDau=resultSet.getString("ngaybatdau");
                String ngayKetThuc=resultSet.getString("ngayketthuc");
                String id=resultSet.getString("id");
                int giaChoThue=resultSet.getInt("giachothue");
                ThueNha thueNha=new ThueNha(id,ngayBatDau,ngayKetThuc,giaChoThue,dienTich);
                thueNhaList.add(thueNha);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thueNhaList;
    }

}
