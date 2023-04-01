import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chassi> entidades1 = new ArrayList<Chassi>();
        ArrayList<Regular> entidades2 = new ArrayList<Regular>();

        // lê o arquivo entrada1.txt
        try {
            File file = new File("entrada1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] valores = linha.split(";");

                // cria o objeto com base na primeira coluna (Carro ou Fabricante)
                if (valores[0].equals("Carro")) {
                    Carro carro = new Carro(valores[1], valores[2], valores[3], valores[4]);
                    entidades1.add(carro);
                    int contadorCarros = 0;
                    for (Chassi entidade : entidades1) {
                        if (entidade instanceof Carro) {
                            carro = (Carro) entidade;
                            contadorCarros++;
                        }
                    }
                    // escrever a saída no arquivo resultado1.txt
                    FileWriter writer = new FileWriter("resultado1.txt");
                    writer.write("Quantidade de carros: " + contadorCarros);
                    writer.close();
                } else if (valores[0].equals("Fabricante")) {
                    Fabricante fabricante = new Fabricante(valores[1], valores[2]);
                    entidades1.add(fabricante);
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // lê o arquivo entrada2.txt
        try {
            File file = new File("entrada2.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] valores = linha.split(";");

                // cria o objeto com base na primeira coluna (IPVA ou Multa)
                if (valores[0].equals("IPVA")) {
                    IPVA ipva = new IPVA(Double.parseDouble(valores[1]), valores[2], valores[3]);
                    entidades2.add(ipva);

                } else if (valores[0].equals("Multa")) {
                    Multa multa = new Multa(Double.parseDouble(valores[1]), valores[2], valores[3]);
                    entidades2.add(multa);
                    int contadorMulta = 0;
                    for (Regular entidade : entidades2) {
                        if (entidade instanceof Multa) {
                            multa = (Multa) entidade;
                            contadorMulta++;
                        }
                    }
                    double valorTotalMultas = 0;
                    for (Regular entidade : entidades2) {
                        if (entidade instanceof Multa) {
                            multa = (Multa) entidade;
                            valorTotalMultas += multa.getValor();
                        }
                    }
                    // escrever a saída no arquivo resultado2.txt
                    FileWriter writer = new FileWriter("resultado2.txt");
                    writer.write("Quantidade de multas: " + contadorMulta + "\n");
                    writer.write("Somatorio das multas: " + valorTotalMultas + "\n");
                    writer.close();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // exibe as entidades presentes nos ArrayLists
        System.out.println("Entidades 1:");
        for (Chassi entidade : entidades1) {
            System.out.println(entidade.toString());
        }

        System.out.println("Entidades 2:");
        for (Regular entidade : entidades2) {
            System.out.println(entidade.toString());
        }
    }
}
