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

import br.com.fiap.entity.Endereco;
import br.com.fiap.service.IEnderecoService;

@RestController
@RequestMapping("entrega")
public class EnderecoController {
	@Autowired
	private IEnderecoService enderecoService;
	
    @RequestMapping("greeting")
    public String greeting() {
        return "Teste!";
    }
	@GetMapping("endereco/{id}")
	public ResponseEntity<Endereco> getEnderecoById(@PathVariable("id") Long id) {
		Endereco endereco = enderecoService.getEnderecoById(id);
		return new ResponseEntity<Endereco>(endereco, HttpStatus.OK);
	}
	@GetMapping("enderecos")
	public ResponseEntity<List<Endereco>> getAllEnderecos() {
		List<Endereco> lista = enderecoService.getAllEnderecos();
		return new ResponseEntity<List<Endereco>>(lista, HttpStatus.OK);
	}
	@PostMapping("endereco")
	public ResponseEntity<Void> addEndereco(@RequestBody Endereco endereco, UriComponentsBuilder builder) {
		Endereco savedEndereco = enderecoService.addEndereco(endereco);  
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/endereco/{id}").buildAndExpand(savedEndereco.id).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("endereco")
	public ResponseEntity<Endereco> updateEndereco(@RequestBody Endereco endereco) {
		enderecoService.updateEndereco(endereco);
		return new ResponseEntity<Endereco>(endereco, HttpStatus.OK);
	}
	@DeleteMapping("endereco/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Long id) {
		enderecoService.deleteEndereco(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
} 