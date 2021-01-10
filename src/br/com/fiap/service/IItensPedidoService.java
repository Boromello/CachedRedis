package br.com.fiap.service;

import java.util.List;

import br.com.fiap.entity.ItensPedido;

public interface IItensPedidoService {
	List<ItensPedido> getAllItensPedido(long id);
	ItensPedido getItemPedidoByIdAndSeq(long id, int seq);
	ItensPedido addItemPedido(ItensPedido itempedido);
	ItensPedido updateItemPedido(ItensPedido itempedido);
    void deleteItemPedido(ItensPedido itempedido);
}
