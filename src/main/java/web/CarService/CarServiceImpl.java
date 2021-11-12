package web.CarService;


import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getAllCars(Integer count) {
        return carDao.getAllCars().stream().limit(count)
                .collect(Collectors.toList());
    }
    }
