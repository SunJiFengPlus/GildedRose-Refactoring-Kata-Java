package com.gildedrose;

/**
 * @author 孙继峰
 * @since 2020/2/5
 */
public class Backstage extends Item {
    @Override
    public void update() {
        if (this.quality < 50) {
            this.quality++;

            if (this.sellIn < 11) {
                if (this.quality < 50) {
                    this.quality++;
                }
            }

            if (this.sellIn < 6) {
                if (this.quality < 50) {
                    this.quality++;
                }
            }
        }

        this.sellIn--;

        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }

    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }
}
