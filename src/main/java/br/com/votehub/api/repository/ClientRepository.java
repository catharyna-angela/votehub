package br.com.votehub.api.repository;

import br.com.votehub.api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client,Long>, JpaRepository<Client,Long> { //JpaRepository e PagingAndSortingRepository
    public Optional<Client> findByEmail(String email); //Implementação para buscar o email na base de dados para validar e impedir que outra conta exista com o mesmo email.

}
