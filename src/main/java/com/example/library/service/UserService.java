package com.example.library.service;

import com.example.library.entity.User;

import java.util.List;

public interface UserService {
    /**
     *添加注册用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();

    /**
     * 按照添加查询用户
     * @param user
     * @return
     */
    public List<User> queryUser(User user);

    /**
     * 根据id批量删除用户
     * @param id
     * @return
     */
    public int deleteUser(String[] id);

    /**
     * 登录功能
     * @param userNumber
     * @param userPassword
     * @return
     */
    public User login(String userNumber, String userPassword);
    /**
     * 更新用户信息
     */
    public int updateUser(User user);
}
