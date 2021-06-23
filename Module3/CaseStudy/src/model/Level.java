package model;

public class Level {
    private String levelId;
    private String levelName;

    public Level(String levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
}
