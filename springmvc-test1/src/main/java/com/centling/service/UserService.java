package com.centling.service;

import com.centling.dao.UserDAO;
import com.centling.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangpu on 2015-10-5.
 */
@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    private UserDAO userDAO;

    public UserEntity getByUsername(String username){
        String stHQL = " FROM UserEntity WHERE username=?";
        List<UserEntity> userEntityList = (List<UserEntity>)userDAO.getListByHQL(0,0,stHQL,new String[]{username});
        if (userEntityList!=null &&userEntityList.size()>0){
            return userEntityList.get(0);
        }
        return null;
    }
}
