package com.demo.wasteless.wickhackwasteless.repo;

import com.demo.wasteless.wickhackwasteless.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WastelessRepo extends JpaRepository<Item, Integer> {
}
