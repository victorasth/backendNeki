package br.com.neki.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.dtos.UsuarioDTO;
import br.com.neki.dtos.UsuarioDetalheDTO;
import br.com.neki.exceptions.UsuarioException;
import br.com.neki.exceptions.UsuarioNotFoundException;
import br.com.neki.services.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("API - Usuários")
@RestController
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@ApiOperation(value = "Criação de usuários")
	@PostMapping
	public ResponseEntity<String> create(@Validated @RequestBody UsuarioDTO dto) throws UsuarioException {
		usuarioService.create(dto);
		return new ResponseEntity<>("Usuário cadastrado com sucesso", HttpStatus.CREATED);
	}

	@ApiOperation(value = "Busca por todos os usuários")
	@GetMapping("/all")
	public ResponseEntity<List<UsuarioDetalheDTO>> getAll() {
		return new ResponseEntity<List<UsuarioDetalheDTO>>(usuarioService.getAll(), HttpStatus.OK);
	}

	@ApiOperation(value = "Busca de usuário específico por ID")
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDetalheDTO> getById(@PathVariable Integer id) throws UsuarioNotFoundException {
		return new ResponseEntity<UsuarioDetalheDTO>(usuarioService.getById(id), HttpStatus.OK);
	}

}
