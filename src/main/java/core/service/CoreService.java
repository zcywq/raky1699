package core.service;

import java.util.List;

public interface CoreService<T> {

	int insert(T t);

	int update(T t);

	int delete(int id);

	T getOne(int id);

	int getCount(T t);

	List<T> getList(T t);

	List<T> getPageList(T t);
	
}
