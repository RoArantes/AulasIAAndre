package org.example.model;

import org.example.model.dto.ProductDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Oportunidade {

    public Oportunidade(){}


    @Id
    private String id;
    private String description;
    private String data;
    private String satisfacao;

    public Oportunidade(ProductDTO oportunidade) {
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(String satisfacao) {
        this.satisfacao = satisfacao;
    }
}
