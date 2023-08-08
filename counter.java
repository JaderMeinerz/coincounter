import java.util.ArrayList;
import java.util.List;
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

    public static List<Cedulas> notas(){
        List<Cedulas> cedulas = new ArrayList<Cedulas>();
        cedulas.add(new Cedulas("Nota de 100", 10000));
        cedulas.add(new Cedulas("Nota de 50", 5000));
        cedulas.add(new Cedulas("Nota de 20", 2000));
        cedulas.add(new Cedulas("Nota de 10", 1000));
        cedulas.add(new Cedulas("Nota de 5", 500));
        cedulas.add(new Cedulas("Nota de 2", 200));
        cedulas.add(new Cedulas("Moeda de 1", 100));
        cedulas.add(new Cedulas("Moeda de 50", 50));
        cedulas.add(new Cedulas("Moeda de 25", 25));
        cedulas.add(new Cedulas("Moeda de 10", 10));
        cedulas.add(new Cedulas("Moeda de 5", 5));

        return cedulas;
    }
   
    public static void mensagem(Float real){
        Integer centavos = Math.round(real*100);
        List<Cedulas> cedulas = notas();
           

        for (int i = 0 ; i < cedulas.size(); i++){
            Cedulas cedula = cedulas.get(i);
            int valor = cedula.getValor();
            String nome = cedula.getCedula();

            if (contador(centavos, valor)>0){
                System.out.println(contador(centavos, valor) + " " + nome + " e sobram " + resto (centavos, valor) + " centavos");
            }

        }
            
    }

    public static void troco(Float real){
        Integer centavos = Math.round(real*100);
        List<Cedulas> cedulas = notas();
           

        for (int i = 0 ; i < cedulas.size(); i++){
            Cedulas cedula = cedulas.get(i);
            int valor = cedula.getValor();
            String nome = cedula.getCedula();

            if (contador(centavos, valor)>0){
                System.out.println(contador(centavos, valor) + " " + nome );
                centavos = resto(centavos, valor);
            }

        }
            
    }

    
    public static void main(String[] args) {
        Float real;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor do troco em reais: ");
        real = s.nextFloat();
        
        System.out.println();

        System.out.println("R$ "+ real+ " Reais é equivalente a:");

        mensagem(real);
        
        System.out.println();

        System.out.println("O melhor troco para R$ "+ real +" é de: ");
        
        troco(real);
    }
    
}
