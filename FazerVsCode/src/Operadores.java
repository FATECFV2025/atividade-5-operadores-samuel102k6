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
}