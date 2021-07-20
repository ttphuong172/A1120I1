package repository;

import model.DanhMuc;
import model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucRepositoryImpl implements DanhMucRepository {
    @Override
    public List<DanhMuc> selectAllDanhMuc() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<DanhMuc> danhMucList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from danhmuc");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idDanhMuc = resultSet.getInt("iddanhmuc");
                String tenDanhMuc = resultSet.getString("tenDanhMuc");
                DanhMuc danhMuc = new DanhMuc(idDanhMuc, tenDanhMuc);

                danhMucList.add(danhMuc);
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
        return danhMucList;
    }

    @Override
    public DanhMuc getDanhMucById(int idDanhMuc) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DanhMuc danhMuc = null;
        try {
            preparedStatement = connection.prepareStatement("select * from danhmuc where iddanhmuc=?");
            preparedStatement.setInt(1,idDanhMuc);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String tenDanhMuc = resultSet.getString("tenDanhMuc");
                danhMuc = new DanhMuc(idDanhMuc, tenDanhMuc);
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
        return danhMuc;
    }

    @Override
    public void saveDanhMuc(DanhMuc danhMuc) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("insert into danhmuc values (?,?)");
            preparedStatement.setInt(1,danhMuc.getIdDanhMuc());
            preparedStatement.setString(2,danhMuc.getTenDanhMuc());
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
    public void updateDanhMuc(DanhMuc danhMuc) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        try {
            preparedStatement=connection.prepareStatement("update danhmuc set tendanhmuc=? where iddanhmuc=?");
            preparedStatement.setString(1,danhMuc.getTenDanhMuc());
            preparedStatement.setInt(2,danhMuc.getIdDanhMuc());
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
    public void deleteDanhMuc(int id) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        try {
            preparedStatement=connection.prepareStatement("delete from danhmuc where iddanhmuc=?");
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
