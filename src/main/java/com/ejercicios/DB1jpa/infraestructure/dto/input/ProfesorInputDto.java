package com.ejercicios.DB1jpa.infraestructure.dto.input;

import com.ejercicios.DB1jpa.domain.entity.Persona;
import lombok.Data;


@Data
public class ProfesorInputDto {
    String id_profesor;
    Persona persona;
    String coments;
    String branch;
}
