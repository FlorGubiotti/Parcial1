package com.facu.parcial.Repositories;

import com.facu.parcial.Entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
