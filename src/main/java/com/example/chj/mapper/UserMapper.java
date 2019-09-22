package com.example.chj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.chj.bean.User;

@Mapper
public interface UserMapper {

	@Select("select * form user")
	public List<User> findAll();
	
	@Select("select * from user where id = #{id}")
	public User findById(Integer id);
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	public int addUser(User u);
	
	@Delete("delete from user where id = #{id}")
	public int deleteUserByid(Integer id);
	
	@Update("update user set name = #{name},age = #{age} where id = #{id}")
	public int updateUser(User u);
	
	
}
