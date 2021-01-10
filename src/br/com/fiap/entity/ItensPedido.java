package br.com.fiap.entity;

import java.io.Serializable;

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
	private ItensPedidoPK itempedidoPK; 

	public double quantidade;
	public double valorUni;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="id",referencedColumnName="id"),
		 @JoinColumn(name="sequencia",referencedColumnName="sequencia")})
	private Pedidos pedido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPRODUTO")
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
	
	public Pedidos getPedido() {
		return pedido;
	}

	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}

	public ItensPedidoPK getItemPedidoPK() {
		return itempedidoPK;
	}

	public void setItensPedidoPK(ItensPedidoPK itempedidoPK) {
		this.itempedidoPK = itempedidoPK;
	}

}