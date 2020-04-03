public class Pessoa{
    
         String nome;
         String cpf;
         String endereco;
         double altura;
         double peso;
    
    public double calculoImc(){
        return peso/(altura * altura);
    }
    
    
    public void imc(){
        double ind = calculoImc();
        if(ind < 18.5){
            System.out.println("Deficit de massa corporal\n");
            System.out.println("Risco de doença baixo\n");
        }
        else if(ind > 18.4 && ind < 25){
            System.out.println("Massa corporal normal\n");
            System.out.println("Risco de doença normal\n");
        }
        else if(ind > 24.9 && ind < 30){
            System.out.println("Sobrepeso\n");
            System.out.println("Risco de doença elevado\n");
        }
        else if(ind > 29.9 && ind < 35){
            System.out.println("Obesidade leve");
            System.out.println("Risco de doença alto\n");
        }
        else if(ind > 34.9 && ind < 40){
            System.out.println("Obesidade média");
            System.out.println("Risco de doença muito alto\n");
        }
        else if(ind > 40){
            System.out.println("Obesidade mórbida\n");
            System.out.println("Risco de doença iminente\n");
        }
    }
}