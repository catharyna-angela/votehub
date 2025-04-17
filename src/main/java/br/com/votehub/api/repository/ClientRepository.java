package br.com.votehub.api.repository;

import br.com.votehub.api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client,Long>, JpaRepository<Client,Long> { //JpaRepository e PagingAndSortingRepository
    public Optional<Client> findByEmail(String email); //Implementei porque preciso buscar o email na base de dados para validar e impedir que outra conta exista com o mesmo email.

    //Para salvar no banco de dados usando save, posso usar a nomenclatura do spring para sobrescrever.
    // Não preciso implementar nada aqui porque o CrudRepository já faz isso por debaixo dos panos.
}
