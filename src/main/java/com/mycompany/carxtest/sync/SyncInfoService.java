/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.sync;

import com.mycompany.carxtest.user.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kamalion
 */
public interface SyncInfoService {
    
    void save(String userId, SyncInfo info);
    
    List<Object> getCountOfNewUsers(Date begin, Date end);
    
    List<User> getUsersWithMostMoney(int count);
    
    
}
