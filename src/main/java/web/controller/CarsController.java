package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;

@Controller
public class CarsController {

   @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model ){
        if (count != null) {
            model.addAttribute("printCar", CarService.getCountCars(count));
        } else {
            model.addAttribute("printCar", CarService.getAllCars());
        }
        return "cars";
    }
}

