package entities; //Pacote da classe

/*O public indica que poderá ser utilizado em um outro arquivo*/

public class Triangle {
    /*Criando uma classe (Triangle) e abaixo os atributos dessa classe (a,b e c)*/
    public double a, b, c;


    /*Essa classe é a reponsável por saber como se calcula a área de um triângulo, logo vamos criar um método*/

    public double area () {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
