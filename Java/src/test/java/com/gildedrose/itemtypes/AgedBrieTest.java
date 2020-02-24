package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.decorators.ItemDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    public static final String AGED_BRIE = "Aged Brie";

    @Test
    void quality_increases_by_1_when_sell_in_is_more_than_0() {
        Item item = new Item(AGED_BRIE, 5, 5);
        ItemDecorator wrappedItem = new AgedBrie(item);

        wrappedItem.updateQuality();

        assertEquals(6, wrappedItem.getItem().quality);
    }

    @Test
    void quality_increases_by_2_when_sell_in_is_less_than_0() {
        Item item = new Item(AGED_BRIE, -5, 5);
        ItemDecorator wrappedItem = new AgedBrie(item);

        wrappedItem.updateQuality();

        assertEquals(7, wrappedItem.getItem().quality);
    }

    @Test
    void quality_is_never_above_50() {
        Item item = new Item(AGED_BRIE, -5, 50);
        ItemDecorator wrappedItem = new AgedBrie(item);

        wrappedItem.updateQuality();

        assertEquals(50, wrappedItem.getItem().quality);
    }
}