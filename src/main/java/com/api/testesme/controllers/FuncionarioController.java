package com.api.testesme.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.api.testesme.model.FuncionarioModel;
import com.api.testesme.service.FuncionarioService;



@Controller
public class FuncionarioController {
	
	final FuncionarioService funcionarioService;
	
	private FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	public Object salvarFuncionario(FuncionarioModel funcionarioModel) {
		return funcionarioService.save(funcionarioModel);
	}
	
	public List<FuncionarioModel> listarFuncionarios(){
		return null;
	}

}
