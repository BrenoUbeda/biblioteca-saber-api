package br.com.una.bibliotecasaberapi;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_bibliotecario")
public class bibliotecario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    private String email;
    private String senha;

    /* Finalizar o método de cadastro */


    private void cadastraLivro(){

    }
}
