package com.demo.wasteless.wickhackwasteless.repo;

import com.demo.wasteless.wickhackwasteless.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
