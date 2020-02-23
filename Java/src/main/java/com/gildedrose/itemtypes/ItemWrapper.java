package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.decorators.ItemDecorator;

public abstract class ItemWrapper implements ItemDecorator {

    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    @Override
    public Item getItem() {
        return item;
    }

}
