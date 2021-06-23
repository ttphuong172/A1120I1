package repository;

import model.RentalForm;
import model.Service;
import model.ServiceType;
import model.VillaHouseStandard;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
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
            preparedStatement=connection.prepareStatement("select services.*, servicetype.ServiceTypeName,rentalform.RentalFormName,villahousestandard.VillaHouseStandardName from services \n" +
                    "left join servicetype\n" +
                    "on services.ServiceTypeId=servicetype.ServiceTypeId\n" +
                    "left join rentalform\n" +
                    "on services.RentalFormId=rentalform.RentalFormId\n" +
                    "left join villahousestandard\n" +
                    "on services.VillaHouseStandardID=villahousestandard.VillaHouseStandardId");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceId= resultSet.getString("serviceid");
                String serviceTypeId=resultSet.getString("servicetypeid");
                String serviceTypeName=resultSet.getString("servicetypename");
                ServiceType serviceType=new ServiceType(serviceTypeId,serviceTypeName);
                String serviceName=resultSet.getString("servicename");
                int useArea=resultSet.getInt("usearea");
                int rentalPrice=resultSet.getInt("rentalprice");
                int maxPerson=resultSet.getInt("maxperson");
                String rentalFormId=resultSet.getString("rentalformid");
                String rentalFormName=resultSet.getString("rentalformname");
                RentalForm rentalForm=new RentalForm(rentalFormId,rentalFormName);
                String villaHouseStandardId=resultSet.getString("villahousestandardid");
                String villaHouseStandardName=resultSet.getString("villahousestandardname");
                VillaHouseStandard villaHouseStandard=new VillaHouseStandard(villaHouseStandardId,villaHouseStandardName);
                String otherConvenientVillaHouse=resultSet.getString("otherconvenientvillahouse");
                int pollVillaArea=resultSet.getInt("pollvillaarea");
                int numberFloorVillaHouse=resultSet.getInt("numberfloorvillahouse");
                String freeServiceRoom=resultSet.getString("freeserviceroom");
                Service service = new Service(serviceId,serviceType,serviceName,useArea,rentalPrice,maxPerson,rentalForm,villaHouseStandard,otherConvenientVillaHouse,pollVillaArea,numberFloorVillaHouse,freeServiceRoom);
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
            preparedStatement.setString(2,service.getServiceType().getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalForm().getRentalFormId());
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
            preparedStatement.setString(2,service.getServiceType().getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalForm().getRentalFormId());
            preparedStatement.setString(8,service.getVillaHouseStandard().getVillaHouseStandardId());
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
            preparedStatement.setString(2,service.getServiceType().getServiceTypeId());
            preparedStatement.setString(3,service.getServiceName());
            preparedStatement.setInt(4,service.getUseArea());
            preparedStatement.setInt(5,service.getRentalPrice());
            preparedStatement.setInt(6,service.getMaxPerson());
            preparedStatement.setString(7,service.getRentalForm().getRentalFormId());
            preparedStatement.setString(8,service.getVillaHouseStandard().getVillaHouseStandardId());
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
            preparedStatement=connection.prepareStatement("select services.*, servicetype.ServiceTypeName,rentalform.RentalFormName,villahousestandard.VillaHouseStandardName from services \n" +
                    "left join servicetype\n" +
                    "on services.ServiceTypeId=servicetype.ServiceTypeId\n" +
                    "left join rentalform\n" +
                    "on services.RentalFormId=rentalform.RentalFormId\n" +
                    "left join villahousestandard\n" +
                    "on services.VillaHouseStandardID=villahousestandard.VillaHouseStandardId where serviceid=?");
            preparedStatement.setString(1,serviceId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String serviceTypeId=resultSet.getString("servicetypeid");
                String serviceTypeName=resultSet.getString("servicetypename");
                ServiceType serviceType=new ServiceType(serviceTypeId,serviceTypeName);
                String serviceName=resultSet.getString("servicename");
                int useArea = resultSet.getInt("usearea");
                int rentalPrice=resultSet.getInt("rentalprice");
                int maxPerson=resultSet.getInt("maxperson");
                String rentalFormId=resultSet.getString("rentalformid");
                String rentalFormName=resultSet.getString("rentalformname");
                RentalForm rentalForm=new RentalForm(rentalFormId,rentalFormName);
                String villaHouseStandardId=resultSet.getString("villahousestandardid");
                String villaHouseStandardName=resultSet.getString("villahousestandardname");
                VillaHouseStandard villaHouseStandard=new VillaHouseStandard(villaHouseStandardId,villaHouseStandardName);
                String otherConvenientVillaHouse=resultSet.getString("otherconvenientvillahouse");
                int pollVillaArea=resultSet.getInt("pollvillaarea");
                int numberFloorVillaHouse=resultSet.getInt("numberfloorvillahouse");
                String freeServiceRoom=resultSet.getString("freeserviceroom");
               service=new Service(serviceId,serviceType,serviceName,useArea,rentalPrice,maxPerson,rentalForm,villaHouseStandard,otherConvenientVillaHouse,pollVillaArea,numberFloorVillaHouse,freeServiceRoom);

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
            preparedStatement.setString(5,service.getRentalForm().getRentalFormId());
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
            preparedStatement.setString(5,service.getRentalForm().getRentalFormId());
            preparedStatement.setString(6,service.getVillaHouseStandard().getVillaHouseStandardId());
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
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        try {
            preparedStatement=connection.prepareStatement("update services set servicename=?,usearea=?,rentalprice=?,maxperson=?,rentalformid=?,villahousestandardid=?,otherconvenientvillahouse=?,pollvillaarea=?,numberfloorvillahouse=? where serviceid=?");
            preparedStatement.setString(1,service.getServiceName());
            preparedStatement.setInt(2,service.getUseArea());
            preparedStatement.setInt(3,service.getRentalPrice());
            preparedStatement.setInt(4,service.getMaxPerson());
            preparedStatement.setString(5,service.getRentalForm().getRentalFormId());
            preparedStatement.setString(6,service.getVillaHouseStandard().getVillaHouseStandardId());
            preparedStatement.setString(7,service.getOtherConvenientVillaHouse());
            preparedStatement.setInt(8,service.getPollVillaArea());
            preparedStatement.setInt(9,service.getNumberFloorVillaHouse());
            preparedStatement.setString(10,serviceId);
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
    public String findNameService(String serviceId) {
        Connection connection=DBConnection.getConnection();
        CallableStatement callableStatement=null;
        String serviceName="";
        try {
            callableStatement=connection.prepareCall("call findNameService(?,?)");
            callableStatement.setString(1,serviceId);
            callableStatement.executeQuery();
            serviceName=callableStatement.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return serviceName;
    }


}
