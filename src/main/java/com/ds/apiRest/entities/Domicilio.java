package com.ds.apiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "domicilio")
public class Domicilio extends Base{

    @Column (name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    //Relacion con localidad
    @ManyToOne(optional = false) //indicamos que la localidad no puede ser nula al crear el domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
