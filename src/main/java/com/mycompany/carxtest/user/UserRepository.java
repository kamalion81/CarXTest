/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.user;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kamalion
 */
public interface UserRepository extends CrudRepository<User, String>{
    
}
