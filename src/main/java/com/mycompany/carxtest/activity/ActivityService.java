/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.activity;

import com.mycompany.carxtest.user.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kamalion
 */
public interface ActivityService {
    
    void save(String userId, int activity);
    public List<Object> getActivity(User user, Date begin, Date end);
    
}
