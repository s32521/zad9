import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    static int[] tablica = new int[10];
    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return liczba;
    }

    public static void fillArray() {
        for (int i = 0; i < tablica.length; i++) {
            try{
                tablica[i]= readNumber();
            } catch (NegativeNumberException e) {
                tablica[i] = 0;
                System.out.println(e.getMessage());
            }
        }

        for (int liczba : tablica){
            System.out.println(liczba + ", ");
        }
    }


    public static <NumberArrayHandler> void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes",2020));
        cars.add(new Car("BMW",2000));
        cars.add(new Car("Volvo",2006));
        cars.add(new Car("Opel",2013));
        cars.add(new Car("Honda",2014));
        cars.add(new Car("Porsche",2024));
        cars.add(new Car("Audi",2025));
        cars.add(new Car("Mini Cooper",2011));
        cars.add(new Car("Mercedes",2009));
        cars.add(new Car("BMW",2010));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }

        //---------------------------zadanie 4--------------------------
        System.out.println("----------------------Zadanie 4 ------------------------------");
        fillArray();

}
}