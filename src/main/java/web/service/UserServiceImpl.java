package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);

    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.userDao.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }
}
