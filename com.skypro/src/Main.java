public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        System.out.println("Conditional operator");
    }

    //task1
    public static void task1() {
        System.out.println("Task_1");
        int age = 18;
        if (age>=18) {
            System.out.println("Happy birthday!!!");
        } else {
            System.out.println("Sorry, you need to wait a bit");
        }
        System.out.println(" ");
    }

    //task2
    public static void task2() {
        System.out.println("Task_2");
        int age = 18;
        if (age>=7&&age<=17) {
            System.out.println("Welcome to school, student!");
        }
        if (age>=18&&age<=23) {
            System.out.println("Time to go to university, student!");
        }
        if (age>=24) {
            System.out.println("Welcome to life, it's time to go to work!");
        }
        System.out.println(" ");
    }

    //task3
    public static void task3() {
        System.out.println("Task_3");
        int quantityPassengers = 30;
        int capacityTrain = 102;
        int seatPlace = 60;
        int standPlace = capacityTrain-seatPlace;
        if (quantityPassengers>102) {
            System.out.println("No Place!");
        }
        if (quantityPassengers<=60) {
            System.out.println("Seating place free");
        }
        if (quantityPassengers>60&&quantityPassengers<102) {
            System.out.println("Only standing place!");
        }
        System.out.println(" ");
    }
}