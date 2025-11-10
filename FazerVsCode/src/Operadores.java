public class Operadores{
    //operadores aritméticos
    public float adicao(float a,float b){
        return a + b;
    }

    public float subtracao(float a, float b){
        return a - b;
    }

    public float multiplicacao(float a, float b){
        return a * b;
    }
    
    public float divisao(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    //operadores de atribuição
    public float atribuicaoAdicao(float a, float b) {
        a += b;
        return a;
    }

    public float atribuicaoSubtracao(float a, float b) {
        a -= b;
        return a;
    }

    public float atribuicaoMultiplicacao(float a, float b) {
        a *= b;
        return a;
    }

    public float atribuicaoDivisao(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        a /= b;
        return a;
    }

    public float atribuicaoModulo(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Módulo por zero não permitido.");
        }
        a %= b;
        return a;
    }

    //operadores lógicos
    public boolean eLogico(boolean a, boolean b){
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b){
        return a || b;
    }

    public boolean naoLogico(boolean a){
        return !a;
    }

    public boolean ouExclusivo(boolean a, boolean b){
        return a ^ b;
    }

    //operadores de comparação
    public boolean igual(float a, float b){
        return a == b;
    }

    public boolean diferente(float a, float b){
        return a != b;
    }

    public boolean maiorQue(float a, float b){
        return a > b;
    }

    public boolean menorQue(float a, float b){
        return a < b;
    }

    public boolean maiorOuIgual(float a, float b){
        return a >= b;
    }

    public boolean menorOuIgual(float a, float b){
        return a <= b;
    }
}