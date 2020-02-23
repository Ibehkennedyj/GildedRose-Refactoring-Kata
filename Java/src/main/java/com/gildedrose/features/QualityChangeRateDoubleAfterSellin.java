package com.gildedrose.features;

import com.gildedrose.decorators.BasicItemDecorator;

public interface QualityChangeRateDoubleAfterSellin extends BasicItemDecorator {

    @Override
    default void updateQualityAfterSellin() {
        updateQualityBeforeSellin();
        updateQualityBeforeSellin();
    }

}
