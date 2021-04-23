package furamaresort.models;

public class Villa extends Services {
    private String standarRoomVilla;
    private String convenientOtherVilla;
    private int areaPoll;
    private int numberFloorVilla;

    public Villa(String id, String serviceName, int areaUse, int rentalCost, int maxPerson, String rentalForm, String standarRoom, String convenientOther, int areaPoll, int numberFloor) {
        super(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm);
        this.standarRoomVilla = standarRoom;
        this.convenientOtherVilla = convenientOther;
        this.areaPoll = areaPoll;
        this.numberFloorVilla = numberFloor;
    }

    public Villa() {
    }

    public String getStandarRoomVilla() {
        return standarRoomVilla;
    }

    public void setStandarRoomVilla(String standarRoomVilla) {
        this.standarRoomVilla = standarRoomVilla;
    }

    public String getConvenientOtherVilla() {
        return convenientOtherVilla;
    }

    public void setConvenientOtherVilla(String convenientOtherVilla) {
        this.convenientOtherVilla = convenientOtherVilla;
    }

    public int getAreaPoll() {
        return areaPoll;
    }

    public void setAreaPoll(int areaPoll) {
        this.areaPoll = areaPoll;
    }

    public int getNumberFloorVilla() {
        return numberFloorVilla;
    }

    public void setNumberFloorVilla(int numberFloorVilla) {
        this.numberFloorVilla = numberFloorVilla;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", areaUse=" + super.getAreaUse() +
                ", rentalCost=" + super.getRentalCost() +
                ", maxPerson=" + super.getMaxPerson() +
                ", rentalForm='" + super.getRentalForm() + '\'' +
                ",standarRoomVilla='" + standarRoomVilla + '\'' +
                ", convenientOtherVilla='" + convenientOtherVilla + '\'' +
                ", areaPoll=" + areaPoll +
                ", numberFloor=" + numberFloorVilla +
                '}';
    }

    @Override
    public int compareTo(Services o) {
        if (this.getServiceName().equals(o.getServiceName())){
            return 0;
        } else if(this.getServiceName().compareTo(o.getServiceName())<0){
            return -1;
        } else{
            return 1;
        }

    }
}
