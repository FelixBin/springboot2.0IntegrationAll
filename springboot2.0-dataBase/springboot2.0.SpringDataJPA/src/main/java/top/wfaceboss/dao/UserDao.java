package top.wfaceboss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import top.wfaceboss.entity.UserEntity;
@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer> {

}
