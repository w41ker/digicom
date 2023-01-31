package com.digicom.service;

import com.digicom.model.Item;
import com.digicom.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsService {
    @Autowired
    private ItemsRepository itemsRepository;

    public List<Item> getAllItems() {
        List<Item> itemsList = new ArrayList<>();
        itemsRepository.findAll().iterator().forEachRemaining(e->itemsList.add(e));
        return itemsList;
    }

    public List<Item> getItemsByName(String name) {
        return itemsRepository.findByNameIgnoreCaseContaining(name);
    }
}
