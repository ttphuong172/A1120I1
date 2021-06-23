package repository;

import model.Diploma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiplomaRepositoryImpl implements DiplomaRepository {
    @Override
    public List<Diploma> selectAllDiploma() {
        List<Diploma> diplomaList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from diploma");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String diplomaId = resultSet.getString("diplomaid");
                String diplomaName = resultSet.getString("diplomaName");
                Diploma diploma = new Diploma(diplomaId, diplomaName);
                diplomaList.add(diploma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return diplomaList;
    }

    @Override
    public Diploma findDiplomaById(String diplomaId) {
        Diploma diploma = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from diploma where diplomaid=?");
            preparedStatement.setString(1, diplomaId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String diplomaName = resultSet.getString("diplomaname");
                diploma = new Diploma(diplomaId, diplomaName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return diploma;
    }
}
