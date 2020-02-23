package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.features.QualityChangeRateDoubleAfterSellin;
import com.gildedrose.features.QualityDecreases;

public class RegularItem extends ItemWrapper implements QualityDecreases, QualityChangeRateDoubleAfterSellin {

    public RegularItem(Item item) {
        super(item);
    }

    @Override
    public int getDecreaseRate() {
        return 1;
    }

}
