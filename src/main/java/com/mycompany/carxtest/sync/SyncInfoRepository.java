/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.sync;

import com.mycompany.carxtest.user.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Kamalion
 */
public interface SyncInfoRepository extends CrudRepository<SyncInfo, Integer>{
    
    @Query("SELECT COUNT(u), u.country FROM SyncInfo u "
            + "WHERE u.newUser = true "
            + "AND u.date BETWEEN :dateBegin AND :dateEnd "
            + "GROUP BY u.country")
    public List<Object> getCountOfNewUsers(@Param(value = "dateBegin") Date dateBegin, @Param(value = "dateEnd") Date dateEnd);
    
    @Query("SELECT a.user"
            + " FROM SyncInfo a"
            + " WHERE (SELECT COUNT(*)"
            + " FROM SyncInfo b"
            + " WHERE b.country = a.country AND b.money >= a.money) <= :count"
            + " ORDER BY a.country, a.money DESC")
    public List<User> getUsersWithMostMoney(@Param(value = "count") int count);
        
    
    
    
    
}
