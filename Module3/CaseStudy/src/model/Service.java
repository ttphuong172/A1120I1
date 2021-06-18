package model;

public class Service {
    private String serviceId;
    private String serviceTypeId;
    private String serviceName;
    private int useArea;
    private int rentalPrice;
    private int maxPerson;
    private String rentalFormId;
    private String villaHouseStandardId;
    private String otherConvenientVillaHouse;
    private int pollVillaArea;
    private int numberFloorVillaHouse;
    private String freeServiceRoom;

    public Service(String serviceId, String serviceTypeId, String serviceName, int useArea, int rentalPrice, int maxPerson, String rentalFormId, String villaHouseStandardId, String otherConvenientVillaHouse, int pollVillaArea, int numberFloorVillaHouse, String freeServiceRoom) {
        this.serviceId = serviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maxPerson = maxPerson;
        this.rentalFormId = rentalFormId;
        this.villaHouseStandardId = villaHouseStandardId;
        this.otherConvenientVillaHouse = otherConvenientVillaHouse;
        this.pollVillaArea = pollVillaArea;
        this.numberFloorVillaHouse = numberFloorVillaHouse;
        this.freeServiceRoom = freeServiceRoom;
    }
//Contructor Villa
    public Service(String serviceId, String serviceTypeId, String serviceName, int useArea, int rentalPrice, int maxPerson, String rentalFormId, String villaHouseStandardId, String otherConvenientVillaHouse, int pollVillaArea, int numberFloorVillaHouse) {
        this.serviceId = serviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maxPerson = maxPerson;
        this.rentalFormId = rentalFormId;
        this.villaHouseStandardId = villaHouseStandardId;
        this.otherConvenientVillaHouse = otherConvenientVillaHouse;
        this.pollVillaArea = pollVillaArea;
        this.numberFloorVillaHouse = numberFloorVillaHouse;
    }
//Contructor Room
    public Service(String serviceId, String serviceTypeId, String serviceName, int useArea, int rentalPrice, int maxPerson, String rentalFormId, String freeServiceRoom) {
        this.serviceId = serviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maxPerson = maxPerson;
        this.rentalFormId = rentalFormId;
        this.freeServiceRoom = freeServiceRoom;
    }
//Contructor House
    public Service(String serviceId, String serviceTypeId, String serviceName, int useArea, int rentalPrice, int maxPerson, String rentalFormId, String villaHouseStandardId, String otherConvenientVillaHouse, int numberFloorVillaHouse) {
        this.serviceId = serviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalPrice = rentalPrice;
        this.maxPerson = maxPerson;
        this.rentalFormId = rentalFormId;
        this.villaHouseStandardId = villaHouseStandardId;
        this.otherConvenientVillaHouse = otherConvenientVillaHouse;
        this.numberFloorVillaHouse = numberFloorVillaHouse;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalFormId() {
        return rentalFormId;
    }

    public void setRentalFormId(String rentalFormId) {
        this.rentalFormId = rentalFormId;
    }

    public String getVillaHouseStandardId() {
        return villaHouseStandardId;
    }

    public void setVillaHouseStandardId(String villaHouseStandardId) {
        this.villaHouseStandardId = villaHouseStandardId;
    }

    public String getOtherConvenientVillaHouse() {
        return otherConvenientVillaHouse;
    }

    public void setOtherConvenientVillaHouse(String otherConvenientVillaHouse) {
        this.otherConvenientVillaHouse = otherConvenientVillaHouse;
    }

    public int getPollVillaArea() {
        return pollVillaArea;
    }

    public void setPollVillaArea(int pollVillaArea) {
        this.pollVillaArea = pollVillaArea;
    }

    public int getNumberFloorVillaHouse() {
        return numberFloorVillaHouse;
    }

    public void setNumberFloorVillaHouse(int numberFloorVillaHouse) {
        this.numberFloorVillaHouse = numberFloorVillaHouse;
    }

    public String getFreeServiceRoom() {
        return freeServiceRoom;
    }

    public void setFreeServiceRoom(String freeServiceRoom) {
        this.freeServiceRoom = freeServiceRoom;
    }
}
