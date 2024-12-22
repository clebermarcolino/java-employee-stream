package aplication;

import entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter full file path: "); // Solicita o caminho completo do arquivo
        String filePath = sc.nextLine(); // Lê o caminho do arquivo digitado pelo usuário

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Lê a primeira linha do arquivo

            while (line != null) {
                line = line.trim(); // Remove espaços em branco no início e no fim da linha
                String[] filds = line.split(",");
                list.add(new Employee(filds[0], filds[1], Double.parseDouble(filds[2])));
                line = br.readLine(); // Lê a próxima linha
            }

            System.out.print("Enter salary: ");

            double salaryCompare = sc.nextDouble();

            List<String> emails = list.stream().filter(emp -> emp.getSalary() > salaryCompare).
                    map(Employee::getEmail).sorted().toList();

            // Obtém uma lista ordenada dos e-mails de todos os funcionários cujo salário é maior que salaryCompare.
            // Utiliza streams para filtrar, mapear e ordenar os dados de forma funcional.

            System.out.println("Email of people whose salary is more than " + salaryCompare + ": ");

            emails.forEach(System.out::println); // Metodo de referência para imprimir os emails

            double sumSalarys = list.stream().filter(emp -> emp.getName().startsWith("M"))
                    .mapToDouble(Employee::getSalary).sum();

            // Calcula a soma dos salários de todos os funcionários cujo nome começa com a letra "M"

            System.out.print("Sum of salary of people whose name starts with 'M': ");
            System.out.printf("%.2f", sumSalarys);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        sc.close();
    }
}