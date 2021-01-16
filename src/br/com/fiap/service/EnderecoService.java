package br.com.fiap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import br.com.fiap.entity.Endereco;
import br.com.fiap.repository.EnderecoRepository;

@Service
public class EnderecoService implements IEnderecoService {
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override	
	@Cacheable(value= "enderecoCache", key= "#id")		
	public Endereco getEnderecoById(long id) {
		System.out.println("getEnderecoById()");		
		Endereco endereco = enderecoRepository.findById(id);
		System.out.println(endereco.cidade);
		return endereco;
	}
	@Override	
	@Cacheable(value= "allEnderecosCache", unless= "#result.size() == 0")	
	public List<Endereco> getAllEnderecos(){
		System.out.println("getAllEnderecos()");
		List<Endereco> lista = new ArrayList<>();
		enderecoRepository.findAll().forEach(e -> lista.add(e));
		return lista;
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "enderecoCache", key= "#endereco.id") },
		evict= { @CacheEvict(value= "allEnderecosCache", allEntries= true) }
	)
	public Endereco addEndereco(Endereco endereco){
		System.out.println("addEndereco()");		
		return enderecoRepository.save(endereco);
	}
	@Override	
	@Caching(
		put= { @CachePut(value= "enderecoCache", key= "#endereco.id") },
		evict= { @CacheEvict(value= "allEnderecosCache", allEntries= true) }
	)
	public Endereco updateEndereco(Endereco endereco) {
		System.out.println("updateEndereco()");		
		return enderecoRepository.save(endereco);
	}
	@Override	
	@Caching(
		evict= { 
			@CacheEvict(value= "enderecoCache", key= "#id"),
			@CacheEvict(value= "allEnderecosCache", allEntries= true)
		}
	)
	public void deleteEndereco(long id) {
		System.out.println("deleteEndereco()");		
		enderecoRepository.delete(enderecoRepository.findById(id));
	}
} 