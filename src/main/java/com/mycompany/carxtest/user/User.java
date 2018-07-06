/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.user;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Kamalion
 */
@Entity
public class User implements Serializable {


    private String userName;

    @Id
    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        userName = name;
    }


}
