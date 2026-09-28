import java.util.Scanner;

public class BodaFarecalculator{
public static void main(String[] args) {
    final double BASE_FARE = 2000;
    final double RATE_PER_KM = 500;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the distance to be travelled in km:");
    double distance = input.nextDouble();
    double totalFare = BASE_FARE + (RATE_PER_KM * distance);
    System.out.println("Distance travelled is "+totalFare +"km");


    input.close();
}

}
