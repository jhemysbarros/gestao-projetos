package me.jhemysbarros.gestaoprojetos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.swing.Spring;

@Entity
public class Cargo extends Entidade {

    @Column(nullable = false, length = 40, unique = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
