package repository;

import model.DanhMuc;
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
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<SanPham> sanPhamList=new ArrayList<>();
        try {
            preparedStatement=connection.prepareStatement("select sanpham.*, danhmuc.tendanhmuc from sanpham \n" +
                    "inner join danhmuc\n" +
                    "on sanpham.iddanhmuc=danhmuc.iddanhmuc" );
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String tenSanPham=resultSet.getString("tensanpham");
                int giaSanPham=resultSet.getInt("giasanpham");
                int soLuong=resultSet.getInt("soluong");
                String mauSac=resultSet.getString("mausac");
                String moTa=resultSet.getString("mota");
                int idDanhMuc=resultSet.getInt("iddanhmuc");
                String tenDanhMuc=resultSet.getString("tenDanhMuc");
                DanhMuc danhMuc=new DanhMuc(idDanhMuc,tenDanhMuc);
                SanPham sanPham=new SanPham(id,tenSanPham,giaSanPham,soLuong,mauSac,moTa,danhMuc);
                sanPhamList.add(sanPham);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return sanPhamList;
    }

    @Override
    public void save(SanPham sanPham) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("insert into sanpham (tensanpham,giasanpham,soluong,mausac,mota,iddanhmuc) values(?,?,?,?,?,?)");
            preparedStatement.setString(1,sanPham.getTenSanPham());
            preparedStatement.setInt(2,sanPham.getGiaSanPham());
            preparedStatement.setInt(3,sanPham.getSoLuong());
            preparedStatement.setString(4,sanPham.getMauSac());
            preparedStatement.setString(5,sanPham.getMoTa());
            preparedStatement.setInt(6,sanPham.getDanhMuc().getIdDanhMuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public SanPham findSanPhamById(int id) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        SanPham sanPham=null;
        try {
            preparedStatement=connection.prepareStatement("select sanpham.*, danhmuc.tendanhmuc from sanpham \n" +
                    "inner join danhmuc\n" +
                    "on sanpham.iddanhmuc=danhmuc.iddanhmuc\n" +
                    "where id=?\n" );
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String tenSanPham=resultSet.getString("tensanpham");
                int giaSanPham=resultSet.getInt("giasanpham");
                int soLuong=resultSet.getInt("soluong");
                String mauSac=resultSet.getString("mausac");
                String moTa=resultSet.getString("mota");
                int idDanhMuc=resultSet.getInt("iddanhmuc");
                String tenDanhMuc=resultSet.getString("tenDanhMuc");
                DanhMuc danhMuc=new DanhMuc(idDanhMuc,tenDanhMuc);
                sanPham=new SanPham(id,tenSanPham,giaSanPham,soLuong,mauSac,moTa,danhMuc);
                System.out.println(sanPham);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return sanPham;
    }

    @Override
    public void update(int id,SanPham sanPham) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("update sanpham set tensanpham=?, giasanpham=?,soluong=?,mausac=?,mota=?,iddanhmuc=? where id=? ");
            preparedStatement.setString(1,sanPham.getTenSanPham());
            preparedStatement.setInt(2,sanPham.getGiaSanPham());
            preparedStatement.setInt(3,sanPham.getSoLuong());
            preparedStatement.setString(4,sanPham.getMauSac());
            preparedStatement.setString(5,sanPham.getMoTa());
            preparedStatement.setInt(6,sanPham.getDanhMuc().getIdDanhMuc());
            preparedStatement.setInt(7,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public List<SanPham> findSanPhamByName(String tenSanPham) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<SanPham> sanPhamList=null;

        try {
            preparedStatement=connection.prepareStatement("select sanpham.*, danhmuc.tendanhmuc from sanpham \n" +
                    "inner join danhmuc\n" +
                    "on sanpham.iddanhmuc=danhmuc.iddanhmuc\n" +
                    "where tensanpham like concat?\n" );
            preparedStatement.setString(1,tenSanPham);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                int giaSanPham=resultSet.getInt("giasanpham");
                int soLuong=resultSet.getInt("soluong");
                String mauSac=resultSet.getString("mausac");
                String moTa=resultSet.getString("mota");
                int idDanhMuc=resultSet.getInt("iddanhmuc");
                String tenDanhMuc=resultSet.getString("tenDanhMuc");
                DanhMuc danhMuc=new DanhMuc(idDanhMuc,tenDanhMuc);
                SanPham sanPham=new SanPham(id,tenSanPham,giaSanPham,soLuong,mauSac,moTa,danhMuc);
               sanPhamList.add(sanPham);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return sanPhamList;
    }
}
