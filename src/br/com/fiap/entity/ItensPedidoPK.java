package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class ItensPedidoPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	public long idpedido;

	@Column(name = "sequencia")
	public int sequencia;

	public long getIDPedido() {
		return idpedido;
	}

	public void setIDPedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ItensPedidoPK) {
			ItensPedidoPK pk = (ItensPedidoPK) o;
			if (this.getIDPedido() != pk.getIDPedido()) {
				return false;
			}
			if (this.getSequencia() != pk.getSequencia()) {
				return false;
			}
			return true;
		}
		return false;
	}	

}
