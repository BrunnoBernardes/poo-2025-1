import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AtletasManager {

    private static final String CSV_FILE = "atletas.csv";

    public static void filtrarAtletas() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(CSV_FILE))) {
            String linha = reader.readLine(); // consome cabeçalho
            System.out.println("Atletas com altura > 170cm e peso < 80kg:");
            while ((linha = reader.readLine()) != null) {
                String[] parts = linha.split(",", -1);
                String nome = parts[0];
                int altura = Integer.parseInt(parts[1]);
                double peso = Double.parseDouble(parts[2]);
                if (altura > 170 && peso < 80) {
                    System.out.println(" - " + nome);
                }
            }
        }
    }

    public static void adicionarAtleta(String nome, int altura, double peso) throws IOException {
        // 1) Lê todos os nomes existentes
        Set<String> nomesExistentes = new HashSet<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(CSV_FILE))) {
            String linha = reader.readLine(); // consome cabeçalho
            while ((linha = reader.readLine()) != null) {
                String[] parts = linha.split(",", -1);
                nomesExistentes.add(parts[0]);
            }
        }

        // 2) Verifica duplicata
        if (nomesExistentes.contains(nome)) {
            System.out.println(nome + "' já está no arquivo. Nenhuma linha foi adicionada.");
            return;
        }

        // 3) Adiciona em modo append
        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(CSV_FILE),
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE)) {
            writer.write(String.format("%s,%d,%.1f%n", nome, altura, peso));
            System.out.println("Adicionado: " + nome);
        }
    }

    public static void mostrarConteudo() throws IOException {
        System.out.println("\nConteúdo completo de " + CSV_FILE + ":");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(CSV_FILE))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }

    public static void main(String[] args) {
        try {
            // 1) Filtra e mostra atletas conforme condição
            filtrarAtletas();

            // 2) Adiciona você como reforço (só uma vez)
            String meuNome = "Brunno";
            int minhaAlt = 180;
            double meuPeso = 72.0;
            adicionarAtleta(meuNome, minhaAlt, meuPeso);

            // 3) Mostra o arquivo completo após a atualização
            mostrarConteudo();

        } catch (IOException e) {
            System.err.println("Erro de I/O: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
