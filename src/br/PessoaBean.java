package br;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class PessoaBean implements Serializable {

    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas = new ArrayList<>();
    private Long contadorId = 1L;

    public void salvar() {
        if (pessoa.getId() == null) {
            pessoa.setId(contadorId++);
            pessoas.add(pessoa);
        }
        pessoa = new Pessoa(); // limpa o formulário
    }

    public void editar(Pessoa p) {
        this.pessoa = p;
    }

    public void excluir(Pessoa p) {
        pessoas.remove(p);
    }

    // getters e setters
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
