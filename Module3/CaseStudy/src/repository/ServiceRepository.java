package repository;

import model.Service;

import java.util.List;

public interface ServiceRepository {
    List<Service> selectAllService();
    void remove(String serviceId);
    void saveRoom(Service service);
    void saveHouse(Service service);
    void saveVilla(Service service);
    Service findServiceById(String serviceId);
    void updateRoom(String serviceId,Service service);
    void updateHouse(String serviceId,Service service);
    void updateVilla(String serviceId,Service service);
}
