package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.entity.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}