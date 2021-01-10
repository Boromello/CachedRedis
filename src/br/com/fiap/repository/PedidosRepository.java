package br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.fiap.entity.Pedidos;

public interface PedidosRepository extends CrudRepository<Pedidos, Long> {
}