package com.facu.parcial.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "domicilio")

public class Domicilio extends BaseEntidad {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
