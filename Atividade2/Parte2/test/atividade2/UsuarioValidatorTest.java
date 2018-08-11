package atividade2;

import static org.junit.Assert.assertTrue;
import org.mockito.*;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class UsuarioValidatorTest {

    SenhaValidator senhaValidator;
    Usuario usuario;
    UsuarioDAO usuarioDAO;
    UsuarioValidator usuarioValidator;

    public UsuarioValidatorTest() {
        senhaValidator = Mockito.mock(SenhaValidator.class);
        usuario = Mockito.mock(Usuario.class);
        usuarioDAO = Mockito.mock(UsuarioDAO.class);
        usuarioValidator = new UsuarioValidator(usuarioDAO);
        usuarioValidator.setSenhaValidator(senhaValidator);
    }

    @Test(expected = Exception.class)
    public void NomeMenosQueCincoCaracteres() throws Exception {
        when(usuario.getNome()).thenReturn("hbb");
        usuarioValidator.ehUsuarioValido(usuario);
    }

    @Test(expected = Exception.class)
    public void SenhaNaoConfere() throws Exception {
        usuario.setNome("Harrison");
        usuario.setSenha("1388363");
        usuario.setSenhaConfirmada("38836");
        usuarioValidator.ehUsuarioValido(usuario);
    }

    @Test(expected = Exception.class)
    public void senhaInvalidada() throws Exception {
        usuario.setNome("Harrison");
        usuario.setSenha("1388363");
        usuario.setSenhaConfirmada("1388363");
        usuarioValidator.setSenhaValidator(senhaValidator);
        
        when(senhaValidator.verificar("1388363")).thenReturn(true);
        usuarioValidator.ehUsuarioValido(usuario);
    }

    @Test(expected = Exception.class)
    public void usuarioValidado() throws Exception {
        usuario.setNome("Harrison");
        usuario.setSenha("1388363");
        usuario.setSenhaConfirmada("1388363");
        usuarioValidator.setSenhaValidator(senhaValidator);

        when(senhaValidator.verificar("1388363")).thenReturn(true);
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
    }    

    @Test(expected = Exception.class)
    public void usuarioExistente() throws Exception {
        usuario.setNome("Harrison");
        usuario.setSenha("1388363");
        usuario.setSenhaConfirmada("1388363");
        usuarioValidator.setSenhaValidator(senhaValidator);

        when(senhaValidator.verificar("1388363")).thenReturn(false);
        when(usuarioDAO.getByName("Harrison")).thenReturn(new Usuario());
        usuarioValidator.ehUsuarioValido(usuario);
    }
}
