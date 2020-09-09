package hu.training360.javasetraining.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {


   private List<Item> items = new ArrayList<>();


   public void addItem(Item item){

       items.add(item);
   }

   public void removeItem(String barCode){

       for(Item i : items){

           if(i.getBarCode().equals(barCode)){
               items.remove(i);
           }
       }
   }

   public void clearBasket(){

       items.clear();
   }

   public List<Item> getItems(){
       return new ArrayList<>(items);
   }
}
