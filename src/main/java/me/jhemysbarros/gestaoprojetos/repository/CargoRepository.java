package me.jhemysbarros.gestaoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jhemysbarros.gestaoprojetos.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
