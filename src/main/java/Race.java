public class Race {
    String carName = "";
    int distance = 0;


    void GetWinner (String carName,int carSpeed) {
        int distanceNewCar = 24 * carSpeed;
        if (distanceNewCar > distance){
            this.carName = carName;
            this.distance = distanceNewCar;
        }

    }
}