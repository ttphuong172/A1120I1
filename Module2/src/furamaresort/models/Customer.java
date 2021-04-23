package furamaresort.models;

public class Customer {
    private String name;
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services service;

    public Customer(String name, String birthday, String idCard, String phoneNumber, String email, String customerType, String address, Services service) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
    }

    public Customer(String name, String birthday, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", id='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", service=" + service +
                '}';
    }
    public void showInfor(){
        System.out.println(this.toString());
    }

}
