package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private int tamanho;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.tamanho = 0;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        tamanho++;
    }

    public boolean removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorEmail(String email) {
        for (Contato contato : contatos) {
            if (contato.getEmail().equals(email)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorTelefone(long telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone() == telefone) {
                return contato;
            }
        }
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }
}
