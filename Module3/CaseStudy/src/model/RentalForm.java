package model;

public class RentalForm {
    private String rentalFormId;
    private String rentalFormName;

    public RentalForm(String rentalFormId, String rentalFormName) {
        this.rentalFormId = rentalFormId;
        this.rentalFormName = rentalFormName;
    }

    public String getRentalFormId() {
        return rentalFormId;
    }

    public void setRentalFormId(String rentalFormId) {
        this.rentalFormId = rentalFormId;
    }

    public String getRentalFormName() {
        return rentalFormName;
    }

    public void setRentalFormName(String rentalFormName) {
        this.rentalFormName = rentalFormName;
    }
}
