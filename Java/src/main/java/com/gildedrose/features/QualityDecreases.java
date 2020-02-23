package com.gildedrose.features;

import com.gildedrose.decorators.BasicItemDecorator;

public interface QualityDecreases extends BasicItemDecorator {

    @Override
    default void updateQualityBeforeSellin() {
        getItem().quality -= getDecreaseRate();
    }

    int getDecreaseRate();

}
