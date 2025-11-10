public class App {

    public static void funcao_teste (){
        Operadores op = new Operadores();

        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println("soma: "+op.adicao(1,2));
        System.out.println("subtração: "+op.subtracao(5,1));
        System.out.println("multiplicação: "+op.multiplicacao(3,3));
        System.out.println("divisão: "+op.divisao(1,2));

        System.out.println("\nOPERADORES DE ATRIBUIÇÃO");
        System.out.println("a += b = " + op.atribuicaoAdicao(4, 2));
        System.out.println("a -= b = " + op.atribuicaoSubtracao(6, 4));
        System.out.println("a *= b = " + op.atribuicaoMultiplicacao(4, 2));
        System.out.println("a /= b = " + op.atribuicaoDivisao(12, 2));
        System.out.println("a %= b = " + op.atribuicaoModulo(28, 8));

        System.out.println("\nOPERADORES LÓGICOS");
        boolean x = true, y = false;
        System.out.println("a && b = " +op.eLogico(x,y));
        System.out.println("a  b = " +op.ouLogico(x,y));
        System.out.println("a && b = " +op.naoLogico(x));
        System.out.println("a && b = " +op.ouExclusivo(x,y));

        System.out.println("\nOPERADORES DE COMPARAÇÃO");
        System.out.println("iguais: " +op.igual(2,-2));
        System.out.println("diferentes: " +op.diferente(2,-3));
        System.out.println("maior que: " +op.maiorQue(2,-3));
        System.out.println("menor que: " +op.menorQue(2,-3));
        System.out.println("maior ou igual: " +op.maiorOuIgual(2,-3));
        System.out.println("menor ou igual: " +op.menorOuIgual(2,-3));
    }
    public static void main(String[] args) throws Exception {
        funcao_teste();
    }
}
