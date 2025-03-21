package org.example.service;

import org.example.model.Oportunidade;
import org.example.repository.OportunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private OportunidadeRepository oportunidadeRepository;
    public void save(Oportunidade oportunidade){
        OportunidadeRepository.OportunidadeRepositoy.save(oportunidade);
    }
    public List<Oportunidade> findAll(){
        return OportunidadeRepository.OportunidadeRepositoy.findAll();
    }
}
