package model;

public class AttachService {
    private String attachServiceId;
    private String attachServiceName;
    private String unit;
    private int price;

    public AttachService(String attachServiceId, String attachServiceName, String unit, int price) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.unit = unit;
        this.price = price;
    }

    public AttachService(String attachServiceId, String attachServiceName) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
    }

    public AttachService(String attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(String attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
