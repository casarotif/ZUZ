package com.zeroum.zuz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeroum.zuz.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	// Separar médico de paciente 
}
