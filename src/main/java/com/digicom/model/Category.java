package com.digicom.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "lu_category")
@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    Integer id;

    @Column(name = "category_name")
    String name;

    @Column(name = "category_description")
    String description;

    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", fetch = FetchType.LAZY)
    List<Item> categoryItems = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getCategoryItems() {
        return categoryItems;
    }

    public void setCategoryItems(List<Item> categoryItems) {
        this.categoryItems = categoryItems;
    }
}
