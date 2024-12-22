Este repositório Java lê dados de funcionários a partir de um arquivo CSV, realiza algumas operações de processamento e exibe os resultados na tela.

## Estrutura do Projeto

O projeto consiste nas seguintes classes:

-   `aplication.Main`: Classe principal que executa o programa.
-   `entity.Employee`: Classe que representa um funcionário.

## Como Usar

1.  **Certifique-se de ter o Java instalado**: Você precisa ter o Java Development Kit (JDK) instalado para compilar e executar o código.
2.  **Compile o código**: Use um compilador Java para compilar as classes do projeto. Por exemplo:
    ```bash
    javac aplication/Main.java entity/Employee.java
    ```
3.  **Execute o programa**: Execute a classe `Main`. Por exemplo:
    ```bash
    java aplication.Main
    ```
4.  **Siga as instruções**: O programa solicitará que você insira o caminho completo do arquivo CSV e o valor do salário para comparação.

## Formato do Arquivo CSV

O arquivo CSV deve ter os dados dos funcionários separados por vírgulas, com o seguinte formato:

```csv
Nome do funcionário,email do funcionário,salário do funcionário
```

Por exemplo:

```csv
Maria Silva,maria@example.com,3000.00
Bob Green,bob@example.com,4500.00
Michael Brown,michael@example.com,5000.00
Anna White,anna@example.com,2800.00
```

## Funcionalidades

O programa realiza as seguintes operações:

1.  **Leitura de dados**: Lê os dados dos funcionários a partir do arquivo CSV especificado pelo usuário.
2.  **Filtragem por salário**: Solicita ao usuário um valor de salário e encontra todos os funcionários cujo salário seja maior do que o valor especificado.
3.  **Listagem de emails**: Exibe uma lista ordenada dos emails dos funcionários que atendem ao critério de salário.
4.  **Soma de salários**: Calcula a soma dos salários de todos os funcionários cujo nome começa com a letra "M".
5.  **Exibição de resultados**: Imprime os resultados da filtragem de e-mail e a soma dos salários no console.

## Observações

-   O programa utiliza `try-with-resources` para garantir que o `BufferedReader` seja fechado corretamente após o uso.
-   Utiliza Streams para realizar operações de filtragem, mapeamento e ordenação de forma concisa e funcional.
-   O tratamento de exceção `IOException` é feito, lançando um `RuntimeException` com a mensagem de erro.
