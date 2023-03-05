package com.demo.wasteless.wickhackwasteless.repo;

import com.demo.wasteless.wickhackwasteless.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<Item, Integer> {
}
