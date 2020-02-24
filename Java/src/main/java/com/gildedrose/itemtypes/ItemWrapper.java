package com.gildedrose.itemtypes;

import com.gildedrose.Item;

public class ItemWrapper {

    private final Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

}
