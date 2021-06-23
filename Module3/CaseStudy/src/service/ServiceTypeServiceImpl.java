package service;

import model.ServiceType;
import repository.ServiceTypeRepository;
import repository.ServiceTypeRepositoryImpl;

import java.util.List;

public class ServiceTypeServiceImpl implements ServiceTypeService {
    ServiceTypeRepository serviceTypeRepository =new ServiceTypeRepositoryImpl();
    @Override
    public List<ServiceType> selectAllServiceType() {
        return serviceTypeRepository.selectAllServiceType();
    }

    @Override
    public ServiceType findServiceTypeById(String serviceTypeId) {
        return serviceTypeRepository.findServiceTypeById(serviceTypeId);
    }
}
