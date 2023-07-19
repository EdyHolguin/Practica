package com.api_ed.practica.repositories;

import com.api_ed.practica.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
