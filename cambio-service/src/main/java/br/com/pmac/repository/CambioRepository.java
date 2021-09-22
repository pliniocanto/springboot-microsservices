package br.com.pmac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pmac.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}