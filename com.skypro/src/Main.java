public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

        System.out.println("Homework_3 Complete");
    }

    //task1
    public static void task1() {
        System.out.println("Task_1");
        int age = 18;
        if (age>=18) {
            System.out.println("Happy birthday!!!");
        }
        if (age<18) {
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

    //task4
    public static void task4() {
        System.out.println("Task_4");
        int age = 18;
        if (age>=18) {
            System.out.println("Happy birthday!!!");
        } else {
            System.out.println("Sorry, you need to wait a bit");
        }
        System.out.println(" ");
    }

    //task5
    public static void task5() {
        System.out.println("Task_5");
        int age = 18;
        if (age>=7&&age<=17) {
            System.out.println("Welcome to school, student!");
        } else if (age>=18&&age<=23) {
            System.out.println("Time to go to university, student!");
        } else if (age>=24){
            System.out.println("Welcome to life, it's time to go to work!");
        }
        System.out.println(" ");
    }

    //task6
    public static void task6() {
        System.out.println("Task_6");
        int quantityPassengers = 70;
        int capacityTrain = 102;
        int seatPlace = 60;
        int standPlace = capacityTrain-seatPlace;
        if (quantityPassengers<=60) {
            System.out.println("Seating place free");
        } else if (quantityPassengers>60&&quantityPassengers<102) {
            System.out.println("Only standing place!");
        } else {
            System.out.println("No Place!");
        }
        System.out.println(" ");
    }
}