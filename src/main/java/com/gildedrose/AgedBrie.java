package com.gildedrose;

/**
 * @author 孙继峰
 * @since 2020/2/5
 */
public class AgedBrie extends Item {
    @Override
    public void update() {
        if (this.quality < 50) {
            this.quality++;
        }

        this.sellIn--;

        if (this.sellIn < 0) {
            if (this.quality < 50) {
                this.quality++;
            }
        }
    }

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }
}
