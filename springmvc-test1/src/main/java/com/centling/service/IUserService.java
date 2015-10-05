package com.centling.service;

import com.centling.entity.UserEntity;

/**
 * Created by zhangpu on 2015-10-5.
 */
public interface IUserService {

    public UserEntity getByUsername(String username);
}
