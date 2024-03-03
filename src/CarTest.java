import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        /*filter cars based on the year, top speed...*/
        System.out.println(filterFastCars(carList));
        System.out.println(filterNewCars(carList));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("Fast Cars-Behaviour parameterization");
        System.out.println(filter(carList, new CarFastPredicate()));

        System.out.println("New Cars-Behaviour parameterization");
        System.out.println(filter(carList, new CarNewPredicate()));

        System.out.println("*-*-*-*-*-*-*-*For LAMBDA we need additional interface*-*-*-*-*-*-*-*-*");

        System.out.println("Fast Cars-Lambda");
        System.out.println(filter(carList, (Car car) ->{return car.getTopSpeed() > 160;}));

        System.out.println("New Cars-Lambda");
        System.out.println(filter(carList, car -> car.getYear() > 2015));

        System.out.println("------------------------------------");
        carList.forEach(car -> System.out.println(car));
    }





    private static List<Car> filterFastCars(List<Car> carList) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car eachCar : carList) {
            if (eachCar.getTopSpeed() > 160) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterNewCars(List<Car> carList) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car eachCar : carList) {
            if (eachCar.getYear() > 2015) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;
    }

    //fast cars, old cars. One method for both
    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;
    }
}
