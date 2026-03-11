package com.testepedidos.SistemaDePedidos.repositories;

import com.testepedidos.SistemaDePedidos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
