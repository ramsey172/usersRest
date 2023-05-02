package com.example.users_rest.service;

import com.example.users_rest.DAO.UserDao;
import com.example.users_rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public User findById(long id){
        return userDao.findById(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public void save(User user){
        userDao.save(user);
    }

    public void update(User user){
        userDao.update(user);
    }

    public User deleteById(long id){
        return userDao.deleteById(id);
    }
}
