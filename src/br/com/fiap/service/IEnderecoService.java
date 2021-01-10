package br.com.fiap.service;

import java.util.List;

import br.com.fiap.entity.Endereco;

public interface IEnderecoService {
	List<Endereco> getAllEnderecos();
	Endereco getEnderecoById(long id);
	Endereco addEndereco(Endereco endereco);
	Endereco updateEndereco(Endereco endereco);
    void deleteEndereco(long id);
}
