public class App {

    public static void funcao_teste (){
        Operadores op = new outperadores();

        System.out.println("soma: "+op.adicao(1,2));
        System.out.println("subtração: "+op.subtracao(4,1));
        System.out.println("multiplicação: "+op.multiplicacao(3,3));
        System.out.println("divisão: "+op.divisao(1,2));

    }
    public static void main(String[] args) throws Exception {
        funcao_teste();
    }
}
