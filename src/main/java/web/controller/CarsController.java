package web.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;
import java.util.List;
import java.util.Optional;

@Controller
@ComponentScan("web")
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count.orElse(0)));
        return "cars";
    }
}
