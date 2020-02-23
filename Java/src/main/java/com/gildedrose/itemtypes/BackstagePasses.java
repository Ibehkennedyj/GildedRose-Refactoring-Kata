package com.gildedrose.itemtypes;

import com.gildedrose.Item;
import com.gildedrose.RateMap;
import com.gildedrose.features.QualityChangeRateFluctuates;
import com.gildedrose.features.QualityIncreases;
import com.gildedrose.features.QualityIsZeroAfterSellIn;

import java.util.HashMap;

public class BackstagePasses extends ItemWrapper implements QualityChangeRateFluctuates, QualityIsZeroAfterSellIn, QualityIncreases {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public int getIncreaseRate() {
        return getCurrentRate();
    }

    @Override
    public RateMap getChangeRateMap() {
        return new RateMap(1, new HashMap<Integer, Integer>() {{
            put(10, 2);
            put(5, 3);
        }});
    }

}
