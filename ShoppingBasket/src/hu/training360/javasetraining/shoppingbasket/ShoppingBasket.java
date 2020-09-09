package hu.training360.javasetraining.shoppingbasket;

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

        for(Item i : basket.getItems()){
            res = res + i.getNettoPrice();
        }

        return res;
    }

    public Double sumTaxValue(){

        Double res = 0.0d;

        for(Item i : basket.getItems()){
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

        Item mostExpensive = basket.getItems().get(0);

        for(int i = 1; i <= basket.getItems().size() - 1; i++){

            if(basket.getItems().get(i).getNettoPrice() > mostExpensive.getNettoPrice()){
                mostExpensive = basket.getItems().get(i);
            }
        }

        basket.removeItem(mostExpensive.getBarCode());
    }

}
