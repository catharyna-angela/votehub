package br.com.votehub.api.entity;

import br.com.votehub.api.domain.Scheme;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private LocalDateTime date = LocalDateTime.now(); //LocalDateTime é o mais recente para tratar horas e datas.

//    private Scheme scheme;

    public Client() {
    }

    public Client(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password; //TODO: adicionar no DTO
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

//    public Scheme getScheme() {
//        return scheme;
//    }

//    public void setScheme(Scheme scheme) {
//        this.scheme = scheme;
//    }
}

