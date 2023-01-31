package com.digicom.repository;

import com.digicom.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends CrudRepository<Item, Integer> {

    public List<Item> findByNameIgnoreCaseContaining(String name);

}
