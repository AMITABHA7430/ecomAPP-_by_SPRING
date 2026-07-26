package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {

        Product product = service.getProductByID(id);

        if (product != null)
            return ResponseEntity.ok(product);

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(
            @RequestPart("product") Product product,
            @RequestPart("imageFile") MultipartFile imageFile) {

        System.out.println("CONTROLLER REACHED");

        try {
            Product saved = service.addProduct(product, imageFile);
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Product product=service.getProductByID(productId);
        byte[] imageFile = product.getImageData();
        return ResponseEntity.ok().contentType(MediaType.valueOf(product.getImageType())).body(imageFile);
    }


    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id,@RequestPart("product") Product product,
                                                @RequestPart("imageFile") MultipartFile imageFile){

        Product product2 = null;
        try {
            product2 = service.updateProduct(id,product,imageFile);
        } catch (IOException e) {
            return new ResponseEntity<>("failed to update",HttpStatus.BAD_REQUEST);
        }

        if(product2!=null){
            return new ResponseEntity<>("upadted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("failed to update",HttpStatus.BAD_REQUEST);
        }

    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deletProduct(@PathVariable int id){
        Product product = service.getProductByID(id);
        if(product!=null){
            service.deleteProduct(id);
            return new ResponseEntity<>("deleted..",HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>("failed to delete not found the product..",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProducts(
            @RequestParam("keyword") String keyword) {

        System.out.println("Searching with: " + keyword);

        List<Product> products = service.searchProducts(keyword);

        return ResponseEntity.ok(products);
    }

}