import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scannerCar = new Scanner(System.in);

        Car[] cars = new Car[3];
        Race winner = new Race();
        for (int i = 0 ; i < 3 ; i++){
            System.out.println("Enter the car name№"+ (i+1) + ": ");
            String carName = scannerCar.next();
            int carSpeed;
            while (true) {
                System.out.println("Enter the car speed#" + (i+1) + ": ");

                try {
                    carSpeed = scannerCar.nextInt();
                    if (carSpeed <= 250 && carSpeed >= 0) {
                        break;
                    } else {
                        System.out.println("Speed is not correct, speed should be between (0 to 250): ");
                    }
                }catch (InputMismatchException e){
                    scannerCar.nextLine();
                    System.out.println("Invalid input. Please enter an integer value for speed.");

                }


            }
            cars[i] = new Car(carName, carSpeed);
            winner.GetWinner(cars[i].carName,cars[i].carSpeed);
        }
        System.out.println("The fastest car is: "+ winner.carName);

// тест посмотреть
 /*      for (Car car : cars) {

            System.out.println(car.carName +" " + car.carSpeed);
        }
*/

    }
}