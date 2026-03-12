package com.testepedidos.SistemaDePedidos.repositories;

import com.testepedidos.SistemaDePedidos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
