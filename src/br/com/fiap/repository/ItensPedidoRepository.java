package br.com.fiap.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import br.com.fiap.entity.ItensPedido;

public interface ItensPedidoRepository extends CrudRepository<ItensPedido, Long> {
	
}