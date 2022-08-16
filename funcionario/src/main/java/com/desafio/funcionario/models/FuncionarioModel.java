package com.desafio.funcionario.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity                                                              //Fazer a criação da tabela no banco de dados
@Table(name = "DADOS_FUNCIONARIO")                                   //Nome da tabela criada
public class FuncionarioModel implements Serializable {
    private static final long serialVersionUID = 1L;                 //Conversão de BD para Java

    @Id                                                              //Identificador
    @GeneratedValue(strategy = GenerationType.AUTO)                  //gera um ID automatico
    private UUID id;
    @Column(nullable = false, unique = true, length = 300)
    private String funcionarioNome;
    @Column(nullable = false,  length = 4)
    private String funcionarioIdade;
    @Column(nullable = false,  length = 10)
    private String funcionarioCep;



    //private UUID cep;                                                  // Não sei qual linha é para criar o cep LEMBRAR DE GERAR UM GETTER E SETTER
    @Column(nullable = false, length = 13)
    private String funcionarioSexo;
    @Column(nullable = false, length = 100)
    private String funcionarioEndereco;
    @Column(nullable = false, length = 50)
    private String funcionarioBairro;
    @Column(nullable = false, length = 50)
    private String funcionarioCidade;
    @Column(nullable = false, length = 40)
    private String funcionarioEstado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public String getFuncionarioIdade() {
        return funcionarioIdade;
    }

    public void setFuncionarioIdade(String funcionarioIdade) {
        this.funcionarioIdade = funcionarioIdade;
    }

    public String getFuncionarioCep() {
        return funcionarioCep;
    }

    public void setFuncionarioCep(String funcionarioCep) {
        this.funcionarioCep = funcionarioCep;
    }

    //public UUID getCep() {
        //return cep;
    //}

    //public void setCep(UUID cep) {
        //this.cep = cep;
   // }

    public String getFuncionarioSexo() {
        return funcionarioSexo;
    }

    public void setFuncionarioSexo(String funcionarioSexo) {
        this.funcionarioSexo = funcionarioSexo;
    }

    public String getFuncionarioEndereco() {
        return funcionarioEndereco;
    }

    public void setFuncionarioEndereco(String funcionarioEndereco) {
        this.funcionarioEndereco = funcionarioEndereco;
    }

    public String getFuncionarioBairro() {
        return funcionarioBairro;
    }

    public void setFuncionarioBairro(String funcionarioBairro) {
        this.funcionarioBairro = funcionarioBairro;
    }

    public String getFuncionarioCidade() {
        return funcionarioCidade;
    }

    public void setFuncionarioCidade(String funcionarioCidade) {
        this.funcionarioCidade = funcionarioCidade;
    }

    public String getFuncionarioEstado() {
        return funcionarioEstado;
    }

    public void setFuncionarioEstado(String funcionarioEstado) {
        this.funcionarioEstado = funcionarioEstado;
    }
}
