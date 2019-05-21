package raky.train.dao;

import org.apache.ibatis.annotations.*;
import raky.train.entity.Users;

import java.util.List;
@Mapper
public interface UsersMapper {

    int insert(Users users);

    int update(Users users);

    int delete(int id);

    Users getOne(int id);

    List<Users> getList(Users users);

}
