package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user ", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int userId) {
        entityManager.remove(entityManager.find(User.class, userId));
    }

    @Override
    public void updateUser(int id, User userUpdate) {
        User user = getUser(id);
        user.setName(userUpdate.getName());
        user.setSurname(userUpdate.getSurname());
        entityManager.merge(user);
    }

    @Override
    public User getUser(int userId) {
        return entityManager.find(User.class, userId);
    }
}
