package br.com.fiap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import br.com.fiap.entity.Pedidos;
import br.com.fiap.repository.PedidosRepository;

@Service
public class PedidosService implements IPedidosService {
	@Autowired
	private PedidosRepository pedidoRepository;
	
	@Override	
	@Cacheable(value= "pedidoCache", key= "#id")		
	public Pedidos getPedidoById(long id) {
		System.out.println("getPedidoById()");		
		return pedidoRepository.findById(id).get();
	}
	@Override	
	@Cacheable(value= "allPedidosCache", unless= "#result.size() == 0")	
	public List<Pedidos> getAllPedidos(){
		System.out.println("getAllPedidos()");
		List<Pedidos> lista = new ArrayList<>();
		pedidoRepository.findAll().forEach(e -> lista.add(e));
		return lista;
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "pedidoCache", key= "#pedido.id") },
		evict= { @CacheEvict(value= "allPedidosCache", allEntries= true) }
	)
	public Pedidos addPedido(Pedidos pedido){
		System.out.println("addPedido()");		
		return pedidoRepository.save(pedido);
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "pedidoCache", key= "#pedido.id") },
		evict= { @CacheEvict(value= "allPedidosCache", allEntries= true) }
	)
	public Pedidos updatePedido(Pedidos pedido) {
		System.out.println("updatePedido()");		
		return pedidoRepository.save(pedido);
	}
	@Override	
	@Caching(
		evict= { 
			@CacheEvict(value= "pedidoCache", key= "#id"),
			@CacheEvict(value= "allPedidosCache", allEntries= true)
		}
	)
	public void deletePedido(long id) {
		System.out.println("deletePedido()");		
		pedidoRepository.delete(pedidoRepository.findById(id).get());
	}
} 