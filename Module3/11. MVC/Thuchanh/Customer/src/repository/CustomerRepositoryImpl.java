package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private static List<Customer> customerList;
    static {
        customerList=new ArrayList<>();
        customerList.add(new Customer(1,"Trần Thanh Phương","ttphuong172@gmail.com","Đà Nẵng"));
        customerList.add(new Customer(2,"Võ Trung Trọng","trongvt@gmail.com","Đà Nẵng"));
        customerList.add(new Customer(3,"Lê Văn Ngàn","nganlv@gmail.com","Đà Nẵng"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
      customerList.add(customer);
    }

    @Override
    public Customer findById(int id) {
        for (int i=0;i<customerList.size();i++){
            if (customerList.get(i).getId()==id){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
        for (int i=0;i<customerList.size();i++){
            if(customerList.get(i).getId()==id){
               customerList.set(i,customer);
            }
        }
    }

    @Override
    public void remove(int id) {
//        for (int i=0;i<customerList.size();i++){
//            if (customerList.get(i).getId()==id){
//                customerList.remove(i);
//            }
//        }
        Iterator<Customer> iterator=customerList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId()==id){
                iterator.remove();
            }
        }

    }
}
