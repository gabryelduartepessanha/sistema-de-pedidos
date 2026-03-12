package com.testepedidos.SistemaDePedidos.repositories;

import com.testepedidos.SistemaDePedidos.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
