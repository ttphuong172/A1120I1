package service;

import model.AttachService;
import repository.AttachServiceRepository;
import repository.AttachServiceRepositoryImpl;

import java.util.List;

public class AttachServiceServiceImpl implements AttachServiceService {
    AttachServiceRepository attachServiceRepository=new AttachServiceRepositoryImpl();
    @Override
    public List<AttachService> selectAllAttachService() {
        return attachServiceRepository.selectAllAttachService();
    }
}
