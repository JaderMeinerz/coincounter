import java.util.Scanner;

/**
 * counter
 */
public class counter {
    
    public static Integer resto(Integer centavos, Integer valor){
        Integer resto = centavos % valor;
        return(resto);
    }

    public static Integer contador(Integer centavos, Integer valor){
        Integer contador = centavos / valor;
        return(contador);
    }


    
    public static void main(String[] args) {
        Float real;
        Integer centavos;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor do troco em reais: ");
        real = s.nextFloat();
        centavos = Math.round(real*100);
        
        Integer notaCem = 10000, 
        notaCinquenta = 5000, 
        notaVinte = 2000,
        notaDez = 1000,
        notaCinco = 500,
        notaDois = 200,
        moedaUm = 100,
        moedaCinquenta = 50,
        moedaVinteCinco = 25,
        moedaDez = 10,
        moedaCinco = 5;
        
        System.out.println("R$ "+ real+ " Reais é equivalente a:");
        System.out.println(contador(centavos, notaCem) + " Notas de 100 Reais e sobram "+ resto(centavos, notaCem)+ " centavos");
        System.out.println(contador(centavos, notaCinquenta)+ " Notas de 50 Reais e sobram "+ resto(centavos, notaCinquenta)+ " centavos");
        System.out.println(contador(centavos, notaVinte) + " Notas de 20 Reais e sobram "+ resto(centavos, notaVinte) + " centavos");
        System.out.println(contador(centavos, notaDez)+ " Notas de 10 Reais e sobram "+ resto(centavos, notaDez)+ " centavos");
        System.out.println(contador(centavos, notaCinco) + " Notas de 5 Reais e sobram "+ resto(centavos, notaCinco)+ " centavos");
        System.out.println(contador(centavos, notaDois) + " Notas de 2 Reais e sobram "+ resto(centavos, notaDois)+ " centavos");
        System.out.println(contador(centavos, moedaUm) + " Moedas de 1 Real e sobram "+ resto(centavos, moedaUm)+ " centavos");
        System.out.println(contador(centavos, moedaCinquenta) + " Moedas de 50 Centavos e sobram "+ resto(centavos, moedaCinquenta)+ " centavos");
        System.out.println(contador(centavos, moedaVinteCinco) + " Moedas de 25 Centavos e sobram "+ resto(centavos, moedaVinteCinco)+ " centavos");
        System.out.println(contador(centavos, moedaDez) + " Moedas de 10 Centavos e sobram "+ resto(centavos, moedaDez)+ " centavos");
        System.out.println(contador(centavos, moedaCinco) + " Moedas de 5 Centavos e sobram "+ resto(centavos, moedaCinco)+ " centavos");
        
    }
    
}
