package br.com.fiap.test;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.fiap.entity.*;

public class ClientUtil {
	public void getProdutoByIdDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Produto> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Produto.class, id);
		Produto produto = responseEntity.getBody();
		System.out.println(produto);
	}

	public void getAllProdutosDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produtos";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Produto[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Produto[].class);
		Produto[] produtos = responseEntity.getBody();
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public void addProdutoDemo(Produto objProduto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(objProduto, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updateProdutoDemo(Produto objProduto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(objProduto, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deleteProdutoDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto/{id}";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, id);
	}
	
	public void getClienteByIdDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/usuario/cliente/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Cliente> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Cliente.class, id);
		Cliente cliente = responseEntity.getBody();
		System.out.println(cliente);
	}

	public void getAllClientesDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/usuario/clientes";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Cliente[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Cliente[].class);
		Cliente[] clientes = responseEntity.getBody();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

	public void addClienteDemo(Cliente objCliente) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/usuario/cliente";
		HttpEntity<Cliente> requestEntity = new HttpEntity<Cliente>(objCliente, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
		
	}

	public void updateClienteDemo(Cliente objCliente) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/usuario/cliente";
		HttpEntity<Cliente> requestEntity = new HttpEntity<Cliente>(objCliente, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deleteClienteDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/usuario/cliente/{id}";
		HttpEntity<Cliente> requestEntity = new HttpEntity<Cliente>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, id);
	}

public void getEnderecoByIdDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/entrega/endereco/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Endereco> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Endereco.class, id);
		Endereco endereco = responseEntity.getBody();
		System.out.println(endereco);
	}

	public void getAllEnderecosDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/entrega/enderecos";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Endereco[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Endereco[].class);
		Endereco[] enderecos = responseEntity.getBody();
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
		}
	}

	public void addEnderecoDemo(Endereco objEndereco) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/entrega/endereco";
		HttpEntity<Endereco> requestEntity = new HttpEntity<Endereco>(objEndereco, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updateEnderecoDemo(Endereco objEndereco) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/entrega/endereco";
		HttpEntity<Endereco> requestEntity = new HttpEntity<Endereco>(objEndereco, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deleteEnderecoDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/entrega/endereco/{id}";
		HttpEntity<Endereco> requestEntity = new HttpEntity<Endereco>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, id);
	}

public void getPedidoByIdDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/pedido/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Pedidos> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Pedidos.class, id);
		Pedidos pedido = responseEntity.getBody();
		System.out.println(pedido);
	}

	public void getAllPedidosDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/pedidos";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Pedidos[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Pedidos[].class);
		Pedidos[] pedidos = responseEntity.getBody();
		for (Pedidos pedido : pedidos) {
			System.out.println(pedido);
		}
	}

	public void addPedidoDemo(Pedidos objPedido) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/pedido";
		HttpEntity<Pedidos> requestEntity = new HttpEntity<Pedidos>(objPedido, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updatePedidoDemo(Pedidos objPedido) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/pedido";
		HttpEntity<Pedidos> requestEntity = new HttpEntity<Pedidos>(objPedido, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deletePedidoDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/pedido/{id}";
		HttpEntity<Pedidos> requestEntity = new HttpEntity<Pedidos>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, id);
	}

	public static void main(String args[]) {
		ClientUtil util = new ClientUtil();
		
		Produto objProduto1 = new Produto(1, "Morango", 10, 1.00);
		Produto objProduto2 = new Produto(2, "Maca", 100, 0.50);
		Produto objProduto3 = new Produto(3, "Laranja", 50, 0.50);
		util.addProdutoDemo(objProduto1);
		util.addProdutoDemo(objProduto2);
		util.addProdutoDemo(objProduto3);
		
		Cliente cliente = new Cliente(1, "Coca-Cola");
		Endereco endereco = new Endereco(1, "Rua Teste", "Sao Paulo", "07435-655");
		endereco.setCliente(cliente);
		util.addClienteDemo(cliente);
		util.addEnderecoDemo(endereco);
	}
}