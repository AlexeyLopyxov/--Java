package HomeWork2;

public class Plate {
    
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            System.out.println();
            System.out.println("Error! Enter the correct amount of food");
            System.out.println();
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }
}
