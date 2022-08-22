package com.api.testesme.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.testesme.model.FuncionarioModel;
import com.api.testesme.repository.FuncionarioRepository;



@Service
public class FuncionarioService {
	
	final FuncionarioRepository funcinarioRepository;
	
	public FuncionarioService(FuncionarioRepository funcinarioRepository) {
		this.funcinarioRepository = funcinarioRepository;
	}
	
	public Object save(FuncionarioModel funcionarioModel) {
		return funcinarioRepository.save(funcionarioModel);
	}
	
	public List<FuncionarioModel> findAll(){
		return funcinarioRepository.findAll();
	}
	public Optional<FuncionarioModel> findByID(UUID id) {
		return funcinarioRepository.findById(id);
	}
	public void delete(FuncionarioModel funcionarioModel){
		funcinarioRepository.delete(funcionarioModel);
	}
}
