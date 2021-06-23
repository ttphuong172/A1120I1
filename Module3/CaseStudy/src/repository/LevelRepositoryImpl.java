package repository;

import model.Level;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LevelRepositoryImpl implements LevelRepository {
    @Override
    public List<Level> selectAllLevel() {
        List<Level> levelList=new ArrayList<>();
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet =null;

        try {
            preparedStatement = connection.prepareStatement ("select * from level");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                String levelId = resultSet.getString("levelid");
                String levelName = resultSet.getString("levelname");
                Level level = new Level(levelId, levelName);
                levelList.add(level);
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

        return levelList;
    }

    @Override
    public Level findLevelById(String levelId) {
        Level level=null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            preparedStatement=connection.prepareStatement("select * from level where levelId=?");
            preparedStatement.setString(1,levelId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String levelName=resultSet.getString("levelName");
                level=new Level(levelId,levelName);

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
        return level;
    }
}
