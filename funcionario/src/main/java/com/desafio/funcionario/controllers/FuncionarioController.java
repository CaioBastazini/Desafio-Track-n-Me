package com.desafio.funcionario.controllers;

import com.desafio.funcionario.dtos.FuncionarioDto;
import com.desafio.funcionario.models.FuncionarioModel;
import com.desafio.funcionario.services.FuncionarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController                                     //Idendificador Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/funcionario")
public class FuncionarioController {

    final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public ResponseEntity<Object> saveFuncionario(@RequestBody @Valid FuncionarioDto funcionarioDto){
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.save(funcionarioModel));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> getAllFuncionario(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneFuncionario(@PathVariable(value = "id") UUID id){
        Optional<FuncionarioModel> funcionarioModelOptional = funcionarioService.findById(id);
        if (!funcionarioModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFuncionario(@PathVariable(value = "id") UUID id){
        Optional<FuncionarioModel> funcionarioModelOptional = funcionarioService.findById(id);
        if (!funcionarioModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado.");
        }
        funcionarioService.delete(funcionarioModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Dados deletados com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFuncionario(@PathVariable(value = "id") UUID id,@RequestBody @Valid FuncionarioDto funcionarioDto){
        Optional<FuncionarioModel> funcionarioModelOptional = funcionarioService.findById(id);
        if (!funcionarioModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado.");
        }
        var funcionarioModel = funcionarioModelOptional.get();
        funcionarioModel.setFuncionarioBairro(funcionarioDto.getFuncionarioBairro());
        funcionarioModel.setFuncionarioCidade(funcionarioDto.getFuncionarioCidade());
        funcionarioModel.setFuncionarioEstado(funcionarioDto.getFuncionarioEstado());
        funcionarioModel.setFuncionarioCep(funcionarioDto.getFuncionarioCep());
        funcionarioModel.setFuncionarioEndereco(funcionarioDto.getFuncionarioEndereco());
        funcionarioModel.setFuncionarioIdade(funcionarioDto.getFuncionarioIdade());
        funcionarioModel.setFuncionarioNome(funcionarioDto.getFuncionarioNome());
        funcionarioModel.setFuncionarioSexo(funcionarioDto.getFuncionarioSexo());
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.save(funcionarioModel));

    }





}
