/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.activity;

import com.mycompany.carxtest.user.User;
import com.mycompany.carxtest.user.UserRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kamalion
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService{
    
    @Autowired
    private ActivityInfoRepository repository;
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(String userId, int activity) {
        
        ActivityInfo info =  new ActivityInfo(activity, new Date());
        User findedUser = userRepository.findById(userId).get();
        info.setUser(findedUser);
        
        repository.save(info);
    }

    @Override
    public List<Object> getActivity(User user, Date begin, Date end) {
        return repository.getActivity(user, begin, end);
    }
    
}
