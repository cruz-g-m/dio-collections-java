import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        List<String> respostas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");

        System.out.println("Telefonou para a vitima?");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vitima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vitima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vitima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);



        Integer count = 0;
        Iterator<String> contador = respostas.iterator();
       
        while (contador.hasNext()) {
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }

        }

        //System.out.println(count);

        switch (count) {
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CUMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINA");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }
}
