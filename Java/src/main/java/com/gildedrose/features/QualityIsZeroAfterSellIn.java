package com.gildedrose.features;

import com.gildedrose.decorators.BasicItemDecorator;

public interface QualityIsZeroAfterSellIn extends BasicItemDecorator {

    @Override
    default void updateQualityAfterSellin() {
        getItem().quality = 0;
    }

}
