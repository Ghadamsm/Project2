public class Non_Subscribers_passengers extends Passengers{

    private boolean discountCoupon ;




    Non_Subscribers_passengers(String name, String ID,Car reservedCar , double tripCost , boolean discountCoupon) {
        super(name, ID , reservedCar , tripCost);
        this.discountCoupon = discountCoupon ;

    }



    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }





    @Override
    void reserveCar(Car car) {

        if (car.getMaxCapacity() == 0 ){
            System.out.println("Maximum capacity of the car is ZERO");
        }


        setReservedCar(car);
        if (discountCoupon){
            setTripCost(car.getRoute().getPrice() - (car.getRoute().getPrice() * 0.1 ));
        } else {
            setTripCost(car.getRoute().getPrice());
        }
    }

    @Override
    void displayInformation() {
        System.out.println("Subscriber Passenger : " + getName());
        System.out.println("ID : " + getID());
        System.out.println("Reserved Car code : " + getReservedCar().getCode());
        System.out.println("Trip Cost : " + getTripCost());

    }

}
