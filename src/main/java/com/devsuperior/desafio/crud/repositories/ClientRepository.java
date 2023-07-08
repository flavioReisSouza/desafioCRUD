package com.devsuperior.desafio.crud.repositories;

import com.devsuperior.desafio.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
