package com.pizzadelivery.demopizzadelivery.Controllers;

import com.pizzadelivery.demopizzadelivery.ExceptionHandling.InvalidOrder;
import com.pizzadelivery.demopizzadelivery.ExceptionHandling.OrderNotFound;
import com.pizzadelivery.demopizzadelivery.Models.OrderPizza;
import com.pizzadelivery.demopizzadelivery.Services.OrderService;
import javassist.NotFoundException;
import org.aspectj.weaver.ast.Not;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.UriComponentsBuilderMethodArgumentResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    String orderMainPage(Model model, @ModelAttribute ("order") OrderPizza orderPizza) {
        if (orderPizza == null){
            model.addAttribute("order", new OrderPizza());
           return "index";
        }
        model.addAttribute("order", new OrderPizza());
        model.addAttribute("orderReceived", orderPizza);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://www.facebook.com");
        return "index";
    }

    @PostMapping("/order")
   String orderPizza(@ModelAttribute OrderPizza order, RedirectAttributes redirectAttributes) throws OrderNotFound, InvalidOrder {
       orderService.savePizzaOrder(order);
        redirectAttributes.addFlashAttribute("order", orderService.getPizzaById(order.getId()));
        return "redirect:/";
    }

    @GetMapping("/order/{order}")
    String showOrder(@PathVariable("order") Long id, RedirectAttributes redirectAttributes) throws OrderNotFound {
       redirectAttributes.addFlashAttribute("order", orderService.getPizzaById(id));
        return "redirect:/";
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    OrderPizza showStatOrder(Model model, @PathVariable ("id") long id)throws OrderNotFound{
        return orderService.getPizzaById(id);
    }

    @GetMapping("/statistics")
    @ResponseBody
    List <String> showStatistics(Model model){
        return orderService.findMostPopularPizza();
    }


    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    public NotFoundException notFound() {
        return new NotFoundException("404 site not found");
    }
}
