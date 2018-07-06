/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.user;

import java.util.List;

/**
 *
 * @author Kamalion
 */
public interface UserService {
    
    List<User> findAll();
    User findById(String id);
    User save(User user);
    
}
