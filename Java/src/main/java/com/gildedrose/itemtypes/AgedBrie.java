package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.features.QualityChangeRateDoubleAfterSellin;
import com.gildedrose.features.QualityIncreases;

public class AgedBrie extends ItemWrapper implements QualityIncreases, QualityChangeRateDoubleAfterSellin {

    public AgedBrie(Item item) {
        super(item);
    }

    public int getIncreaseRate() {
        return 1;
    }

}
