package me.jhemysbarros.gestaoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
