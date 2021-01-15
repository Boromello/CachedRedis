package br.com.fiap.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name ="prod_sequence", sequenceName = "prod_sequence")
@Table(name = "produtos")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "prod_sequence")
	public long id;
	public String nome;	
	public long quantidade;
	public double valor;
	
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
                mappedBy = "produtos")
	private Set<Pedidos> pedidos = new HashSet<Pedidos>();
		
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
	
	public Set<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	
}