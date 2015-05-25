package it.reti.futureti.GildedRose;

public class Item {

    public String name = null;
    public int sellIn = 0;
    public int quality = 0;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}