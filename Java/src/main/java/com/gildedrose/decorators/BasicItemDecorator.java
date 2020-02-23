package com.gildedrose.decorators;

public interface BasicItemDecorator extends ItemDecorator {

    int MIN_ITEM_QUALITY = 0;
    int MAX_ITEM_QUALITY = 50;

    default boolean sellInDateHasPassed() {
        return getItem().sellIn < 0;
    }

    default void ensureQualityIsNeverNegative() {
        if (getItem().quality < MIN_ITEM_QUALITY) getItem().quality = MIN_ITEM_QUALITY;
    }

    default void ensureQualityIsNeverAbove50() {
        if (getItem().quality > MAX_ITEM_QUALITY) getItem().quality = MAX_ITEM_QUALITY;
    }

    default void updateQuality() {
        getItem().sellIn -= 1;

        if (sellInDateHasPassed()) updateQualityAfterSellin();
        else updateQualityBeforeSellin();

        ensureQualityIsNeverNegative();
        ensureQualityIsNeverAbove50();
    }

    void updateQualityBeforeSellin();

    void updateQualityAfterSellin();

}
