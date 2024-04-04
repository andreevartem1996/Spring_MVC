package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {
    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car(1, "BMW", 6));
        carList.add(new Car(2, "Mazda", 3));
        carList.add(new Car(3, "Lada", 2));
        carList.add(new Car(4, "Kia", 5));
        carList.add(new Car(5, "Audi", 8));
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < number && i < carList.size(); i++) {
            result.add(carList.get(i));
        }
        return result;
    }

}
