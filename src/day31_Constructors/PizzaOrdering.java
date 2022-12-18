package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>(Arrays.asList());

        for (int i = 0; i < 100; i++) {
            Pizza smallOrder = new Pizza('S', 2,3);
            Pizza mediumOrder = new Pizza('M', 3,4);
            Pizza largeOrder = new Pizza('L', 4,5);

            pizzas.addAll(Arrays.asList(smallOrder, mediumOrder,largeOrder));
        }

        System.out.println("Total number of pizzas: "+ pizzas.size());
        double totalPrice = 0;

        for (Pizza eachPizza : pizzas) {
            totalPrice += eachPizza.calcCost();
        }

        System.out.println("totalPrice = £" + totalPrice);










    }
}
