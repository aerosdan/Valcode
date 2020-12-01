package com.valcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.valcode.model.entity.Usuario;
import com.valcode.model.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository repository;
	
//	public Usuario salvar(Usuario usuario) {
//		boolean exists = repository.existsByUserName(usuario.getUsername());
//		if(exists){
//			
//		}
//		return repository.save(usuario);
//	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repository
									.findByUsername(username)
									.orElseThrow(() -> new UsernameNotFoundException("Login não encontrado."));
		return User.builder()
				.username(usuario.getUsername())
				.password(usuario.getSenha())
				.roles("USER")
				.build();	
	}

}
