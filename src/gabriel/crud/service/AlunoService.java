package gabriel.crud.service;

import gabriel.crud.model.Aluno;
import gabriel.crud.repository.AlunoRepository;

import java.util.List;

public class AlunoService {

    private final AlunoRepository repository = new AlunoRepository();

    public void cadastrar(String nome, String email) {
        repository.salvar(new Aluno(0, nome, email));
    }

    public void listar() {
        List<Aluno> alunos = repository.listar();
        alunos.forEach(System.out::println);
    }

    public void atualizar(int id, String nome, String email) {
        repository.atualizar(new Aluno(id, nome, email));
    }

    public boolean remover(int id) {
        return repository.remover(id);
    }

    public boolean existeAluno(int id) {
        return repository.buscarPorId(id) != null;
    }

    public Aluno buscarPorNome(String nome) {
        return repository.buscarPorNome(nome);
    }
}


