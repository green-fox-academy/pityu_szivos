package com.bankofsimba.demobankofsimba;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
        private Boolean king;

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public BankAccount(String name, Integer balance, String animalType, Boolean king) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Boolean getKing() {
        return king;
    }

    public void setKing(Boolean king) {
        this.king = king;
    }

}
