package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fiap.entity.ItensPedido;
import br.com.fiap.entity.ItensPedidoPK;
import br.com.fiap.service.IItensPedidoService;

@RestController
@RequestMapping("vendas2")
public class ItensPedidoController {
	
	@Autowired
	private IItensPedidoService itenspedidoService;
	
    @RequestMapping("greeting")
    public String greeting() {
        return "Teste!";
    }
	@GetMapping("itenspedido/{id}")
	public ResponseEntity<ItensPedido> getItensPedidoByIdAndSeq(ItensPedidoPK itenspedidopk) {
		ItensPedido itenspedido = itenspedidoService.getItemPedidoByIdAndSeq(itenspedidopk.getIDPedido(), itenspedidopk.getSequencia());
		return new ResponseEntity<ItensPedido>(itenspedido, HttpStatus.OK);
	}
	@GetMapping("itenspedidos")
	public ResponseEntity<List<ItensPedido>> getAllItensPedidos(long id) {
		List<ItensPedido> lista = itenspedidoService.getAllItensPedido(id);
		return new ResponseEntity<List<ItensPedido>>(lista, HttpStatus.OK);
	}
	@PostMapping("itenspedido")
	public ResponseEntity<Void> addItensPedido(@RequestBody ItensPedido itenspedido, UriComponentsBuilder builder) {
		ItensPedido savedItensPedido = itenspedidoService.addItemPedido(itenspedido);  
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/itenspedido/{id}").buildAndExpand(savedItensPedido.getItemPedidoPK().getIDPedido()).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("itenspedido")
	public ResponseEntity<ItensPedido> updateItensPedido(@RequestBody ItensPedido itenspedido) {
		itenspedidoService.updateItemPedido(itenspedido);
		return new ResponseEntity<ItensPedido>(itenspedido, HttpStatus.OK);
	}
	@DeleteMapping("itenspedido/{id}")
	public ResponseEntity<Void> deleteArticle(ItensPedido itenspedido) {
		itenspedidoService.deleteItemPedido(itenspedido);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
