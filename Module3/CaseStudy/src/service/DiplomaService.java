package service;

import model.Department;
import model.Diploma;

import java.util.List;

public interface DiplomaService {
    List<Diploma> selectAllDiploma();
    Diploma findDiplomaById(String diplomaId);
}
