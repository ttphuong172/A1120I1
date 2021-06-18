package repository;

import model.VillaHouseStandard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VillaHouseStandardRepositoryImpl implements VillaHouseStandardRepository {
    @Override
    public List<VillaHouseStandard> selectAllVillaHouseStandard() {
        List<VillaHouseStandard> villaHouseStandardList=new ArrayList<>();
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement=connection.prepareStatement("select * from villahousestandard");
            resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                String villaHouseStandardId=resultSet.getString("villahousestandardid");
                String villaHouseStandardName=resultSet.getString("villahousestandardname");
                VillaHouseStandard villaHouseStandard=new VillaHouseStandard(villaHouseStandardId,villaHouseStandardName);
                villaHouseStandardList.add(villaHouseStandard);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return villaHouseStandardList;
    }
}
