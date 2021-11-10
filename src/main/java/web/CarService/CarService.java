package web.CarService;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private  static final List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car(1, "WV", 2020));
        listCar.add(new Car(2, "Mers", 2021));
        listCar.add(new Car(3, "Audi", 2019));
        listCar.add(new Car(4, "Volvo", 2018));
        listCar.add(new Car(5, "Ford", 2017));
    }


    public static List<Car> getCountCars(Integer count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }

    public static List<Car> getAllCars() {
        return listCar;
    }

}

