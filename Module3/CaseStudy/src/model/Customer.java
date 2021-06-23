package model;

public class Customer {
    private int customerId;
    private String customerName;
    private String birthday;
    private int idCard;
    private int phoneNumber;
    private String email;
    private CustomerType customerType;
    //private String customertypeid;
    private String address;

    public Customer(int customerId, String customerName, String birthday, int idCard, int phoneNumber, String email, CustomerType customerType, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String customerName, String birthday, int idCard, int phoneNumber, String email, CustomerType customerType, String address) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", customerType=" + customerType +
                ", address='" + address + '\'' +
                '}';
    }
}