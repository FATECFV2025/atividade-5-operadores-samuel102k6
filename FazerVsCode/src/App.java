public class App {

    public static void funcao_teste (){
        Operadores op = new outperadores();

        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println("soma: "+op.adicao(1,2));
        System.out.println("subtração: "+op.subtracao(4,1));
        System.out.println("multiplicação: "+op.multiplicacao(3,3));
        System.out.println("divisão: "+op.divisao(1,2));

        System.out.println("\nOPERADORES DE ATRIBUIÇÃO");
        System.out.println("a += b = " + op.atribuicaoAdicao(4, 2));
        System.out.println("a -= b = " + op.atribuicaoSubtracao(6, 4));
        System.out.println("a *= b = " + op.atribuicaoMultiplicacao(4, 2));
        System.out.println("a /= b = " + op.atribuicaoDivisao(4, 2));
        System.out.println("a %= b = " + op.atribuicaoModulo(28, 8));


    }
    public static void main(String[] args) throws Exception {
        funcao_teste();
    }
}
