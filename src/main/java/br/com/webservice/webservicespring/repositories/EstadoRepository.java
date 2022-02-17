package br.com.webservice.webservicespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webservice.webservicespring.domain.Estado;



@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
