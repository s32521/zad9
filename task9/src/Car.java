public class Car implements Comparable<Car> {
    private String nazwa;
    private int rok;
    public Car(String nazwa, int rok) {
        this.nazwa = nazwa;
        this.rok = rok;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRok() {
        return rok;
    }

    public int compareTo(Car car) {
        return Integer.compare(this.rok, car.getRok());
    }

    public String toString() {
        return nazwa + ", " + rok;
    }
}
