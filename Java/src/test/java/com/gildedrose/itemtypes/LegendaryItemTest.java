package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LegendaryItemTest {

    @Test
    void properties_of_legendary_item_stays_untouched() {
        ItemWrapper item = new LegendaryItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));

        item.updateQuality();

        assertAll(
                () -> assertEquals(80, item.getItem().quality, "quality"),
                () -> assertEquals(0, item.getItem().sellIn, "sellin")
        );
    }

}