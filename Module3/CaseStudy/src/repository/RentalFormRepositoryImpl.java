package repository;

import model.RentalForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentalFormRepositoryImpl implements RentalFormRepository {
    @Override
    public List<RentalForm> selectAllRentalForm() {
        List<RentalForm> rentalFormList =new ArrayList<>();
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet =null;
        try {
            preparedStatement=connection.prepareStatement("select * from rentalform");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String rentalFormId=resultSet.getString("rentalformid");
                String rentalFormName=resultSet.getString("rentalformname");
                RentalForm rentalForm=new RentalForm(rentalFormId,rentalFormName);
                rentalFormList.add(rentalForm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentalFormList;
    }

    @Override
    public RentalForm findRentalFormById(String rentalFormId) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        RentalForm rentalForm=null;

        try {
            preparedStatement=connection.prepareStatement("select * from rentalform where rentalformid=?");
            preparedStatement.setString(1,rentalFormId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String rentalFormName=resultSet.getString("rentalformname");
                rentalForm=new RentalForm(rentalFormId,rentalFormName);
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
        return rentalForm;
    }
}
