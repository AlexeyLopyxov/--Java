package HomeWork2;

public class main {
    public static void main(String[] args) {
        
        Cat[] cats = {
            new Cat("Barsik", 5),
            new Cat("Murzik", 10),
            new Cat("Vasilyi", 15),
        };
        Plate plate = new Plate(22);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сытый: " + cat.isFullness());
        }

        plate.increaseFood(10);
        plate.info();
    }
}
