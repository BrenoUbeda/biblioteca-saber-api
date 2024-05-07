package br.com.una.bibliotecasaberapi;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class aluno {

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
}


