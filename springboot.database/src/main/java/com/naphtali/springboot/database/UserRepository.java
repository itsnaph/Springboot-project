package com.naphtali.springboot.database;

import org.springframework.data.repository.CrudRepository;
import com.naphtali.springboot.database.User;
public interface UserRepository extends CrudRepository<User,Integer> {
}
