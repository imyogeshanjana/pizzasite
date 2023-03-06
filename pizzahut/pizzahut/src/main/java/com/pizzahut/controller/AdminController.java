package com.pizzahut.controller;

import com.pizzahut.dao.PizzaDAO;
import com.pizzahut.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

     @Autowired
     private PizzaDAO pS;
     @Autowired

     @GetMapping("/dashboard")
     public String admindashboard(){

          return "dashboard";
     }

     @GetMapping("/showpizza")
     public String showpizza(Model model){
          System.out.println("Admin ADDPIZZA Function Working");
          System.out.println(pS.get());
          model.addAttribute("pizzas",pS.get());
          return "pizzadash";
     }


    /* @PostMapping("/pizzainsert")
     public String savePizza(Pizza pizza) {
          pS.add(pizza);
          return  "redirect:pizzadash";
     }*/





}
