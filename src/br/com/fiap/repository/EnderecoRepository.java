package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	Endereco findById(long id);
}