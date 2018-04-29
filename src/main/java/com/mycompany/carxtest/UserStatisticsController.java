/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest;

import com.mycompany.carxtest.activity.ActivityInfo;
import com.mycompany.carxtest.activity.ActivityService;
import com.mycompany.carxtest.sync.SyncInfo;
import com.mycompany.carxtest.sync.SyncInfoService;
import com.mycompany.carxtest.user.UserService;
import com.mycompany.carxtest.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kamalion
 */
@RestController
@RequestMapping(value = "/{userId}")
public class UserStatisticsController {

    @Autowired
    private UserService userService;

    @Autowired
    private SyncInfoService syncService;

    private ActivityService activityService;

    @RequestMapping(method = RequestMethod.GET)
    public User sendUserInfo(@PathVariable String userId) {
        return userService.findById(userId);
    }

    @RequestMapping(value = "/{activity}", method = RequestMethod.POST)
    public void getActivity(@PathVariable String userId, @PathVariable int activity) {
        activityService.save(userId, activity);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        userService.save(user);
        return user;

    }

    @RequestMapping(value = "/sync", method = RequestMethod.POST)
    public void getSyncInfo(@PathVariable String userId, @RequestBody SyncInfo info) {
        syncService.save(userId, info);

    }

}
