package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TexttestFixture {
    public static String main(String... args) {
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

        int days = 20;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

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


    @Test
    void results_must_be_same_as_stored_first_run() throws IOException {
        String resultBeforeRefactoring = new String(readAllBytes(get("src/test/java/com/gildedrose/result_before_refactoring")))
                .replaceAll("\r", "");
        assertEquals(resultBeforeRefactoring, main());
    }

}
