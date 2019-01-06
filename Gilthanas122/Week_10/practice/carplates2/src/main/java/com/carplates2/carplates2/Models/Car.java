package com.carplates2.carplates2.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private String licencePlate;
    private String brand;
    private String model;
    private String color;
    private Integer year;
    private Boolean policeCar;
    private Boolean diplomatCar;

    public Car() {
    }

    public Car(String licencePlate, String brand, String model, String color, Integer year, Boolean policeCar, Boolean diplomatCar) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.policeCar = policeCar;
        this.diplomatCar = diplomatCar;
    }


    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getPoliceCar() {
        return policeCar;
    }

    public void setPoliceCar(Boolean policeCar) {
        this.policeCar = policeCar;
    }

    public Boolean getDiplomatCar() {
        return diplomatCar;
    }

    public void setDiplomatCar(Boolean diplomatCar) {
        this.diplomatCar = diplomatCar;
    }
}
