package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();

            carList.add(new Car("BMW", "m5", 2021));
            carList.add(new Car("BMW", "x7", 2023));
            carList.add(new Car("Mercedes-Benz", "S", 2018));
            carList.add(new Car("Land Rover", "Range Rover", 2020));
            carList.add(new Car("Volkswagen", "Touareg", 2017));

        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
