package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void test() {
        CombinationApprovals.verifyAllCombinations(
                this::update,
                new String[]{"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"},
                new Integer[]{-1, 0, 1, 10, 11, 12},
                new Integer[]{-1, 0, 1, 49, 50, 51}
        );
    }

    Item update(String name, int sellIn, int quality) {
        Item[] items = new Item[]{Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return items[0];
    }

}
