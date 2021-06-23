package service;

import model.Diploma;
import repository.DiplomaRepository;
import repository.DiplomaRepositoryImpl;

import java.util.List;

public class DiplomaServiceImpl implements DiplomaService {
    DiplomaRepository diplomaRepository=new DiplomaRepositoryImpl();
    @Override
    public List<Diploma> selectAllDiploma() {
        return diplomaRepository.selectAllDiploma();
    }

    @Override
    public Diploma findDiplomaById(String diplomaId) {
        return diplomaRepository.findDiplomaById(diplomaId);
    }
}
