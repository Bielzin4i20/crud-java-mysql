package gabriel.crud.repository;

import gabriel.crud.model.Aluno;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AlunoCsvRepository {

    private static final String ARQUIVO = "alunos.csv";

    public void exportar(List<Aluno> alunos) {

        try (FileWriter writer = new FileWriter(ARQUIVO)) {

            writer.write("id,nome,email\n");

            for (Aluno a : alunos) {
                writer.write(
                        a.getId() + "," +
                                a.getNome() + "," +
                                a.getEmail() + "\n"
                );
            }

            System.out.println("Arquivo alunos.csv gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gerar CSV.");
        }
    }
}

