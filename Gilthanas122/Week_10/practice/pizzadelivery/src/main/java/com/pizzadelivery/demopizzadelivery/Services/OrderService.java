package com.pizzadelivery.demopizzadelivery.Services;

import com.pizzadelivery.demopizzadelivery.ExceptionHandling.InvalidOrder;
import com.pizzadelivery.demopizzadelivery.ExceptionHandling.OrderNotFound;
import com.pizzadelivery.demopizzadelivery.Models.OrderPizza;
import com.pizzadelivery.demopizzadelivery.Repositories.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderPizza savePizzaOrder(OrderPizza order) throws InvalidOrder{
        if (isValidOrder(order)){
            orderRepository.save(order);
           return orderRepository.save(order);
        }
        throw  new InvalidOrder("Missing argument");
    }

    private boolean isValidOrder(OrderPizza order) {
        return isValidOrderField(order.getAddress()) && isValidOrderField(order.getName()) && isValidOrderField(order.getPizza());
    }

    private boolean isValidOrderField(String field) {
        return field != null && !field.isEmpty();
    }

    public OrderPizza getPizzaById(Long id) throws OrderNotFound {
        Optional<OrderPizza> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        }
        throw new OrderNotFound("id" + id);
    }

    public List <String> findMostPopularPizza(){
        return orderRepository.findTop2ByPizzaAsc();
    }

   /* public List<String> findMostPopularPizza() {
        List<OrderPizza> orderPizzaConvertedToList = orderRepository.findAll();
        List<String> return2MostCommonPizza = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String mostCommonPizza = orderPizzaConvertedToList.stream()
                    .map(OrderPizza::getPizza)
                    .filter(Objects::nonNull)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey).orElse(null);
            return2MostCommonPizza.add(mostCommonPizza);
            for (int j = 0; j <orderPizzaConvertedToList.size() ; j++) {
                if (orderPizzaConvertedToList.get(j).getPizza().equals(mostCommonPizza)){
                    orderPizzaConvertedToList.remove(j);
                }
            }
        }
        return return2MostCommonPizza;
    }*/
}
