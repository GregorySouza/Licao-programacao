import java.util.Scanner;

public class licao {

    public static void main(String[] args) {
             
        int x = 14;
        double d = 3.1415;
        byte b = 23;
        long l = 5757;
        short s = 32767;


        System.out.println(x);
        System.out.println("calculo 1: " + (x + l / (3 * 3) % 3 + x / 3 % 3 + x % 3 * d) + s);
        System.out.println(
                "calculo 2: " + x / (2 * 2 * 2 * 2) % 2 + x / (2 * 2 * 2) % 2 + x / (2 * 2) % 2 + x / 2 % 2 + x % 2);
        System.out.println(b);
    

                  
        String var[] = { "int", "double", "byte", "long", "short" };
        String res[] = { "14", "3.1415", "23", "5757", "32767" };
        
        
            for (int c=0; c<var.length; c++) {
            System.out.println("o resultado é " + var[c] + ": " + res[c] + " ao todo. ");
            }
                
                int resultado = 1000 + 1024;
                
                int numero = 2023;
                
                boolean resposta;
                
                if (resultado > numero) {
                    resposta = true;
                } else {
                    resposta = false;
                }
                
                System.out.println(resposta);
                
                
                Scanner in = new Scanner(System.in);
            
                int tentativa = -1;
                
                    while (tentativa != 10) { 

                    System.out.println("Digite um número: ");
                    
                    tentativa = in.nextInt();
                    
                        if (tentativa == 10) {
                        
                            System.out.println("Você acertou!");
                        
                }       else {
                            
                            System.out.println("Você errou :(");
                            
            }
        }
    }
            
}
    