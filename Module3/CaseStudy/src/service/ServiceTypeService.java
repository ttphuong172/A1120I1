package service;

import model.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> selectAllServiceType();
    ServiceType findServiceTypeById(String serviceTypeId);
}
