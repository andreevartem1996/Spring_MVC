package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;


@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getTableCar(@RequestPart(required = false, value = "count") int count, Model model) {
        List<Car> cars = carServiceImp.getNumberOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}