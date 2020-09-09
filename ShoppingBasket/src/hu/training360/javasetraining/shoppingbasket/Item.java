package hu.training360.javasetraining.shoppingbasket;

import java.util.Objects;

public class Item {

    private String barCode;

    private Double nettoPrice;

    private Integer vatPercent;

    public Item(String barCode, Double nettoPrice, Integer vatPercent) {
        this.barCode = barCode;
        this.nettoPrice = nettoPrice;
        this.vatPercent = vatPercent;
    }

    public Double getTaxAmount(){
        return (nettoPrice * vatPercent) / 100;
    }

    public String getBarCode() {
        return barCode;
    }

    public Double getNettoPrice() {
        return nettoPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "barCode='" + barCode + '\'' +
                ", nettoPrice=" + nettoPrice +
                ", vatPercent=" + vatPercent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(barCode, item.barCode) &&
                Objects.equals(nettoPrice, item.nettoPrice) &&
                Objects.equals(vatPercent, item.vatPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, nettoPrice, vatPercent);
    }
}
