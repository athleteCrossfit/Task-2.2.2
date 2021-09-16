package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW"));
        carList.add(new Car("MERCEDES-BENZ"));
        carList.add(new Car("LAMBORGHINI"));
        carList.add(new Car("JAGUAR"));
        carList.add(new Car("RANGE-ROVER"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
