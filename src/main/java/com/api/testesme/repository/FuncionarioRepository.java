package com.api.testesme.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.testesme.model.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, UUID>{

}
