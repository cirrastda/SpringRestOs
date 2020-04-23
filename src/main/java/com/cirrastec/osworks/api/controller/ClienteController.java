package com.cirrastec.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cirrastec.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Joao Teste");
		cliente.setEmail("joao@uol.com.br");
		cliente.setTelefone("11948782820");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Anderson");
		cliente2.setEmail("cirrastda@gmail.com");
		cliente2.setTelefone("11993114700");
		
		return Arrays.asList(cliente, cliente2);
	}
}
