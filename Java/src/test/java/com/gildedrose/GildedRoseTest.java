package com.gildedrose;

import com.gildedrose.itemtypes.ItemWrapper;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void new_method_should_compile() {
        ItemWrapper[] wrappedItems = new ItemWrapper[]{};
        GildedRose app = new GildedRose(wrappedItems);
        app.updateQuality();
    }

}
