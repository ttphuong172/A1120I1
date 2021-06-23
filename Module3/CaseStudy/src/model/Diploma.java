package model;

public class Diploma {
    private String diplomaId;
    private String diplomaName;

    public Diploma(String diplomaId, String diplomaName) {
        this.diplomaId = diplomaId;
        this.diplomaName = diplomaName;
    }

    public String getDiplomaId() {
        return diplomaId;
    }

    public void setDiplomaId(String diplomaId) {
        this.diplomaId = diplomaId;
    }

    public String getDiplomaName() {
        return diplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }
}
