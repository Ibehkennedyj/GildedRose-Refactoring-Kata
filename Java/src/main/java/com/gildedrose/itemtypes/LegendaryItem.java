package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.decorators.ItemDecorator;

public class LegendaryItem extends ItemWrapper implements ItemDecorator {

    public LegendaryItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {

    }

}
