package EasyClassesAndObjects;

public class Task5 {
    private int minValue, maxValue, currentValue;

    public Task5(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
        if (maxValue < minValue) {
            int tmp = maxValue;
            maxValue = minValue;
            minValue = tmp;
        }
        if (currentValue < minValue) {
            this.currentValue = minValue;
        }
        if (currentValue > maxValue) {
            this.currentValue = maxValue;
        }
    }
    public Task5(int minValue, int maxValue) {
        this(minValue, maxValue, minValue);
        this.currentValue = minValue;
    }
    public Task5() {
        this(0, 16, 0);
    }
    public void inc() {
        currentValue++;
        if (currentValue > maxValue)
            this.currentValue = minValue;
    }
    public void dec() {
        currentValue--;
        if (currentValue < minValue)
            this.currentValue = maxValue;
    }
    public int value() {
        return this.currentValue;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5(5, 10, 6);
        Task5 task5_1 = new Task5(6, 4, 7);
        Task5 task5_2 = new Task5(5, 3);
        Task5 task5_3 = new Task5();
        System.out.println("First: " + task5.value());
        System.out.println("Second: " + task5_1.value());
        System.out.println("Third: " + task5_2.value());
       System.out.println("4th: " + task5_3.value());
        System.out.println();
        for (int i = 0; i < 4; ++i) {
            task5.inc();
            task5_1.inc();
            task5_2.inc();
            task5_3.inc();
        }
        System.out.println("First: " + task5.value());
        System.out.println("Second: " + task5_1.value());
        System.out.println("Third: " + task5_2.value());
        System.out.println("4th: " + task5_3.value());
        System.out.println();
        for (int i = 0; i < 40; ++i) {
            task5.dec();
            task5_1.dec();
            task5_2.dec();
            task5_3.dec();
        }
        System.out.println("First: " + task5.value());
        System.out.println("Second: " + task5_1.value());
        System.out.println("Third: " + task5_2.value());
        System.out.println("4th: " + task5_3.value());
        System.out.println();
    }
}
