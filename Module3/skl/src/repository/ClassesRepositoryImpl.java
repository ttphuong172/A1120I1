package repository;

import model.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassesRepositoryImpl implements ClassesRepository {
    @Override
    public List<Classes> selectAllClass() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Classes> classesList=new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select ClassID,ClassName from Skyline_Classes where CS='CS4'");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String classId = resultSet.getString("ClassId");
                String className = resultSet.getString("ClassName");
                Classes classes=new Classes(classId,className);
                System.out.println(classes);
                classesList.add(classes);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classesList;
    }

}
