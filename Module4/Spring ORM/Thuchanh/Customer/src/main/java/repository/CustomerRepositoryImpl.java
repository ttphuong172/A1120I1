package repository;

import model.Customer;

import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> selectAllCustomer() {
        TypedQuery<Customer> query =BaseRepository.entityManager.createQuery("select c from customer c",Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findCustomerById(int id) {
        TypedQuery<Customer> query=BaseRepository.entityManager.createQuery("select c from customer c where c.id=:id",Customer.class);
        query.setParameter("id",id);
        try{
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }


    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        TypedQuery<Customer> query=BaseRepository.entityManager.createQuery("select c from customer c where c.name like:name",Customer.class);
        query.setParameter("name","%"+name+"%");
        try{
            return query.getResultList();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void saveCustomer(Customer customer) {
        EntityTransaction entityTransaction=BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        if (customer.getId() != 0) {
            BaseRepository.entityManager.merge(customer);
        } else {
            BaseRepository.entityManager.persist(customer);
        }
        entityTransaction.commit();
    }

    @Override
    public void removeCustomer(int id) {
        Customer customer=findCustomerById(id);
        if (customer != null) {
            BaseRepository.entityManager.remove(customer);
        }
    }
}
