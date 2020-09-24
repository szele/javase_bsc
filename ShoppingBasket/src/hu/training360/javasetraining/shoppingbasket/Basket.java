package hu.training360.javasetraining.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {


   private final List<Item> elements = new ArrayList<>();


    public void addItem(Item i){

       this.elements.add(i);
    }

   public void removeItem(String barCode){

       elements.removeIf(i -> i.getBarCode().equals(barCode));
   }

   public void clearBasket(){

       elements.clear();
   }

   public List<Item> sbItems(){
       return new ArrayList<>(elements);
   }
}
