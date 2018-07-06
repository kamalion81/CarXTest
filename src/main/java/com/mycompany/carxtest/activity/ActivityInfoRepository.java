/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carxtest.activity;

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
public interface ActivityInfoRepository extends CrudRepository<ActivityInfo, Integer>{
    
    @Query("SELECT a.activity, a.date "
            + "FROM ActivityInfo a "
            + "WHERE a.user = :user "
            + "AND a.date BETWEEN :dateBegin AND :dateEnd ORDER BY a.date")
    public List<Object> getActivity(@Param(value = "user") User user, 
                                    @Param(value = "dateBegin") Date dateBegin, 
                                    @Param(value = "dateEnd") Date dateEnd);
    
    
}
