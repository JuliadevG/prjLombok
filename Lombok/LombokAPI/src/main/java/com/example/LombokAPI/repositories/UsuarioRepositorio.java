package com.example.LombokAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.LombokAPI.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}