package com.digicom.controller;

import com.digicom.model.Item;
import com.digicom.service.ItemsService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
@Getter
@Setter
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/")
    public List<Item> getAllItems(){
        return itemsService.getAllItems();
    }

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hii";
    }

    @RequestMapping("/advanceSearch")
    public List<Item> doAdvanceSearch(@RequestParam String name) {
        return itemsService.getItemsByName(name);
    }
}
