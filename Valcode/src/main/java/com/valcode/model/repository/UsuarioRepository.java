package com.valcode.model.repository;


import com.valcode.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
	
	Optional<Usuario> findByUsername(String username);
	Optional<Usuario> findByCpf(String cpf);
//	boolean existsByUserName(String username);
	
}
