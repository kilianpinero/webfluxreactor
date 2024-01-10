package com.sand.box.webfluxreactor.model.dao;

import com.sand.box.webfluxreactor.model.document.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {
}
