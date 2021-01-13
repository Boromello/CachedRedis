package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itenspedido")
public class ItensPedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@JoinColumns({@JoinColumn(name="id",referencedColumnName="id"),
		 @JoinColumn(name="sequencia",referencedColumnName="sequencia")})
	public ItensPedidoPK itempedidoPK; 

	public double quantidade;
	public double valorUni;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id")
	private Pedidos pedido;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idproduto")
	private Produto produto;

	public double getQuantidade() {
		return quantidade;
	}	

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorUni() {
		return valorUni;
	}
	
	public void setValorUni(double valorUni) {
		this.valorUni = valorUni;
	}

	public ItensPedidoPK getItemPedidoPK() {
		return itempedidoPK;
	}

	public void setItensPedidoPK(ItensPedidoPK itempedidoPK) {
		this.itempedidoPK = itempedidoPK;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedidos getPedido() {
		return pedido;
	}

	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}
	
	public ItensPedido() {
		super();
	}
	
	public ItensPedido(double quantidade, double valorUni) {
		super();
		this.quantidade = quantidade;
		this.valorUni = valorUni;
	}
	

}