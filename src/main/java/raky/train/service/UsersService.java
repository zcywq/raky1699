package raky.train.service;

import raky.train.entity.Users;

import java.util.List;

public interface UsersService {

    int insert(Users users);

    int update(Users users);

    int delete(int id);

    Users getOne(int id);

    List<Users> getList(Users users);

}
