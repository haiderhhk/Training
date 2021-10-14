package com.dcb_micro_user.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcb_micro_user.app.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

}
