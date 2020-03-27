package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Criando as variáveis x e y do tipo Triangle e instânciando(objetos instanciados em memória), pois sóquando instanciamos é que o objeto existe e podemos usá-lo*/

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        /*Lendo os valores*/
        System.out.println("Digite as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        /*Calculando os dados*/

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f\nÁrea do triângulo Y: %.4f%n", areaX, areaY);

        if (areaX > areaY) {
            System.out.println("Área do triângulo X é maior!");
        } else {
            System.out.println("Área do triângulo Y é maior!");
        }

        /*double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triângulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        Double p = (xA + xB + xC) / 2;
        Double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        Double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X: %.4f\nÁrea do triângulo Y: %.4f%n", areaX, areaY);

        if (areaX > areaY) {
            System.out.println("Área do triângulo X é maior!");
        } else {
            System.out.println("Área do triângulo Y é maior!");
        }*/

        sc.close();

        /*
         * Classe:
         * É um tipo estruturado que pode conter(membros):
         *   - Atributos(dados/campos)
         *   - Métodos(funções/operações)
         *
         * A classe também pode prover muitos outros recursos:
         *   - Contrutores
         *   - Sobrecarga
         *   - Encapsulamento
         *   - Herança
         *   - Polimorfismo
         *
         * Exemplos :
         *    - Entidades: Produto, Cliente, Triângulo
         *    - Serviços: ProdutoService, ClienteService, EmailService, StorageService
         *    - Controladores: ProdutoController, ClienteController
         *    - Utilitários: Calculadora, Compactador
         *    - Outros(views, repositórios, gerenciadores, etc)
         * */
    }
}
