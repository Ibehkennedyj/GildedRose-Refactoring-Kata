package com.gildedrose;

import com.gildedrose.decorators.ItemDecorator;
import com.gildedrose.itemtypes.*;

public class TexttestFixture {

    public static String newRun(int days) {
        StringBuilder builder = new StringBuilder();
        builder.append("OMGHAI!").append("\n");

        ItemWrapper[] items = new ItemWrapper[]{
                new RegularItem(new Item("+5 Dexterity Vest", 10, 20)), //
                new AgedBrie(new Item("Aged Brie", 2, 0)), //
                new RegularItem(new Item("Elixir of the Mongoose", 5, 7)), //
                new LegendaryItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80)), //
                new LegendaryItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80)),
                new BackstagePasses(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)),
                new BackstagePasses(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)),
                new BackstagePasses(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)),
                // this conjured item does not work properly yet
                new RegularItem(new Item("Conjured Mana Cake", 3, 6))};

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < days; i++) {
            builder.append("-------- day ").append(i).append(" --------").append("\n");
            builder.append("name, sellIn, quality").append("\n");
            for (ItemDecorator decorator : items) {
                builder.append(decorator.getItem()).append("\n");
            }
            builder.append("\n");
            app.updateQuality();
        }

        return builder.toString();
    }
}
