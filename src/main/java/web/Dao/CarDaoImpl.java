package web.Dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(1, "WV", 2020));
        listCar.add(new Car(2, "Mers", 2021));
        listCar.add(new Car(3, "Audi", 2019));
        listCar.add(new Car(4, "Volvo", 2018));
        listCar.add(new Car(5, "Ford", 2017));
        return listCar;
    }

}
