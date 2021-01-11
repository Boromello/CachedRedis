package br.com.fiap.entity;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String nome;	
	public long quantidade;
	public double valor;
	
	public Produto(long id, String nome, long qtde, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = qtde;
		this.valor = valor;
		
	}

	public Produto() {
		super();
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "produto")
	private Set<ItensPedido> itenspedidos = new LinkedHashSet<ItensPedido>();
}