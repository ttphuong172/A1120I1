package repository;

import model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepositoryImpl implements SanPhamRepository {
    @Override
    public List<SanPham> selectAllSanPham() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<SanPham> sanPhamList = new ArrayList<>();
        try {
            preparedStatement=connection.prepareStatement("select * from sanpham");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String ten = resultSet.getString("ten");
                int gia=resultSet.getInt("gia");
                int soLuong=resultSet.getInt("soluong");
                SanPham sanPham=new SanPham(id,ten,gia,soLuong);
                sanPhamList.add(sanPham);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
        return sanPhamList;
    }

    @Override
    public void save(SanPham sanPham) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement=connection.prepareStatement("insert into sanpham (ten, gia, soluong) values (?,?,?)");
            preparedStatement.setString(1,sanPham.getTen());
            preparedStatement.setInt(2,sanPham.getGia());
            preparedStatement.setInt(3,sanPham.getSoLuong());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public SanPham findSanPhamById(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet = null;
        SanPham sanPham=null;
        try {
            preparedStatement=connection.prepareStatement("select * from sanpham where id=?");
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                String ten= resultSet.getString("ten");
                int gia = resultSet.getInt("gia");
                int soLuong=resultSet.getInt("soluong");
                sanPham=new SanPham(id,ten,gia,soLuong);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  sanPham;
    }

    @Override
    public void updateSanPham(SanPham sanPham) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement=connection.prepareStatement("update sanpham set ten=?, gia=?, soluong=? where id=? ");
            preparedStatement.setString(1,sanPham.getTen());
            preparedStatement.setInt(2,sanPham.getGia());
            preparedStatement.setInt(3,sanPham.getSoLuong());
            preparedStatement.setInt(4,sanPham.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public void removeSanPham(int id) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("delete from sanpham where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
    }
}
