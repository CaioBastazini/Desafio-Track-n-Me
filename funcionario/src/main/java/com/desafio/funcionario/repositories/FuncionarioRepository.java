package com.desafio.funcionario.repositories;

import com.desafio.funcionario.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, UUID> {
}
