package com.gildedrose;

import com.gildedrose.decorators.ItemDecorator;
import com.gildedrose.itemtypes.ItemWrapper;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void new_method_should_compile() {
        ItemDecorator[] wrappedItems = new ItemWrapper[]{};
        GildedRose app = new GildedRose(wrappedItems);
        app.newUpdateQuality();
    }

}
