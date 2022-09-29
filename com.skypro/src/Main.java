public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

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

    //task7
    public static void task7() {
        System.out.println("Task_7");
        int age = 22;
        if (age>=2&&age<=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age>=7&&age<=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age>18&&age<24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age>=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходитьна работу");
        }
        System.out.println(" ");
    }

    //task8
    public static void task8() {
        System.out.println("Task_8");
        int age = 3;
        if (age<5) {
            System.out.println("Если ребенку " + age + " лет, он не может кататься на атракционе");
        }
        if (age>=5&&age<14) {
            System.out.println("Если ребенку " + age + " лет он может кататься на атракционе в сопровождении взрослого");
        } else if (age>14) {
            System.out.println("Если ребенку " + age + " лет он может кататься на атракционе без сопровождения взрослого");
        }
        System.out.println(" ");
    }

    //task9
    public static void task9() {
        System.out.println("Task_9");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one>two&&one>free) {
            System.out.println(one);
        }
        if (two>one&&two>free) {
            System.out.println(two);
        }else{
            System.out.println("Наибольшее число: " + free);
        }
        System.out.println(" ");
    }
}