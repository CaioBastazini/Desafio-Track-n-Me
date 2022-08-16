package com.desafio.funcionario.services;

import com.desafio.funcionario.models.FuncionarioModel;
import com.desafio.funcionario.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FuncionarioService {

    final FuncionarioRepository funcionarioRepository;                                                                        //Fazer a comunicação entre repository, service, model

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Transactional
    public FuncionarioModel save(FuncionarioModel funcionarioModel) {
        return funcionarioRepository.save(funcionarioModel);
    }

    public List<FuncionarioModel> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<FuncionarioModel> findById(UUID id) {
        return funcionarioRepository.findById(id);
    }

    @Transactional
    public void delete(FuncionarioModel funcionarioModel) {

        funcionarioRepository.delete(funcionarioModel);
    }


}
