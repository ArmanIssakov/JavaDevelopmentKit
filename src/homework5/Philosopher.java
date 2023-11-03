package homework5;

public class Philosopher extends Thread{

    private String name;

    private Food obj;
    private boolean ateFood;

    private int countAte = 0;

    public int getCountAte() {
        return countAte;
    }

    public Philosopher(String name, Food obj, boolean ateFood) {
        this.name = name;
        this.obj = obj;
        this.ateFood = ateFood;
        start();
    }

    public void setAteFood(boolean ateFood) {
        this.ateFood = ateFood;
    }

    @Override
    public void run() {
            while (obj.count != 0) {
                if (ateFood) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + "\tпоел");
                    ateFood = false;
                    obj.count--;
                    countAte++;
                } else {
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ateFood = true;
                    System.out.println(name + "\tразмышляет\t");
                }
            }
        System.out.println(name + " поел " + countAte + " раза");


    }
}
