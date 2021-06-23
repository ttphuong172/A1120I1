package service;

import model.Level;

import java.util.List;

public interface LevelService {
    List<Level> selectAllLevel();
    Level findLevelById(String levelId);
}
