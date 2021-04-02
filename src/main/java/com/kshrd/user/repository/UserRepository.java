package com.kshrd.user.repository;

import com.kshrd.user.repository.dto.UserDto;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    @Insert("INSERT INTO tbl_users (user_id, user_name, user_pwd, type)" +
            "#{user_id}, #{user_name}, #{user_pwd}, #{type},")
    boolean insert(UserDto user);

}
