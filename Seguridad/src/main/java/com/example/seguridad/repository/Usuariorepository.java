package com.example.seguridad.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.seguridad.entity.Usuario;


@Repository
public interface Usuariorepository extends JpaRepository<Usuario, Integer>{
	public Usuario findByUsername(String username);
	
	
}

