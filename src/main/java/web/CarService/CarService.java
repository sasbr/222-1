package web.CarService;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars(Integer count);
}
