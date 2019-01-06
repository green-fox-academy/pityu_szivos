package com.carplates2.carplates2.Services;

import com.carplates2.carplates2.Models.Car;
import com.carplates2.carplates2.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List <Car> listCars(String licencePlate){
        if (licencePlate.matches("[a-zA-Z0-9-]+") && licencePlate.length() < 8 && !carRepository.findAllByLicencePlateContains(licencePlate).isEmpty()){
            return carRepository.findAllByLicencePlateContains(licencePlate);
        }
        return null;
    }

    public void saveCar(Car car){
        carRepository.save(car);
    }

    public List <Car> listBrand(String brand) {
        return carRepository.findAllByBrand(brand);
    }

    public List <Car> listAllPoliceCars() {
       return carRepository.findAllPoliceCars();
    }

    public List <Car> listAllDiplomatCars() {
        return carRepository.findAllDiplomatCars();
    }
}
