package com.devsuperior.desafio.crud.dto;

import com.devsuperior.desafio.crud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
public class ClientDTO {

    private Long id;

    @NotBlank(message = "Required field")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "The date cannot be future")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }
}
