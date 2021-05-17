package me.jhemysbarros.gestaoprojetos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @EntityGraph(attributePaths = "endereco")
    List<Cliente> findAll();
}
