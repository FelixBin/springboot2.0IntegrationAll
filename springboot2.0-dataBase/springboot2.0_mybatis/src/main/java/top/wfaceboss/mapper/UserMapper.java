package top.wfaceboss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import top.wfaceboss.entity.User;

public interface UserMapper {
	@Select("SELECT * FROM USER WHERE NAME=#{name}")
	List<User> findByName(@Param("name") String name);
	
	@Insert("INSERT INTO USER(NAME,AGE) VALUES(#{name},#{age})")
	int insert(@Param("name") String name,@Param("age") Integer age);
}
