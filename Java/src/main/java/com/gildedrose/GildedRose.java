package com.gildedrose;

import com.gildedrose.itemtypes.ItemWrapper;

class GildedRose {

    private ItemWrapper[] wrappedItems;

    public GildedRose(ItemWrapper[] wrappedItems) {
        this.wrappedItems = wrappedItems;
    }

    public void updateQuality() {
        for (ItemWrapper item : wrappedItems)
            item.updateQuality();
    }
}