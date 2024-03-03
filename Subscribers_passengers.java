public class Subscribers_passengers extends Passengers{


    Subscribers_passengers(String name, String ID , Car reservedCar , double tripCost) {
        super(name, ID , reservedCar , tripCost);
    }


    @Override
    void reserveCar(Car car) {
        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.5 );

    }

    @Override
    void displayInformation() {
        System.out.println("Subscriber Passenger : " + getName());
        System.out.println("ID : " + getID());
        System.out.println("Reserved Car code : " + getReservedCar().getCode());
        System.out.println("Trip Cost : " + getTripCost() + "\n\n");
    }
}
