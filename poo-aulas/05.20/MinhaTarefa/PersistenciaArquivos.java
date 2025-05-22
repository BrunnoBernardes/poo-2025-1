import java.io.*;

public class PersistenciaArquivos {
    public static void main(String[] args) {
        String caminho = "teste.txt";
        System.out.println("Diretório: " + new File(caminho).getAbsolutePath());

        // Criar o arquivo se não existir
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(caminho));
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
            return;
        }

        String matricula = "202405846";
        String nome = "Brunno Bernardes";
        boolean encontrou = false;
        StringBuilder conteudoNovo = new StringBuilder();

        // Faz a leitura do arquivo e verifica se a matrícula e o nome existem
        System.out.println("\nConteúdo:");
        String linha;
        try {
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
                conteudoNovo.append(linha).append("\n");

                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    String matLinha = partes[0].trim();
                    String nomeLinha = partes[1].trim();

                    if (matLinha.equals(matricula) && nomeLinha.equalsIgnoreCase(nome)) {
                        encontrou = true;
                    }
                }
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao fazer a leitura.");
            return;
        }

        // Adiciona a matrícula e o nome se não tiver
        if (!encontrou) {
            conteudoNovo.append(matricula).append(";").append(nome).append("\n");
            System.out.println("\nMatricula e nome adicionados.");
        } else {
            System.out.println("\nMatricula e nome já presentes.");
        }

        conteudoNovo.append("d\n");

        // Salvar o conteúdo atualizado no arquivo
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho));
            escritor.write(conteudoNovo.toString());
            escritor.close();
            System.out.println("Arquivo salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }
    }
}