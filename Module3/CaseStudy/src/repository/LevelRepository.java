package repository;

import model.Level;

import java.util.List;

public interface LevelRepository {
    List<Level> selectAllLevel();
    Level findLevelById(String levelId);
}
