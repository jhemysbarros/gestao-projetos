package me.jhemysbarros.gestaoprojetos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    @EntityGraph(attributePaths = {"cliente", "lider"})
    List<Projeto> findAll();
}
