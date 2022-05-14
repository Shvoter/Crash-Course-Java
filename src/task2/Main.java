package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //*****************************PART1****************************************************************************

        /*System.out.println("Please, enter the number of month: ");
        daysInMonth(scanner.next());*/

        //*****************************PART2****************************************************************************

        /*System.out.println("Please, enter exactly TEN integers in the first line: ");
        playWithNumbers(scanner.nextLine());*/

        //*****************************PART3****************************************************************************

        /*System.out.println("Please, enter exactly FIVE integers in the first line: ");
        String input = scanner.nextLine();
        findPositionOfSecondPositiveNumber(input);
        findPositionOfMinimum(input);*/

        //*****************************PART4****************************************************************************

        /*int product  = 0;
        while (scanner.hasNext("\\d+")) {
            product += scanner.nextInt();
        }
        System.out.printf("Product of integers are %d\n", product);*/

        //*****************************PART5****************************************************************************

        /*System.out.println("Please, input year of product for four cars each on new line: ");
        Car[] cars = {
                new Car("Car1", scanner.nextInt(), 100),
                new Car("Car2", scanner.nextInt(), 200),
                new Car("Car3", scanner.nextInt(), 300),
                new Car("Car4", scanner.nextInt(), 400),
        };
        Car.printCarOrderedByYearOfProduct(cars);*/
    }

    public static void daysInMonth(String input) {
        final int[] numberDaysInEachMonth= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (input.matches("[1-9][0-2]?")) {
            System.out.printf("%d days in chosen month.", numberDaysInEachMonth[Integer.parseInt(input) - 1]);
        } else {
            System.out.println("Incorrect input!");
        }
    }

    public static void playWithNumbers(String input) {
        String[] arrayOfNumbers = input.split(" ");
        int numberOfPositives = 0;
        int sumFirstFive = 0;
        int productLastFive = 1;
        for (int i = 0; i < arrayOfNumbers.length; i++) {

            if (arrayOfNumbers[i].matches("-?\\d+") && arrayOfNumbers.length == 10) {
                int currentValue = Integer.parseInt(arrayOfNumbers[i]);

                numberOfPositives = currentValue > 0? numberOfPositives + 1 : numberOfPositives;

                sumFirstFive = i <= 4 ? sumFirstFive + currentValue: sumFirstFive;

                productLastFive = i > 4 ? productLastFive * currentValue : productLastFive;
            } else {
                System.out.println("Incorrect input!");
                return;
            }
        }
        if (numberOfPositives == 10) {
            System.out.printf("You wrote positive numbers. Sum the first five equal: %d\n", sumFirstFive);
        } else {
            System.out.printf("You wrote not only positive numbers. Product the last five equal: %d\n", productLastFive);
        }
    }
    public static void findPositionOfSecondPositiveNumber(String input) {
        String[] arrayOfNumbers = input.split(" ");
        int counter = 0;
        String massage = "Current enumeration contain less than two positive integers.";

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i].matches("-?\\d+") && arrayOfNumbers.length == 5) {
                counter = Integer.parseInt(arrayOfNumbers[i]) > 0 ? counter + 1 : counter;
                if (counter == 2) {
                    massage = String.format("Position of second positive value is %d", i);
                }
            } else {
                massage = "Incorrect input!";
            }
        }
        System.out.println(massage);
    }

    public static void findPositionOfMinimum(String input) {
        String [] arrayOfNumbers = input.split(" ");
        int minimum = Integer.MAX_VALUE;
        int indexOfMinimum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i].matches("-?\\d+") && arrayOfNumbers.length == 5) {
                int currentValue = Integer.parseInt(arrayOfNumbers[i]);

                if (minimum > currentValue) {
                    minimum = currentValue;
                    indexOfMinimum = i;
                }
            } else {
                System.out.println("Incorrect input!");
                return;
            }
        }
        System.out.printf("Position of minimum value is %d", indexOfMinimum);
    }
}
