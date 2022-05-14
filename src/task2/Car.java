package task2;

import java.util.Arrays;
import java.util.Comparator;

class Car implements Comparable<Car> {

    private String type;
    private int yearOfProduct;
    private int engineCapacity;

    public Car(String type, int yearOfProduct, int engineCapacity) {
        this.type = type;
        this.yearOfProduct = yearOfProduct;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car car) {
        return this.yearOfProduct - car.getYearOfProduct();
    }

    @Override
    public String toString() {
        return String.format("\n[type = %s, year of product = %d, engineCapacity = %d]", this.type, this.yearOfProduct, this.engineCapacity);
    }

    public static void printCarOrderedByYearOfProduct(Car[] cars) {
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}
