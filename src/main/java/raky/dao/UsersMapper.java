package raky.dao;

import core.dao.CoreMapper;
import org.apache.ibatis.annotations.*;
import raky.entity.Users;

@Mapper
public interface UsersMapper extends CoreMapper<Users> {

}
