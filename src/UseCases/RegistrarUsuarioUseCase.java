package UseCases;

import DTO.RegistrarUsuarioDTO;
import Entities.Usuario;
import Repositories.UsuarioRepository;

public class RegistrarUsuarioUseCase {

    private final UsuarioRepository usuarioRepository;
    
    public RegistrarUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public Usuario executar(RegistrarUsuarioDTO usuarioDto) throws Exception {
        
        Usuario usuario = this.usuarioRepository.buscarPorEmail(usuarioDto.getEmail());
        if (usuario != null) {
            throw new Exception("Usuario já existe");
        }
        
        
        Usuario u = new Usuario(usuarioDto.getNome(), usuarioDto.getEmail(), usuarioDto.getSenha(), usuarioDto.getFuncao_usuario());
        
        return this.usuarioRepository.create(u);
    }
}
