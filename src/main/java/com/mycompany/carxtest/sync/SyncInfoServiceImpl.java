/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.sync;

import com.mycompany.carxtest.user.User;
import com.mycompany.carxtest.user.UserRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kamalion
 */
@Service("syncInfoService")
public class SyncInfoServiceImpl implements SyncInfoService {

    @Autowired
    private SyncInfoRepository syncRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(String userId, SyncInfo info) {
        
        Optional<User> findedUser = userRepository.findById(userId);
        if(!findedUser.isPresent()){
            User newUser = new User();
            newUser.setUserName(userId);
            info.setUser(newUser);
            info.setNewUser(true);
            userRepository.save(newUser);
        }else{
            info.setUser(findedUser.get());
        }
        
        info.setDate(new Date());
            

        syncRepository.save(info);
    }

    @Override
    public List<Object> getCountOfNewUsers(Date begin, Date end) {
        return syncRepository.getCountOfNewUsers(begin, end);
    }


}
