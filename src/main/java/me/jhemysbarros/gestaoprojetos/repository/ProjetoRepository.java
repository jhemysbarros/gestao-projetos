package me.jhemysbarros.gestaoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
