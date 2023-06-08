package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Спроектировать ряд классов аппарата, который будт продавать продукты
        // Машина по продаже товара и товары. Машина может выдавать множество товаров.

        Product product1 = new Product("000 Луч вода", "Бутылка с водой", 100.12); // Product - конструктор
        // product1.brand = "000 Луч вода";
        // product1.name = "Бутылка с водой";
        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 26, 1.5);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 35, 1);
        Product bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 200, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 170, 2);

        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 38, 1.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product chocolate1 = new Chocolate("ООО Pepsi Ko", "Alpen Gold", 56, "Молочный", 20, 276);
        Product chocolate2 = new Chocolate("ООО Pepsi Ko", "Milka", 93, "Горький", 90, 100);
        Product chocolate3 = new Chocolate("ООО Pepsi Ko", "Kit Kat", 62, "Молочный", 5, 389);
        Product chocolate4 = new Chocolate("ООО Золушка", "Воздушный", 40, "Горький", 75, 96);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfMilk1);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);        


        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате!");
        }

        Chocolate chocolateResult = vendingMachine.getChocolate("Молочный");
        if (chocolateResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада в автомате нет!" );
        }

        Chocolate chocolateResult1 = vendingMachine.getChocolate1(100);
        if (chocolateResult1 != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult1.displayInfo());
        }
        else {
            System.out.println("Такого шоколада в автомате нет!" );
        }

        

    }
}
