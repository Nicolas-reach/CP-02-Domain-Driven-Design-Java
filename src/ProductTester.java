import java.util.Locale;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        // Locale.US para aceitar preços com ponto (ex.: 29.99)
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        int maxSize;

        // ===== Número de produtos a adicionar (do while até valor >= 0) =====
        do {
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Insira \"0\" (zero) se não quiser adicionar mais produtos:");
            maxSize = in.nextInt();
            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido");
            }
        } while (maxSize < 0);

        if (maxSize == 0) {
            System.out.println("Não há produtos!");
        } else {
            Produto[] produtos = new Produto[maxSize];

            for (int i = 0; i < maxSize; i++) {
                in.nextLine(); // limpa o buffer de entrada

                System.out.println("\n--- Produto " + (i + 1) + " de " + maxSize + " ---");
                System.out.print("Nome do produto: ");
                tempName = in.nextLine();
                System.out.print("Quantidade em estoque: ");
                tempQty = in.nextInt();
                System.out.print("Preço: ");
                tempPrice = in.nextDouble();
                System.out.print("Número do item: ");
                tempNumber = in.nextInt();

                produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
            }

            System.out.println("\n===== Produtos do array =====\n");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }

        // ===== p1 e p2 com valores inseridos pelo usuário =====
        in.nextLine(); // limpa o buffer de entrada

        System.out.println("\n--- Dados do produto p1 ---");
        System.out.print("Nome do produto: ");
        tempName = in.nextLine();
        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();
        System.out.print("Preço: ");
        tempPrice = in.nextDouble();
        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        in.nextLine(); // limpa o buffer de entrada antes de pedir os dados de p2

        System.out.println("\n--- Dados do produto p2 ---");
        System.out.print("Nome do produto: ");
        tempName = in.nextLine();
        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();
        System.out.print("Preço: ");
        tempPrice = in.nextDouble();
        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        in.close();

        // ===== Demais produtos =====
        Produto p3 = new Produto(3, "DVD O Senhor dos Anéis", 12, 49.90);
        Produto p4 = new Produto(4, "Software Antivírus", 8, 119.90);
        Produto p5 = new Produto(); // construtor padrão
        Produto p6 = new Produto(); // construtor padrão

        p1.setAtivo(false);

        System.out.println("\n===== Produtos p1 a p6 =====\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
