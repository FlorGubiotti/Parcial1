package com.facu.parcial.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "libro")

public class Libro extends BaseEntidad{

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @EqualsAndHashCode.Exclude
    private List<Autor> autores;

}
