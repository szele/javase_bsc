package hu.training360.javasetraining.shoppingbasket;

public class Main {

    public static void main(String[] args) {

        ShoppingBasket sb = new ShoppingBasket();

        sb.addItem(new Item("bc-001",3243.23,27));
        sb.addItem(new Item("bc-002",3244.24,27));
        sb.addItem(new Item("bc-003",3245.25,27));


        Double sumTaxValue = sb.sumTaxValue();
        Double sumNetValue = sb.sumNettoPrice();
        Double sumBruttoValue = sb.sumBruttoPrice();
        sb.removeMostExpensiveItemNet();


        sb.checkout();
    }
}
