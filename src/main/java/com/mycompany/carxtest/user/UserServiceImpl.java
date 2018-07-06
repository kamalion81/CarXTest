/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.user;

import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kamalion
 */
@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    
    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
    
    
}
