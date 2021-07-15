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


}
