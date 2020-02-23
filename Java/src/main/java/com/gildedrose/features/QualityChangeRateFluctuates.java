package com.gildedrose.features;

import com.gildedrose.RateMap;
import com.gildedrose.decorators.ItemDecorator;

public interface QualityChangeRateFluctuates extends ItemDecorator {

    RateMap getChangeRateMap();

    default int getCurrentRate() {
        return getChangeRateMap().getRateOf(getItem().sellIn);
    }

}
