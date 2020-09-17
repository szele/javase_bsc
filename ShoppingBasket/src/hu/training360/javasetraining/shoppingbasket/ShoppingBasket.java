package hu.training360.javasetraining.shoppingbasket;

import java.util.List;

public class ShoppingBasket {


    private Basket basket = new Basket();


    public void addItem(Item item){
        basket.addItem(item);
    }

    public void removeItem(String barCode){
        basket.removeItem(barCode);
    }

    public Double sumNettoPrice(){

        Double res = 0.0d;

        for(Item i : basket.sbItems()){
            res = res + i.getNettoPrice();
        }

        return res;
    }

    public Double sumTaxValue(){

        Double res = 0.0d;

        for(Item i : basket.sbItems()){
            res += i.getTaxAmount();
        }

        return res;
    }

    public Double sumBruttoPrice(){
        final double sumBruttoPriceOfBacket = sumNettoPrice() + sumTaxValue();
        return sumBruttoPriceOfBacket;
    }

    public void checkout(){
        basket.clearBasket();
    }

    public void removeMostExpensiveItemNet(){

        Item mostExpensive = basket.sbItems().get(0);

        for(int i = 1; i <= basket.sbItems().size() - 1; i++){

            if(basket.sbItems().get(i).getNettoPrice() > mostExpensive.getNettoPrice()){
                mostExpensive = basket.sbItems().get(i);
            }
        }

        basket.removeItem(mostExpensive.getBarCode());

    }
    public List<Item> getBasketItems(){
    return basket.sbItems();
    }
}
