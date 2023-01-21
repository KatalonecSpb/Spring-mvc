package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Toyota", "Camry", 2008));
            carList.add(new Car("Hyundai", "Solaris", 2010));
            carList.add(new Car("Kia", "Rio", 2012));
            carList.add(new Car("Honda", "Civic", 2014));
            carList.add(new Car("Mitsubishi", "Lancer", 2016));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
