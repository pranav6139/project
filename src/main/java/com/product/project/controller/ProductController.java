package com.product.project.controller;

import com.product.project.model.MyFormObject;
import com.product.project.model.Product;
import com.product.project.repository.ProductRepository;
import com.product.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/login")
    public String login() {
         return productService.login();
    }

    @RequestMapping("/filter")
    public String filter() {
        return productService.filter();
    }

    @RequestMapping(path = "/")
    public String index() {
        return productService.index();
    }

    @RequestMapping(path = "/products/add", method = RequestMethod.GET)
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return productService.createProduct();
    }

    @RequestMapping(path = "products", method = RequestMethod.POST)
    public String saveProduct(Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }

//    @GetMapping("/products/search")
//    public String getProduct(Model model, @ModelAttribute("myFormObject") MyFormObject myFormObject,
//                             BindingResult result) {
//        List<Product> products = this.productService.getAllProducts(myFormObject.getPName());
//        model.addAttribute("products", products);
//        return "show_product";
//    }

//    -------------------------Regex Search
//    @RequestMapping(value = "/search")
//    public String search(Model model, @RequestParam String search) {
//    model.addAttribute("products", productService.searchProduct(search));
//    model.addAttribute("search", search);
//    return "products";
//}



    @RequestMapping(path = "/products/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("product",productService.editProduct(id));
        return "edit";
    }



    @RequestMapping(path = "/products/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable(name = "id") String id) {
        return productService.deleteProduct(id);
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String showStudentBySurname(@RequestParam (value = "search", required = false) String name, Model model) {
        model.addAttribute("search", productService.listProductByName(name));
        return "search";
    }


}
