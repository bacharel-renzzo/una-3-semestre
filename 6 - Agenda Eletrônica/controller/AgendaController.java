package controller;

import model.Agenda;
import model.Contato;

public class AgendaController {

    private Agenda agenda;

    public AgendaController() {
        this.agenda = new Agenda();
    }

    public void adicionarContato(String nome, String email, long telefone) {
        Contato contato = new Contato(nome, email, telefone);
        agenda.adicionarContato(contato);
    }

    public boolean removerContato(String nome) {
        return agenda.removerContato(nome);
    }

    public Contato buscarContatoPorNome(String nome) {
        return agenda.buscarContatoPorNome(nome);
    }

    public Contato buscarContatoPorEmail(String email) {
        return agenda.buscarContatoPorEmail(email);
    }

    public Contato buscarContatoPorTelefone(long telefone) {
        return agenda.buscarContatoPorTelefone(telefone);
    }

    public int getTamanho() {
        return agenda.getTamanho();
    }
}
