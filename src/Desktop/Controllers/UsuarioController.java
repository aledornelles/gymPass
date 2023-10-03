package Desktop.Controllers;

import DTO.RegistrarUsuarioDTO;
import static UseCases.Factories.MakeRegistrarUsuarioUseCase.make;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioController {
    public void CriarUsuario(RegistrarUsuarioDTO usuario){
        try {
            make().executar(usuario);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
