package repository;

import model.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;

public class ServiceRepositoryImpl implements ServiceRepository {
    @Override
    public List<Service> selectAllService() {
        List<Service> serviceList=new ArrayList<>();
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement=connection.prepareStatement("select * from services");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceId= resultSet.getString("serviceid");
                String serviceTypeId=resultSet.getString("servicetypeid");
                String serviceName=resultSet.getString("servicename");
                int useArea=resultSet.getInt("usearea");
                int rentalPrice=resultSet.getInt("rentalprice");
                int maxPerson=resultSet.getInt("maxperson");
                String rentalFormId=resultSet.getString("rentalformid");
                String villaHouseStandardId=resultSet.getString("villahousestandardid");
                String otherConvenientVillaHouse=resultSet.getString("otherconvenientvillahouse");
                int pollVillaArea=resultSet.getInt("pollvillaarea");
                int numberFloorVillaHouse=resultSet.getInt("numberfloorvillahouse");
                String freeServiceRoom=resultSet.getString("freeserviceroom");
                Service service = new Service(serviceId,serviceTypeId,serviceName,useArea,rentalPrice,maxPerson,rentalFormId,villaHouseStandardId,otherConvenientVillaHouse,pollVillaArea,numberFloorVillaHouse,freeServiceRoom);
                serviceList.add(service);
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
        return serviceList;
    }

    @Override
    public void remove(String serviceId) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        try {
            preparedStatement=connection.prepareStatement("delete from services where serviceid=?");
            preparedStatement.setString(1,serviceId);
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
    public void saveRoom(Service service) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;


        try {
            preparedStatement=connection.prepareStatement("insert into services(serviceid,servicetypeid,servicename,usearea,rentalPrice,maxperson,rentalformid,freeserviceroom) values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,service.getServiceId());
            preparedStatement.setString(2,service.getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalFormId());
            preparedStatement.setString(8,service.getFreeServiceRoom());
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
    public void saveHouse(Service service) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement =null;

        try {
            preparedStatement = connection.prepareStatement("insert into services(serviceid,servicetypeid,servicename,usearea,rentalPrice,maxperson,rentalformid,villahousestandardid,otherconvenientvillahouse,numberfloorvillahouse) values (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,service.getServiceId());
            preparedStatement.setString(2,service.getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalFormId());
            preparedStatement.setString(8,service.getVillaHouseStandardId());
            preparedStatement.setString(9,service.getOtherConvenientVillaHouse());
            preparedStatement.setInt(10,service.getNumberFloorVillaHouse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

    @Override
    public void saveVilla(Service service) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement =null;
        try {
            preparedStatement = connection.prepareStatement("insert into services(serviceid,servicetypeid,servicename,usearea,rentalPrice,maxperson,rentalformid,villahousestandardid,otherconvenientvillahouse,pollvillaarea,numberfloorvillahouse) values (?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,service.getServiceId());
            preparedStatement.setString(2,service.getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalFormId());
            preparedStatement.setString(8,service.getVillaHouseStandardId());
            preparedStatement.setString(9,service.getOtherConvenientVillaHouse());
            preparedStatement.setInt(10,service.getPollVillaArea());
            preparedStatement.setInt(11,service.getNumberFloorVillaHouse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBConnection.close();
    }

    @Override
    public Service findServiceById(String serviceId) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Service service=null;

        try {
            preparedStatement=connection.prepareStatement("select * from services where serviceid=?");
            preparedStatement.setString(1,serviceId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceTypeId=resultSet.getString("servicetypeid");
                String serviceName=resultSet.getString("servicename");
                int useArea = resultSet.getInt("usearea");
                int rentalPrice=resultSet.getInt("rentalprice");
                int maxPerson=resultSet.getInt("maxperson");
                String rentalFormId=resultSet.getString("rentalformid");
                String villaHouseStandardId=resultSet.getString("villahousestandardid");
                String otherConvenientVillaHouse=resultSet.getString("otherconvenientvillahouse");
                int pollVillaArea=resultSet.getInt("pollvillaarea");
                int numberFloorVillaHouse=resultSet.getInt("numberfloorvillahouse");
                String freeServiceRoom=resultSet.getString("freeserviceroom");
               service=new Service(serviceId,serviceTypeId,serviceName,useArea,rentalPrice,maxPerson,rentalFormId,villaHouseStandardId,otherConvenientVillaHouse,pollVillaArea,numberFloorVillaHouse,freeServiceRoom);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return service;
    }

    @Override
    public void updateRoom(String serviceId, Service service) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement =connection.prepareStatement("update services set servicename=?,usearea=?,rentalprice=?,maxperson=?,rentalformid=?,freeserviceroom=? where serviceid=?");
            preparedStatement.setString(1,service.getServiceName());
            preparedStatement.setInt(2,service.getUseArea());
            preparedStatement.setInt(3,service.getRentalPrice());
            preparedStatement.setInt(4,service.getMaxPerson());
            preparedStatement.setString(5,service.getRentalFormId());
            preparedStatement.setString(6,service.getFreeServiceRoom());
            preparedStatement.setString(7,serviceId);
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
    public void updateHouse(String serviceId, Service service) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        try {
            preparedStatement=connection.prepareStatement("update services set servicename=?,usearea=?,rentalprice=?,maxperson=?,rentalformid=?,villahousestandardid=?,otherconvenientvillahouse=?,numberfloorvillahouse=? where serviceid=?");
            preparedStatement.setString(1,service.getServiceName());
            preparedStatement.setInt(2,service.getUseArea());
            preparedStatement.setInt(3,service.getRentalPrice());
            preparedStatement.setInt(4,service.getMaxPerson());
            preparedStatement.setString(5,service.getRentalFormId());
            preparedStatement.setString(6,service.getVillaHouseStandardId());
            preparedStatement.setString(7,service.getOtherConvenientVillaHouse());
            preparedStatement.setInt(8,service.getNumberFloorVillaHouse());
            preparedStatement.setString(9,serviceId);
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
    public void updateVilla(String serviceId, Service service) {

    }


}
