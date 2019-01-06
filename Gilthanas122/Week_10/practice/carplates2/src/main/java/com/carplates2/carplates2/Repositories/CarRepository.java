package com.carplates2.carplates2.Repositories;

import com.carplates2.carplates2.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {

    List <Car> findAllByLicencePlateContains(String licencePlate);

    List<Car> findAllByBrand(String brand);

    @Query(value="SELECT u FROM Car u where u.licencePlate like 'RB%'")
    List<Car> findAllPoliceCars();

    @Query(value="SELECT u FROM Car u where u.licencePlate like 'DT%'")
    List <Car> findAllDiplomatCars();
}
