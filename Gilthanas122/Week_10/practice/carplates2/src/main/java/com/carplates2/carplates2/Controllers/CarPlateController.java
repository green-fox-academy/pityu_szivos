package com.carplates2.carplates2.Controllers;

import com.carplates2.carplates2.Models.Car;
import com.carplates2.carplates2.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarPlateController implements CommandLineRunner {
    CarService carService;

    @Autowired
    public CarPlateController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/index")
    public String indexParge(Model model, @ModelAttribute Car car, @RequestParam (required = false)List<Car> cars) {
        model.addAttribute("car", car);
        model.addAttribute("cars", cars);
        return "index";
    }


    @GetMapping("/searchresult")
    public String searchResult(Model model, @RequestParam (value = "licencePlate", required = false) String licencePlate, @RequestParam (value = "police", required = false) Integer i,
                               @RequestParam(value = "diplomat", required = false) Integer d){
        if (i != null){
            model.addAttribute("cars", carService.listAllPoliceCars());
            return "index";
        } else if (d != null){
            model.addAttribute("cars", carService.listAllDiplomatCars());
            return "index";
        } else if(licencePlate != null){
            model.addAttribute("cars", carService.listCars(licencePlate));
            return "index";
        }
        return "index";
    }

    @GetMapping("/list-brand/{brand}")
    public String showAllCarFromSameBrand(Model model, @PathVariable(name="brand") String brand){
        model.addAttribute("cars", carService.listBrand(brand));
        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
        carService.saveCar(new Car("JWM-752", "Audi", "A8", "Pink", 2008, false, false));
        carService.saveCar(new Car("JWM-772", "Audi", "Cayenne", "Red", 2002, false, false));
        carService.saveCar(new Car("JWK-752", "Saab", "Leaf", "Yellow", 2004, false, false));
        carService.saveCar(new Car("RB-7252", "Saab", "Leaf", "Yellow", 2004, false, false));
        carService.saveCar(new Car("DT-7252", "Saab", "Leaf", "Yellow", 2004, false, false));
        carService.saveCar(new Car("Dt-7772", "Saab", "Leaf", "Yellow", 2004, false, false));
    }
}

