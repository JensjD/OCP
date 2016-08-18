import java.util.*;
class RentalGeneric<T>{
    private List<T> rentalPool;
    private int maxNum;
    public RentalGeneric(int maxNum, List<T> rentalPool){
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }
    public T getRental(){
        //block until theres something available
        return rentalPool.get(0);
    }
    public void returnRental(T returnedThing){
        rentalPool.add(returnedThing);
    }
}
public class TestRental{
    public static void main(String[] args){
        //makes Cars for pool
        Car c1 = new Car();
        Car c2 = new Car();
        List<Car> carList = new ArrayList<Car>();
        carList.add(c1);
        carList.add(c2);

        RentalGeneric<Car> carRental = new RentalGeneric<Car>(2,carList);
        // now get a car out, and it wont need a cast
        Car carToRent = carRental.getRental();
        carRental.returnRental(carToRent);
        // can we stick something else in the original carList?
        carList.add(new Cat());
    }
}

class Car{}
class Cat{}
