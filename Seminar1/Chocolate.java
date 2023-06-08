package Seminar1;

public class Chocolate extends Product {
    private String typeOfChocolate;
    private int percOfCocoa;
    private double calories;
    
    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }
    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }
    public int getPercOfCocoa() {
        return percOfCocoa;
    }
    public void setPercOfCocoa(int percOfCocoa) {
        this.percOfCocoa = percOfCocoa;
    }
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public Chocolate(String brand, String name, double price, String typeOfChocolate, int percOfCocoa,
            double calories) {
        super(brand, name, price);
        this.typeOfChocolate = typeOfChocolate;
        this.percOfCocoa = percOfCocoa;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %f - [тип: %s] - [процент какао: %s] - [калории: %s]", brand, name, price, typeOfChocolate, percOfCocoa, calories);
    }
}
