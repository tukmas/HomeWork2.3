public class Main {
    public static void main(String[] args) {
        car Car = new car("Lada", "Granta", 2017, "Россия", "Желтый", 147,
                1.7f,"Механическая", "Седан", "123213", 7);
        Car.information();
        Bus Bus = new Bus("Mercedes", "Sprinter", 2018, "Германия", "Синий", 174,
                3500,6,"Максимальная");
        Bus.information();
    }
}