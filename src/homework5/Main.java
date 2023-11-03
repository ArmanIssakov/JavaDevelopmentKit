package homework5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Food food = new Food(15);
            Philosopher p1 = new Philosopher("A",food,true);
            Philosopher p2 = new Philosopher("B",food,true);
            Philosopher p3 = new Philosopher("C",food,true);
            Philosopher p4 = new Philosopher("D",food,true);
            Philosopher p5 = new Philosopher("E",food,true);
        }
    }

