package br.com.neki.mappers;

import org.springframework.stereotype.Component;

import br.com.neki.dtos.UsuarioDTO;
import br.com.neki.dtos.UsuarioDetalheDTO;
import br.com.neki.models.Usuario;

@Component
public class UsuarioMapper {
	public Usuario toEntity(UsuarioDTO dto) {
		Usuario user = new Usuario();
		user.setUsuario(dto.getUsuario());
		user.setSenha(dto.getSenha());
		user.setDataLogin(dto.getDataLogin());
		user.setHabilidades(dto.getHabilidades());
		return user;
	}

	public UsuarioDTO toDTO(Usuario user) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setUsuario(user.getUsuario());
		dto.setSenha(user.getSenha());
		dto.setDataLogin(user.getDataLogin());
		return dto;
	}

	public UsuarioDetalheDTO toDetalheDTO(Usuario user) {
		UsuarioDetalheDTO dto = new UsuarioDetalheDTO();
		dto.setId(user.getId());
		dto.setUsuario(user.getUsuario());
		dto.setDataLogin(user.getDataLogin());
		dto.setHabilidades(user.getHabilidades());
		return dto;
	}

}
