package com.facu.parcial.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "localidad")

public class Localidad extends BaseEntidad{

    @Column(name = "denominacion")
    private String denominacion;

}
