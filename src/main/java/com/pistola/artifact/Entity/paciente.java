package com.pistola.artifact.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class paciente {
    @Id
  
    private double id;
    @Column
    private String nombre;
        @Column

    private String apellido;
        @Column

    private String correo;
    
}
