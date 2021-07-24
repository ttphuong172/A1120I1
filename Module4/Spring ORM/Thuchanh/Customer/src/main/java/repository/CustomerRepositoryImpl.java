package repository;

import model.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> selectAllCustomer() {
        String queryStr = "SELECT c FROM customer AS c";
        TypedQuery<Customer> query = BaseRepository.entityManager.createQuery(queryStr, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findCustomerById(int id) {
        return BaseRepository.entityManager.find(Customer.class, id);
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        String queryStr = "SELECT c FROM customer AS c WHERE c.name like :name";
        TypedQuery<Customer> query = BaseRepository.entityManager.createQuery(queryStr, Customer.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }


    @Override
    public void updateCustomer(Customer customer) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(customer);
        entityTransaction.commit();

    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session=null;
        Transaction transaction=null;
        try{
            session = BaseRepository.sessionFactory.openSession();
            transaction=session.beginTransaction();
            session.save(customer);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void removeCustomer(Customer customer) {
        Session session=null;
        Transaction transaction=null;
        try{
            session = BaseRepository.sessionFactory.openSession();
            transaction=session.beginTransaction();
            session.remove(customer);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
