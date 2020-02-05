package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }

    public void update() {
        if (this.quality > 0) {
            this.quality--;
        }

        this.sellIn--;

        if (this.sellIn < 0) {
            if (this.quality > 0) {
                this.quality--;
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
