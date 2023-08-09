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
   
    public static void mensagem(Float real, boolean trc){
        Integer centavos = Math.round(real*100);
        List<Cedulas> cedulas = notas();
        
        String msg = "R$ "+ real+ " Reais é equivalente a:";
        if (trc){
            msg = "O troco mais fácil é de: ";
        }   
        System.out.println();
        System.out.println(msg);

        for (int i = 0 ; i < cedulas.size(); i++){
            Cedulas cedula = cedulas.get(i);
            int valor = cedula.getValor();
            String nome = cedula.getCedula();

            if (contador(centavos, valor)>0){
                System.out.println(contador(centavos, valor) + " " + nome + " e sobram " + resto (centavos, valor) + " centavos");
                if(trc){
                    centavos = resto(centavos, valor);
                }
            }
        }
    
    }

    public static void main(String[] args) {
        Float real;
        Scanner s = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        boolean tf;
        do {
        System.out.println();    
        System.out.println("Digite o valor do troco em reais: ");
        real = s.nextFloat();
        
        mensagem(real, false);
        
        System.out.println();
        System.out.println("Deseja saber o troco fácil?[y/n] ");
        String yn = y.nextLine();
        tf =  yn.equals("y");
        if (tf){
            mensagem(real, tf );
        }

        System.out.println();
        System.out.println("Deseja fazer outra operação?[y/n] ");
        yn = y.nextLine();
        tf =  yn.equals("y");
    
        } while (tf);
        
        }
    
}
