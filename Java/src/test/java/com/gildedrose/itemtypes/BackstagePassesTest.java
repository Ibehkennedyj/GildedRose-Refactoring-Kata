package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.decorators.ItemDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassesTest {

    public static final String BACKSTAGE_PASS = "Backstage Pass";

    @Test
    void item_quality_increase_by_1_when_sell_in_is_more_than_10() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 11, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(11, wrappedItem.getItem().quality),
                () -> assertEquals(10, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_increase_by_2_when_sell_in_is_equal_to_10() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 10, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(12, wrappedItem.getItem().quality),
                () -> assertEquals(9, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_increase_by_2_when_sell_in_is_less_than_10_and_more_than_5() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 9, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(12, wrappedItem.getItem().quality),
                () -> assertEquals(8, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_increase_by_3_when_sell_in_is_equal_to_5() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 5, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(13, wrappedItem.getItem().quality),
                () -> assertEquals(4, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_increase_by_3_when_sell_in_is_less_than_5_and_more_than_0() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 3, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(13, wrappedItem.getItem().quality),
                () -> assertEquals(2, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_drops_to_zero_on_day_0() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 0, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(0, wrappedItem.getItem().quality),
                () -> assertEquals(-1, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_drops_to_zero_after_day_0() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, -18, 10));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(0, wrappedItem.getItem().quality),
                () -> assertEquals(-19, wrappedItem.getItem().sellIn)
        );
    }

    @Test
    void item_quality_is_never_above_50() {
        ItemDecorator wrappedItem = new BackstagePasses(new Item(BACKSTAGE_PASS, 2, 49));
        wrappedItem.updateQuality();
        assertAll(
                () -> assertEquals(50, wrappedItem.getItem().quality),
                () -> assertEquals(1, wrappedItem.getItem().sellIn)
        );
    }
}