package br.com.five.seven.food.adapter.out.relational.entity;

import java.util.ArrayList;
import java.util.List;

public class ComboEntity {
    private Long id;
    private List<ItemEntity> items;

    public ComboEntity() {
        this.items = new ArrayList<>();
    }

    public ComboEntity(Long id, List<ItemEntity> items) {
        this.id = id;
        this.items = items != null ? items : new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items != null ? items : new ArrayList<>();
    }
}

