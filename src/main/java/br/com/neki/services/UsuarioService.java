package br.com.neki.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.dtos.UsuarioDTO;
import br.com.neki.dtos.UsuarioDetalheDTO;
import br.com.neki.exceptions.UsuarioException;
import br.com.neki.exceptions.UsuarioNotFoundException;
import br.com.neki.mappers.UsuarioMapper;
import br.com.neki.models.Usuario;
import br.com.neki.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	UsuarioMapper usuarioMapper;

	public Usuario findById(Integer id) throws UsuarioNotFoundException {
		return usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNotFoundException("Usuário não encontrado"));
	}

	public Usuario create(UsuarioDTO dto) throws UsuarioException {
		try {
			Usuario user = usuarioMapper.toEntity(dto);
			return usuarioRepository.save(user);
		} catch (Exception e) {
			throw new UsuarioException("Erro ao cadastrar usuário");
		}
	}

	public List<UsuarioDetalheDTO> getAll() {
		return usuarioRepository.findAll().stream().map(usuarioMapper::toDetalheDTO).collect(Collectors.toList());
	}

	public UsuarioDetalheDTO getById(Integer id) throws UsuarioNotFoundException {
		return usuarioRepository.findById(id).map(usuarioMapper::toDetalheDTO)
				.orElseThrow(() -> new UsuarioNotFoundException("Usuário não localizado"));
	}

}
