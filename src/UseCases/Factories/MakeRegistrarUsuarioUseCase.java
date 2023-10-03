package UseCases.Factories;

import Repositories.Hibernate.HibernateUsuarioRepository;
import Repositories.UsuarioRepository;
import UseCases.RegistrarUsuarioUseCase;

public class MakeRegistrarUsuarioUseCase {
    public static RegistrarUsuarioUseCase make() {
        UsuarioRepository usuarioRepository = new HibernateUsuarioRepository();
        return new RegistrarUsuarioUseCase(usuarioRepository);
    }
}
