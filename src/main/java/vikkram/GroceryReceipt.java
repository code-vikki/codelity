package vikkram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroceryReceipt extends GroceryReceiptBase {


    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
        super(prices, discounts);
    }

    @Override
    public List<Grocery> Calculate(List<Node> shoppingList) {

        Map<String, Double> prices = getPrices();
        Map<String, Integer> discounts = getDiscounts();
        List<Grocery> groceryList = new ArrayList();
        for (Node node : shoppingList) {


            Double priceOfFruit = prices.get(node.fruit);
            double totalPrice = node.count * priceOfFruit;
            Integer discount = discounts.get(node.fruit);
            if (discount != null) {
                double discountInPercent = discount/100;
                totalPrice = totalPrice - (totalPrice * discount);
            }
            if (checkIfExist(groceryList, node, totalPrice)) {
                continue;
            } else {
                Grocery grocery = new Grocery(node.fruit, priceOfFruit, totalPrice);
                groceryList.add(grocery);
            }
        }
        return groceryList;
    }

    private boolean checkIfExist(List<Grocery> groceryList, Node node, double totalPrice) {
        for (Grocery grocery : groceryList) {
            if (grocery.fruit.equals(node.fruit)) {
                grocery.total = totalPrice;
                return true;
            }
        }
        return false;
    }


}
