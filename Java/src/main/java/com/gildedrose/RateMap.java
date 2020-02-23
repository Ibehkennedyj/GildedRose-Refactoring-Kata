package com.gildedrose;

import java.util.Map;

public class RateMap {

    private final Map<Integer, Integer> rateMap;
    private int defaultRate;

    public RateMap(int defaultRate, Map<Integer, Integer> rateMap) {
        this.defaultRate = defaultRate;
        this.rateMap = rateMap;
    }

    public int getRateOf(int sellInDate) {
        return rateMap.keySet()
                .stream()
                .filter(integer -> sellInDate < integer)
                .min(Integer::compareTo)
                .map(rateMap::get)
                .orElse(defaultRate);
    }

}
