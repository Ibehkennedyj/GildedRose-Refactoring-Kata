package com.gildedrose;

import com.gildedrose.decorators.ItemDecorator;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void new_method_should_compile() {
        ItemDecorator[] wrappedItems = new ItemDecorator[]{};
        GildedRose app = new GildedRose(wrappedItems);
        app.updateQuality();
    }

}
