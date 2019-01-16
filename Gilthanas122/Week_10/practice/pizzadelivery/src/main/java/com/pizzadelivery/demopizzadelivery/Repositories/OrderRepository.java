package com.pizzadelivery.demopizzadelivery.Repositories;

import com.pizzadelivery.demopizzadelivery.Models.OrderPizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderPizza, Long> {

    @Query(value = "SELECT pizza FROM order_pizza group by pizza order by count(pizza) desc limit 2", nativeQuery = true)
    List <String> findTop2ByPizzaAsc();

}
