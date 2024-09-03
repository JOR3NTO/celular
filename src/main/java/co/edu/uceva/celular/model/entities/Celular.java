package co.edu.uceva.celular.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Celular {
    @Id /*Digo que es una llave primaria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String marca;
    private String modelo;
    private long celular;


}
