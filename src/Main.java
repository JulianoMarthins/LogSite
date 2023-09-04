import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o local do arquivo: ");
        String path = sc.nextLine();


        //D:\WorkSpace\Arquivo\nomeSet.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {

                String[] filds = line.split(",");
                String userName = filds[0];
                Date moment = Date.from(Instant.parse(filds[1]));

                set.add(new LogEntry(userName, moment));

                line = br.readLine();

            }

            System.out.println("Número de acessos: " + set.size());

        } catch (FileNotFoundException e) {
            System.out.println("Error! Arquivo não encontrado");
            ;
        } catch (IOException e) {
            System.out.println("Error" + e);
            ;
        }


        sc.close();
    }
}