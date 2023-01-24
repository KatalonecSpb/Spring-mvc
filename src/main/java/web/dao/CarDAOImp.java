package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO {
    private final List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Toyota", "Camry", 2008));
        carList.add(new Car("Hyundai", "Solaris", 2010));
        carList.add(new Car("Kia", "Rio", 2012));
        carList.add(new Car("Honda", "Civic", 2014));
        carList.add(new Car("Mitsubishi", "Lancer", 2016));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
