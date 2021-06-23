package service;

import model.Level;
import repository.LevelRepository;
import repository.LevelRepositoryImpl;

import java.util.List;

public class LevelServiceImpl implements LevelService {
    LevelRepository levelRepository=new LevelRepositoryImpl();
    @Override
    public List<Level> selectAllLevel() {
        return levelRepository.selectAllLevel();
    }

    @Override
    public Level findLevelById(String levelId) {
        return levelRepository.findLevelById(levelId);
    }
}
