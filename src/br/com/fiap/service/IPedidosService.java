package br.com.fiap.service;

import java.util.List;

import br.com.fiap.entity.Pedidos;

public interface IPedidosService {
	List<Pedidos> getAllPedidos();
	Pedidos getPedidoById(long id);
	Pedidos addPedido(Pedidos pedido);
	Pedidos updatePedido(Pedidos pedido);
    void deletePedido(long id);
}
