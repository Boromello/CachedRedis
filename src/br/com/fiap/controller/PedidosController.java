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

import br.com.fiap.entity.Pedidos;
import br.com.fiap.service.IPedidosService;

@RestController
@RequestMapping("vendas/pedidos")
public class PedidosController {
	
	@Autowired
	private IPedidosService pedidoService;
	
    @RequestMapping("greeting")
    public String greeting() {
        return "Teste!";
    }
	@GetMapping("pedido/{id}")
	public ResponseEntity<Pedidos> getPedidosById(@PathVariable("id") Long id) {
		Pedidos pedido = pedidoService.getPedidoById(id);
		return new ResponseEntity<Pedidos>(pedido, HttpStatus.OK);
	}
	@GetMapping("pedidos")
	public ResponseEntity<List<Pedidos>> getAllPedidoss() {
		List<Pedidos> lista = pedidoService.getAllPedidos();
		return new ResponseEntity<List<Pedidos>>(lista, HttpStatus.OK);
	}
	@PostMapping("pedido")
	public ResponseEntity<Void> addPedidos(@RequestBody Pedidos pedido, UriComponentsBuilder builder) {
		Pedidos savedPedidos = pedidoService.addPedido(pedido);  
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/pedido/{id}").buildAndExpand(savedPedidos.id).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("pedido")
	public ResponseEntity<Pedidos> updatePedidos(@RequestBody Pedidos pedido) {
		pedidoService.updatePedido(pedido);
		return new ResponseEntity<Pedidos>(pedido, HttpStatus.OK);
	}
	@DeleteMapping("pedido/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Long id) {
		pedidoService.deletePedido(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
