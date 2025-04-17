//package br.com.votehub.api.entity;
//
//import br.com.votehub.api.domain.Scheme;
//import jakarta.persistence.Entity;
//
//import java.time.LocalDateTime;
//
//@Entity
//public class Voto extends Scheme {
//    private Long id;
//    private String description; //TODO: definir o tamanho dos caracteres a serem armazenados no banco de dados ou deixar padrão (255).
//    private LocalDateTime creationDate = LocalDateTime.now();
//    private LocalDateTime expirationDate = null; //Tornar obrigatório inserir a data de encerramento e/ou deixar que encerre automaticamente quando o cliente compartilhar o código e todos os usuários já tiver votado.
//    private boolean generateCode = false;
//    private final Long answersNumber = 0L;
//
//    public Voto() {
//    }
//
//    public Voto(String description, LocalDateTime expirationDate, boolean generateCode) {
//        this.description = description;
//        this.expirationDate = expirationDate;
//        this.generateCode = generateCode;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public LocalDateTime getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(LocalDateTime creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public LocalDateTime getExpirationDate() {
//        return expirationDate;
//    }
//
//    public void setExpirationDate(LocalDateTime expirationDate) {
//        this.expirationDate = expirationDate;
//    }
//
//    public boolean isGenerateCode() {
//        return generateCode;
//    }
//
//    public void setGenerateCode(boolean generateCode) {
//        this.generateCode = generateCode;
//    }
//
//    public Long getAnswersNumber() {
//        return answersNumber;
//    }
//}
