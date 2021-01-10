package br.com.fiap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import br.com.fiap.entity.ItensPedido;
import br.com.fiap.repository.ItensPedidoRepository;

@Service
public class ItensPedidoService implements IItensPedidoService {
	@Autowired
	private ItensPedidoRepository itenspedidoRepository;
	
	@Override	
	@Cacheable(value= "ItensPedidoCache", key= "#id")		
	public ItensPedido getItemPedidoByIdAndSeq(long id, int seq) {
		System.out.println("getItensPedidoByIdAndSeq()");		
		return itenspedidoRepository.findByIdAndSeq(id, seq).get();
	}
	@Override	
	@Cacheable(value= "allItensPedidosCache", unless= "#result.size() == 0")	
	public List<ItensPedido> getAllItensPedido(long id){
		System.out.println("getAllItensPedido()");
		List<ItensPedido> lista = new ArrayList<>();
		itenspedidoRepository.findAll().forEach(e -> lista.add(e));
		return lista;
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "ItensPedidoCache", key= "#ItensPedido.id") },
		evict= { @CacheEvict(value= "allItensPedidosCache", allEntries= true) }
	)
	public ItensPedido addItemPedido(ItensPedido ItensPedido){
		System.out.println("addItemPedido()");		
		return itenspedidoRepository.save(ItensPedido);
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "ItensPedidoCache", key= "#ItensPedido.id") },
		evict= { @CacheEvict(value= "allItensPedidosCache", allEntries= true) }
	)
	public ItensPedido updateItemPedido(ItensPedido ItensPedido) {
		System.out.println("UpdateItemPedido()");		
		return itenspedidoRepository.save(ItensPedido);
	}
	@Caching(
		evict= { 
			@CacheEvict(value= "ItensPedidoCache", key= "#id"),
			@CacheEvict(value= "allItensPedidosCache", allEntries= true)
		}
	)
	public void deleteItemPedido(ItensPedido itempedido) {
		System.out.println("deleteItensPedido()");		
		itenspedidoRepository.delete(itempedido);
	}

} 