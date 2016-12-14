package com.springapp.mvc.service.Impl;

import com.springapp.mvc.beans.User;
import com.springapp.mvc.dao.TryDao;
import com.springapp.mvc.service.IserieTry01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 * Created by f4o823hv9 on 2016/12/10.
 */
@Service(value = "srieTry01")
public class SerieTry01Impl implements IserieTry01{

    @Autowired
    private TryDao tryDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUser(){
        return tryDao.getTryTable();
    }

    @Override
    public void addUserList(List<User> userList){
        tryDao.addUser(userList);
    }

}
