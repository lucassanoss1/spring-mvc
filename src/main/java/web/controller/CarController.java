package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servis.CarServisImpl;

import java.util.List;

@Controller
public class CarController {

    private final CarServisImpl getCars;

    public CarController(CarServisImpl getCars) {
        this.getCars = getCars;
    }

    @GetMapping(value = "/cars")
    public String printCarsTable(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = getCars.getCarsByCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
