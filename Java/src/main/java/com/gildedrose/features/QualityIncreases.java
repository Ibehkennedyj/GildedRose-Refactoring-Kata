package com.gildedrose.features;

import com.gildedrose.decorators.BasicItemDecorator;

public interface QualityIncreases extends BasicItemDecorator {

    @Override
    default void updateQualityBeforeSellin() {
        getItem().quality += getIncreaseRate();
    }

    int getIncreaseRate();

}
