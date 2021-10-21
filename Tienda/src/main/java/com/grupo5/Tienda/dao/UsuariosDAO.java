package com.grupo5.Tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo5.Tienda.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer>{

}
