package com.example.users_rest.DAO;

import com.example.users_rest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    User deleteById(Long id);
}
