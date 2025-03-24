package org.example.controller;

import lombok.var;
import org.example.constant.Constant;
import org.example.model.Oportunidade;
import org.example.model.dto.OportunidadeDTO;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService clientService;

    @PostMapping(Constant.API_CLIENT)
    public void insert(@RequestBody OportunidadeDTO oportunidadeDTO) {

        clientService.save(new Oportunidade(oportunidadeDTO));
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Oportunidade> findAll() {
        return clientService.findAll();
    }

}