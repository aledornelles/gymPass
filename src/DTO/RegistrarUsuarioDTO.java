package DTO;

import Enums.Funcao;

public class RegistrarUsuarioDTO {
    private String nome;
    private String email;
    private String senha;
    private Funcao funcao_usuario;

    public RegistrarUsuarioDTO(String nome, String email, String senha, Funcao funcao_usuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.funcao_usuario = funcao_usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Funcao getFuncao_usuario() {
        return funcao_usuario;
    }
    
}

