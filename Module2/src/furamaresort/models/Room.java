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
