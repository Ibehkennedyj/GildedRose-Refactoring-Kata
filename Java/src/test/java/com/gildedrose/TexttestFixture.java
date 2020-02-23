package com.gildedrose;

import com.gildedrose.decorators.ItemDecorator;
import com.gildedrose.itemtypes.AgedBrie;
import com.gildedrose.itemtypes.BackstagePasses;
import com.gildedrose.itemtypes.LegendaryItem;
import com.gildedrose.itemtypes.RegularItem;

public class TexttestFixture {

    public static String existingRun(int days) {
        StringBuilder builder = new StringBuilder();
        builder.append("OMGHAI!").append("\n");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < days; i++) {
            builder.append("-------- day ").append(i).append(" --------").append("\n");
            builder.append("name, sellIn, quality").append("\n");
            for (Item item : items) {
                builder.append(item).append("\n");
            }
            builder.append("\n");
            app.updateQuality();
        }

        return builder.toString();
    }

    public static String newRun(int days) {
        StringBuilder builder = new StringBuilder();
        builder.append("OMGHAI!").append("\n");

        ItemDecorator[] items = new ItemDecorator[]{
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
            app.newUpdateQuality();
        }

        return builder.toString();
    }
}
