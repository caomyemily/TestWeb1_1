package com.test.dao.impl;

import com.test.dao.IUsersDao;
import com.test.pojo.Users;
import com.test.util.DbHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersDao implements IUsersDao {

    @Override
    public int addUsers(Users users) {

        //添加用户到数据库
        String sql="insert into users values(?,?,?)";
        List<Object> paramList=new ArrayList<Object>();
        paramList.add(users.getId());
        paramList.add(users.getName());
        paramList.add(users.getAge());

        DbHelper dbHelper=new DbHelper();
        return dbHelper.executeUpdate(sql,paramList);
    }

    @Override
    public List<Map<String, Object>> queryUsers() {

        //查询数据库
        String sql="select * from users";
        DbHelper dbHelper=new DbHelper();
        List<Map<String,Object>> list=dbHelper.executeQuery(sql,null);
        return list;

    }
}
