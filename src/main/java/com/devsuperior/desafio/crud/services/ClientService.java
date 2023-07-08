package com.devsuperior.desafio.crud.services;

import com.devsuperior.desafio.crud.dto.ClientDTO;
import com.devsuperior.desafio.crud.entities.Client;
import com.devsuperior.desafio.crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
