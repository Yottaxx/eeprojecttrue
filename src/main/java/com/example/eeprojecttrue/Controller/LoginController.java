package com.example.eeprojecttrue.Controller;

import com.example.eeprojecttrue.Entity.Customer;
import com.example.eeprojecttrue.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> ad5ddffab0f25a2405bdfcab5902afeea4d01260
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = {"/Login","/login"})
    public String newUser(Customer customer, HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(customerService.Login(customer)) {
<<<<<<< HEAD
            Customer customer1=customerService.findByEmail(customer.getEmail());
            session.setAttribute("customer",customer1);
=======
            session.setAttribute("customer",customer);
>>>>>>> ad5ddffab0f25a2405bdfcab5902afeea4d01260
            return "redirect:/index";
        }else
            return "signup";
    }

    @GetMapping(value = {"/Login","/login"})
    public String GetLogin(Customer customer)
    {
       return "login";
    }

    @GetMapping(value = {"/Logout","/logout"})
    public String logout(HttpSession session){
        session.removeAttribute("customer");
        return "redirect:/login";
    }

}
