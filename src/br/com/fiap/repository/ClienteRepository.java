package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}