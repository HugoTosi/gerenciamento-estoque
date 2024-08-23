package com.projeto.estoque.controllers;


import com.projeto.estoque.entities.Product;
import com.projeto.estoque.repositories.ProductRepository;
import com.projeto.estoque.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired //Injeção de dependência
    private ProductService productService;
    @Autowired
    private ProductRepository repository;
    @GetMapping("/home")
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/products/new")
    public String addNewProduct(Model model){
        model.addAttribute("product", new Product());
        return "product_form";
    }
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/products/new";
    }

    @GetMapping("/products")
    public String allProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product_list";
    }

    //ATT PRODUTOS

    //DEL PRODUTOS
}
