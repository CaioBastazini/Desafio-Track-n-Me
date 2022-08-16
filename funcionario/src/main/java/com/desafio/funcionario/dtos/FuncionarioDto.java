package com.desafio.funcionario.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FuncionarioDto {

    @NotBlank
    private String funcionarioNome;
    @NotBlank
    private String funcionarioIdade;
    @NotBlank
    @Size(max = 9)
    private String funcionarioCep;
    @NotBlank
    private String funcionarioSexo;
    @NotBlank
    private String funcionarioEndereco;
    @NotBlank
    private String funcionarioBairro;
    @NotBlank
    private String funcionarioCidade;
    @NotBlank
    private String funcionarioEstado;

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
