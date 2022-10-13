import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
        Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
        e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
        */

        List<Double> temperatura = new ArrayList<Double>(){{
            add(new Double(15));
            add(new Double(25));
            add(new Double(30));
            add(new Double(15));
            add(new Double(15));
            add(new Double(22));
            
        }};

        System.out.print("Temperaturas:");
        System.out.println(temperatura);


        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
                   
        }


        Double media = soma / 6;
        System.out.print("Média de temperaturas: ");
        System.out.println(media);


        System.out.println("Meses em que as temperaturas foram acima da média: ");
        for (Double double1 : temperatura) {
            if(temperatura.indexOf(double1) == 0 && media < double1){   
                System.out.println("1 - Janeiro " + double1);
            }
            if(temperatura.indexOf(double1) == 1 && media < double1){
                System.out.println("2 - Fevereiro " + double1);
            }
            if(temperatura.indexOf(double1) == 2 && media < double1){
                System.out.println("3 - Marco " + double1);
            }
            if(temperatura.indexOf(double1) == 3 && media < double1){
                System.out.println("4 - Abril " + double1);
            }
            if(temperatura.indexOf(double1) == 4 && media < double1){
                System.out.println("5 - Maio " + double1);
            }
            if(temperatura.indexOf(double1) == 5 && media < double1){
                System.out.println("6 - Junho " + double1);
            }
            //System.out.println();            
        }

        }
        

    
    }

