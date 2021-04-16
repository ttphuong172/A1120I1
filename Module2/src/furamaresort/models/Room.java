package furamaresort.models;

public class Room extends Services {
    private String freeService;

    public Room(String id, String serviceName, int areaUse, int rentalCost, int maxPerson, String rentalForm, String freeService) {
        super(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm);
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + super.getId() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", areaUse=" + super.getAreaUse() +
                ", rentalCost=" + super.getRentalCost() +
                ", maxPerson=" + super.getMaxPerson() +
                ", rentalForm='" + super.getRentalForm() + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

}
