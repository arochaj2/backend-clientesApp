package com.josearocha.apirest.models.services;

import com.josearocha.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
