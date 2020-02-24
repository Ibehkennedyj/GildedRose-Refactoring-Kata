package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.features.QualityChangeRateDoubleAfterSellin;
import com.gildedrose.features.QualityDecreases;

public class ConjuredItem extends ItemWrapper implements QualityDecreases, QualityChangeRateDoubleAfterSellin {

    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public int getDecreaseRate() {
        return 2;
    }

}
