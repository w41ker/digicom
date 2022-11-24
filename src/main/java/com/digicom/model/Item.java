package com.digicom.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger id;

    @Column(name = "item_name")
    String name;

    @Column(name = "item_description")
    String description;

    @Column(name = "item_price")
    BigDecimal price;

    @Column(name = "total_item_quantity")
    Integer totalItemQuantity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_category_id", nullable = false)
    Category category;

}
