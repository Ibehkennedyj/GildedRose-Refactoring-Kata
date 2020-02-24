package com.gildedrose;

import com.gildedrose.decorators.ItemDecorator;

class GildedRose {

    private ItemDecorator[] wrappedItems;

    public GildedRose(ItemDecorator[] wrappedItems) {
        this.wrappedItems = wrappedItems;
    }

    public void updateQuality() {
        for (ItemDecorator item : wrappedItems)
            item.updateQuality();
    }
}