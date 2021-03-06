package core.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

public interface CoreMapper<T> {

    int insert(T t);

    int update(T t);

    int delete(int id);

    T getOne(int id);

    int getCount(T t);

    List<T> getList(T t);

    List<T> getPageList(T t);
}
