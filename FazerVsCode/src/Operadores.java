public class Operadores{
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
}