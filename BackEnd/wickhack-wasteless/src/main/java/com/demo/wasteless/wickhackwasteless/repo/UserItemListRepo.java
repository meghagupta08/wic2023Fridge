package com.demo.wasteless.wickhackwasteless.repo;

import com.demo.wasteless.wickhackwasteless.entity.UserItemList;
import com.demo.wasteless.wickhackwasteless.entity.UserItemListKey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserItemListRepo extends CrudRepository<UserItemList, UserItemListKey> {

    List<UserItemList> findByIdItemid(Integer itemId);

    List<UserItemList> findByIdUserid(Integer userId);
}
