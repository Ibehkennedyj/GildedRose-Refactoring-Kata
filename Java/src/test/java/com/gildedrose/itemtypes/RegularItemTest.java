package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularItemTest {

    public static final String REGULAR_ITEM = "Regular Item";

    @Test
    void quality_reduces_by_1_when_sell_in_is_more_than_zero() {
        Item item = new Item(REGULAR_ITEM, 2, 2);
        ItemWrapper wrappedItem = new RegularItem(item);

        wrappedItem.updateQuality();

        assertEquals(1, wrappedItem.getItem().quality, "quality");
    }

    @Test
    void quality_reduces_by_2_when_sell_in_less_than_zero() {
        Item item = new Item(REGULAR_ITEM, -1, 4);
        ItemWrapper wrappedItem = new RegularItem(item);

        wrappedItem.updateQuality();

        assertEquals(2, wrappedItem.getItem().quality);
    }

    @Test
    void quality_is_never_less_than_zero() {
        Item item = new Item(REGULAR_ITEM, -1, 1);
        ItemWrapper wrappedItem = new RegularItem(item);

        wrappedItem.updateQuality();

        assertEquals(0, wrappedItem.getItem().quality);
    }
}