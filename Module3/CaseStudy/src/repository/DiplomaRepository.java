package repository;

import model.Diploma;

import java.util.List;

public interface DiplomaRepository {
    List<Diploma> selectAllDiploma();
    Diploma findDiplomaById(String diplomaId);

}
