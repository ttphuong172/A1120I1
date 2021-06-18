package service;

import model.Service;
import repository.ServiceRepository;
import repository.ServiceRepositoryImpl;

import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    ServiceRepository serviceRepository = new ServiceRepositoryImpl();
    @Override
    public List<Service> selectAllService() {
        return serviceRepository.selectAllService();
    }

    @Override
    public void remove(String serviceId) {
        serviceRepository.remove(serviceId);
    }

    @Override
    public void saveRoom(Service service) {
        serviceRepository.saveRoom(service);
    }

    @Override
    public void saveHouse(Service service) {
        serviceRepository.saveHouse(service);
    }

    @Override
    public void saveVilla(Service service) {
        serviceRepository.saveVilla(service);
    }

    @Override
    public Service findServiceById(String serviceId) {
        return serviceRepository.findServiceById(serviceId);
    }

    @Override
    public void updateRoom(String serviceId, Service service) {
        serviceRepository.updateRoom(serviceId,service);
    }

    @Override
    public void updateHouse(String serviceId, Service service) {
        serviceRepository.updateHouse(serviceId,service);
    }
}
