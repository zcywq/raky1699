package raky.train.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import raky.train.dao.UsersMapper;
import raky.train.entity.Users;
import raky.train.service.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Transactional
    public int insert(Users users) {
        return usersMapper.insert(users);
    }

    @Override
    @Transactional
    public int update(Users users) {
        return usersMapper.update(users);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return usersMapper.delete(id);
    }

    @Override
    public Users getOne(int id) {
        return usersMapper.getOne(id);
    }

    @Override
    public List<Users> getList(Users users) {
        return usersMapper.getList(users);
    }
}
