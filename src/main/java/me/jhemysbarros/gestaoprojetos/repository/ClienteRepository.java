package me.jhemysbarros.gestaoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
