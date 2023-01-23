package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImp (CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
