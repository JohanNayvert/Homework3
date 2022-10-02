public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator Part_1");

        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task1_5();
        task1_6();
        task1_7();
        task1_8();
        task1_9();

        System.out.println("Homework_3 Part_1 Complete");

        System.out.println("Conditional operator Part_2");

        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task2_5();

        System.out.println("Homework_3 Part_2 Complete");
    }

    //task1_1
    public static void task1_1() {
        System.out.println("Task_1-1");
        int age = 18;
        if (age>=18) {
            System.out.println("Happy birthday!!!");
        }
        if (age<18) {
            System.out.println("Sorry, you need to wait a bit");
        }
        System.out.println(" ");
    }

    //task1_2
    public static void task1_2() {
        System.out.println("Task_1-2");
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

    //task1_3
    public static void task1_3() {
        System.out.println("Task_1-3");
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

    //task1_4
    public static void task1_4() {
        System.out.println("Task_1-4");
        int age = 18;
        if (age>=18) {
            System.out.println("Happy birthday!!!");
        } else {
            System.out.println("Sorry, you need to wait a bit");
        }
        System.out.println(" ");
    }

    //task1_5
    public static void task1_5() {
        System.out.println("Task_1-5");
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

    //task1_6
    public static void task1_6() {
        System.out.println("Task_1-6");
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

    //task1_7
    public static void task1_7() {
        System.out.println("Task_1-7");
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

    //task1_8
    public static void task1_8() {
        System.out.println("Task_1-8");
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

    //task1_9
    public static void task1_9() {
        System.out.println("Task_1-9");
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

    //task2_1
    public static void task2_1() {
        System.out.println("Task_2-1");
        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите приложение iOS по ссылке");
        } else {
            System.out.println("Установите приложение Android по ссылке");
        }
        System.out.println(" ");
    }

    //task2_2
    public static void task2_2() {
        System.out.println("Task_2-2");
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение iOS по ссылке");
            }
        }
        if (clientOS != 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение Android по ссылке");
            }
        }
        System.out.println(" ");
    }

    //task2_3
    public static void task2_3() {
        System.out.println("Task_2-3");
        int year = 2021;

        if (year % 4==0 && year % 100!=0 || year % 400==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(" ");
    }

    //task2_4
    public static void task2_4() {
        System.out.println("Task_2-4");
        int deliveryDistance = 95;
        int deliveryLongDistance = (deliveryDistance / 40) + 1;
        System.out.println("Потребуется дней: " + deliveryLongDistance);
        System.out.println(" ");
    }

    //task2_5
    public static void task2_5() {
        System.out.println("Task_2-5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь (Зима)");
                break;
            case 2:
                System.out.println("Февраль (Зима)");
                break;
            case 3:
                System.out.println("Март (Весна)");
                break;
            case 4:
                System.out.println("Апрель (Весна)");
                break;
            case 5:
                System.out.println("Май (Весна)");
                break;
            case 6:
                System.out.println("Июнь (Лето)");
                break;
            case 7:
                System.out.println("Июль (Лето)");
                break;
            case 8:
                System.out.println("Август (Лето)");
                break;
            case 9:
                System.out.println("Сентябрь (Осень)");
                break;
            case 10:
                System.out.println("Октябрь (Осень)");
                break;
            case 11:
                System.out.println("Ноябрь (Осень)");
                break;
            case 12:
                System.out.println("Декабрь (Зима)");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        System.out.println(" ");
    }
}

