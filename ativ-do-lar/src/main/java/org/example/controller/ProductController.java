package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Oportunidade;
import org.example.model.dto.ProductDTO;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService clientService;


    @PostMapping(Constant.API_CLIENT)
    public void insert(@RequestBody ProductDTO product){
        ProductDTO oportunidade = null;
        clientService.save(new Oportunidade(oportunidade));
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Oportunidade> findAll(){
        return clientService.findAll();
    }

}