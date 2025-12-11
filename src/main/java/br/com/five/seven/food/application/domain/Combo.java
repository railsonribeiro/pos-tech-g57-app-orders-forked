package br.com.five.seven.food.application.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Combo {

    private Long id;
    private List<Item> items = new ArrayList<>();

    public Combo() {
    }

    public Combo(Long id, List<Item> items) {
        this.id = id;
        this.items = items != null ? items : new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items != null ? items : new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {
        return items.stream()
                .map(Item::getTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
