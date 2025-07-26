import java.util.ArrayList; // importa a classe ArrayList para usar listas
import java.util.Scanner;  // importa a classe Scanner para ler do console

public class SepararGrupos {
    public static void main(String[] args) {

        // Criamos o objeto scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Criamos duas listas: uma para homens e outra para mulheres
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e os sexos separados por vírgula no formato: nome-sexo");
        System.out.println("Exemplo: Ana-F,João-M,Maria-F,Carlos-M");
        System.out.print("Entrada: ");

        // Lê toda a linha digitada pelo usuário
        String entrada = scanner.nextLine();

        // Usa o split para separar cada par nome-sexo pela vírgula
        String[] pessoas = entrada.split(",");

        // Fazemos um laço para percorrer cada nome-sexo
        for (String pessoa : pessoas) {
            // Usa o split de novo para separar nome e sexo
            String[] dados = pessoa.split("-");

            // Pega o nome e o sexo, removendo espaços em branco
            String nome = dados[0].trim();
            String sexo = dados[1].trim().toUpperCase(); // converte para maiúsculo

            // Verifica o sexo e adiciona na lista correta
            if (sexo.equals("M")) {
                grupoMasculino.add(nome); // adiciona no grupo masculino
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome); // adiciona no grupo feminino
            } else {
                System.out.println("Sexo inválido para: " + nome);
            }
        }

        // Exibe os resultados
        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println("- " + nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println("- " + nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
