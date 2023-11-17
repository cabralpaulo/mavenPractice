package week7;

public class Main {
    public static void main(String[] args) {
        Pool como = new Pool("Como Park", 25);
        Pool ymca = new Pool ("YMCA Downtown", 20);
        Pool edina = new Pool ("Edina", 50);

        double totalDistance = como.distanceForLaps(5);
        System.out.println(totalDistance);

        double edinaDistance = edina.distanceForLaps(12);
        System.out.println(edinaDistance);

        System.out.println(ymca);
        System.out.println(edina);
    }
}
