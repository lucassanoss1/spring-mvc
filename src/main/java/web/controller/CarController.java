package web.controller;

import Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.GetCarListImpl;

import java.util.List;

@Controller
public class CarController {

    private final GetCarListImpl getCars;

    public CarController(GetCarListImpl getCars) {
        this.getCars = getCars;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = getCars.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
