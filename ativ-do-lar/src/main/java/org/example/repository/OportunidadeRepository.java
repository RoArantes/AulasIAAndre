package org.example.repository;

import org.example.model.Oportunidade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OportunidadeRepository extends MongoRepository<Oportunidade, String> {

}
