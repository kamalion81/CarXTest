/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest;

import com.mycompany.carxtest.activity.ActivityService;
import com.mycompany.carxtest.sync.SyncInfoService;
import com.mycompany.carxtest.user.User;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Kamalion
 */
@Controller
public class UserStatisticsController {
    
    @Autowired
    private SyncInfoService syncService;
    
    @Autowired
    private ActivityService activityService;
    
    public List<Object> getCountOfNewUsers(Date begin, Date end){
        return syncService.getCountOfNewUsers(begin, end);
    }
    
    public List<Object> getActivity(User user, Date begin, Date end){
        return activityService.getActivity(user, begin, end);
    }
    
    public List<User> getUsersWithMostMoney(int count){
        return syncService.getUsersWithMostMoney(count);
    }
    
    
    
    
    
    
    
    
}
