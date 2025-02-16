package recursiva_fatorial;

public class Fatorial {
	 // 
    public static int fatorar(int n) {
    	
        //ponto de parada - quando n for 0 ou 1 
        if ( n==0 || n == 1) {
            return 1;
        }
        
        //Chama a função passando o valor atual -1, e será executado até o valor de n ser > que 0
        return n * fatorar(n - 1);
    }
}
