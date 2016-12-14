package com.springapp.mvc.service;

import com.springapp.mvc.beans.User;

import java.util.List;

/**
 * Userservice接口
 *
 * @author f4o823hv9
 * @since 2016/12/11.
 */
public interface IserieTry01 {

    /**
     * 查询所有的User
     *
     * @return List<User>
     */
    List<User> getAllUser();

    /**
     * 添加User组
     *
     * @param userList  List
     */
    void addUserList(List<User> userList);
}
