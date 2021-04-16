package furamaresort.models;

public class House extends Services{
    private String standarRoomHouse;
    private String convenientOtherHouse;
    private int numberFloorHouse;

    public House(String id, String serviceName, int areaUse, int rentalCost, int maxPerson, String rentalForm, String standarRoomHouse, String convenientOtherHouse, int numberFloorHouse) {
        super(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm);
        this.standarRoomHouse = standarRoomHouse;
        this.convenientOtherHouse = convenientOtherHouse;
        this.numberFloorHouse = numberFloorHouse;
    }

    public House() {
    }

    public String getStandarRoomHouse() {
        return standarRoomHouse;
    }

    public void setStandarRoomHouse(String standarRoomHouse) {
        this.standarRoomHouse = standarRoomHouse;
    }

    public String getConvenientOtherHouse() {
        return convenientOtherHouse;
    }

    public void setConvenientOtherHouse(String convenientOtherHouse) {
        this.convenientOtherHouse = convenientOtherHouse;
    }

    public int getNumberFloorHouse() {
        return numberFloorHouse;
    }

    public void setNumberFloorHouse(int numberFloorHouse) {
        this.numberFloorHouse = numberFloorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", areaUse=" + super.getAreaUse() +
                ", rentalCost=" + super.getRentalCost() +
                ", maxPerson=" + super.getMaxPerson() +
                ", rentalForm='" + super.getRentalForm() + '\'' +
                ", standarRoomHouse='" + standarRoomHouse + '\'' +
                ", convenientOtherVilla='" + convenientOtherHouse + '\'' +
                ", numberFloor=" + numberFloorHouse +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }


}
