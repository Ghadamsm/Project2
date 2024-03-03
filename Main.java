
public class Main {
    public static void main(String[] args) {




//        Route
        Route route1 = new Route("Start1" , "destination1" , 20.0);
        Route route2 = new Route("Start2" , "destination2" , 30.0);



//        Car
        Car car1 = new Car("car1" , route1 , 4);
        Car car2 = new Car("car2" , route2 , 0);



//        Passenger
        Passengers[] passengers = new Passengers[2];
        passengers[0] = new Subscribers_passengers("Subscribers1" , "123" , car1 , 0);
        passengers[1] = new Non_Subscribers_passengers("Non_Subscribers1" , "456" , car2 , 0 , true);





    for (Passengers passenger : passengers) {
        if (passenger instanceof Subscribers_passengers) {

            passenger.reserveCar(car1);

        } else {
            passenger.reserveCar(car2);
        }
        passenger.displayInformation();
    }



    }
}