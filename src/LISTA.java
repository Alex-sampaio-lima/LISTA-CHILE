package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

public class LISTA {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

//        Ex 1
//        numerosDivisiveis();

//        Ex 2
//        multiploDe10();

//        Ex 3
//        System.out.println(somaDosTermos());

//        Ex 4
//        System.out.println("Informe o tanto de números que serão ser somados: ");
//        int numeros = read.nextInt();
//        System.out.println(somaDosTermosAtualizada(numeros));

//        Ex 5
//        System.out.printf("Soma dos Números %d", somaTermoCinco());

//        Ex 6
//        consoleLog(somaTermoCincoAtualizada(10, 50));

//        Ex 7
//        System.out.printf("O salário atual desse funcionáiro é de R$ %.2f",aumentoSalarial());

//        Ex 8
//        System.out.printf("O joão demorou %d meses para se igualar ou ultrapassar Carlos", valoresIgualados(10));

//        Ex 9
//        int tamArray = 0, numero = 0, count = 0;
//        System.out.println("Informe a quantidade de números que serão digitados:");
//        tamArray = read.nextInt();
//
//        int[] x = new int[tamArray];
//
//        System.out.println("Informe os Números: ");
//        for (int i = 0; i < tamArray; i++) {
//            numero = read.nextInt();
//            if (numero == 0) {
//                break;
//            } else {
//                x[i] = numero;
//            }
//            count++;
//        }
//
//        System.out.printf("Quantidade de números negativos %d%n", qtdNumerosNegativos(x));
//        System.out.printf("Soma dos números Positivos %d%n", somaDosPositivoss(x));

//        Ex 10
//        consoleLog("Escreva a nota do aluno: ");
//        int x = escreverInt(read);
//        notaAluno(x);


//      Ex 11
//        consoleLog(salarios());

//      Ex 12
//        termosNumerosAleatorios();

//      Ex 13
//      Ex13();

//      Ex 14
//        maiorEmenor();

//      Ex 15
//        quinzeValores();

//      Ex 16
//        desenho();

    }

    public static void consoleLog(Object x) {
        System.out.println(x);
    }

    public static void consoleLogInt(int x) {
        System.out.println(x);
    }

    public static int escreverInt(Scanner x) {
        return x.nextInt();
    }

    public static double escreverDouble(Scanner x) {
        return x.nextDouble();
    }

    public static String escreverString(Scanner x) {
        return x.nextLine();
    }

    public static String escrever(Scanner x) {
        return x.nextLine();
    }

    //  Ex 1
    public static int[] numerosDivisiveis() {

        int[] numeros = new int[9500];
        int j = 0;
        for (int i = 50; i <= numeros.length; i++) {
            if (i % 3 == 0) {
                numeros[j] = i;
                consoleLog(i);
                j++;
            }
        }
        return numeros;
    }

    // Ex 2
    public static int[] multiploDe10() {

        int[] numeros = new int[250];

        for (int i = 0; i <= numeros.length; i++) {
            if (i % 10 == 0) {
                System.out.printf("%d é Múltiplo de 10%n", i);
            }
        }
        return numeros;
    }

    // Ex 3
    public static int somaDosTermos() {
        int[] numeros = new int[100];
        int soma = 0;
        for (int i = 0; i <= numeros.length; i++) {
            soma += i;
        }
        return soma;
    }

    // Ex 4
    public static int somaDosTermosAtualizada(int x) {
        int soma = 0;
        for (int i = 0; i <= x; i++) {
            soma += i;
        }
        return soma;
    }

    // Ex 5
    public static int somaTermoCinco() {
        int j = 0;
        int soma = 0;
        for (int i = 0; j < 15; i += 5) {
            consoleLog(i);
            soma += i;
            j++;
        }
        return soma;
    }

    /***
     *
     * @param x Será o primeiro termo
     * @param y Será o segundo termo
     * @return Retorna a soma dos termos
     */

    //    Ex 6
    public static int somaTermoCincoAtualizada(int x, int y) {
        int soma = 0;
        for (int i = 0; x <= y; i += 5) {
            soma += i;
            x++;
        }
        return soma;
    }


    //    Ex 7
    public static double aumentoSalarial() {
        double totalSalario = 0, porcentagemSalarial = 0, salarioAtual = 1000, novoSalario = 1000;
        double aumentoPercentual = 1.5 / 100;

        for (int i = 2011; i <= 2024; i++) {
            if (i >= 2012) {
                aumentoPercentual *= 2;
                porcentagemSalarial = aumentoPercentual;
                porcentagemSalarial *= totalSalario;
                totalSalario += porcentagemSalarial;
            } else {
                novoSalario *= aumentoPercentual;
                totalSalario = salarioAtual + novoSalario;
            }
        }

        return totalSalario;
    }


    //    Ex 8
    public static int valoresIgualados(double x) {
        double salarioC = x;
        double salarioJ = salarioC / 3;
        double totalJ = 0, totalC = 0;
        double rendimentoJ = 0.05, rendimentoC = 0.02;
        int countMonth = 0;

        while (totalJ <= totalC) {
            totalC = totalC + salarioC + (totalC * rendimentoC);
            totalJ = totalJ + salarioJ + (totalJ * rendimentoJ);
            countMonth++;
//            System.out.println(countMonth);
        }

        return countMonth;

    }

    //    Ex 9
    public static int somaDosPositivoss(int[] x) {
        int soma = 0;

        for (int numeros : x) {
            if (numeros > 0) {
                soma += numeros;
            }
        }

        return soma;
    }

    public static int qtdNumerosNegativos(int[] x) {
        int i = 0;
        int numerosNegativos = 0;
        for (int numeros : x) {
            if (numeros < 0) {
                numerosNegativos++;
            }
            i++;
        }
        return numerosNegativos;
    }

    //    Ex 10
    public static void notaAluno(int x) {
        String resultado = aprovado(x);
        while (x > 10 || x < 0) {
            consoleLog(resultado);
            x = escreverInt(read);
        }
        resultado = aprovado(x);
        consoleLog(resultado);

    }

    public static String aprovado(double x) {
        String msg = "";

        if (x >= 0 && x <= 10) {
            if (x >= 6) {
                msg = "Aluno Aprovado!";
            } else if (x >= 5) {
                msg = "Aluno Recuperação!";
            } else {
                msg = "Aluno Reprovado!";
            }
            return msg;
        } else {
            return "Notá inválida! Digite uma nota válida!";
        }
    }

    //    Ex 11

    public static Object salarios() {
        menu();
        consoleLog("Selecione a opção:");
        int opcoes = escreverInt(read);
        double salario = 0;

        if (opcoes == 1) {
            consoleLog("Digite o salário");
            salario = escreverDouble(read);
            return opcao1(salario);
        } else if (opcoes == 2) {
            consoleLog("Digite o salário");
            salario = escreverDouble(read);
            return opcao2(salario);
        } else if (opcoes == 3) {
            consoleLog("Digite o salário");
            salario = escreverDouble(read);
            return opcao3(salario);
        } else {
            System.exit(0);
            return null;
        }
    }

    public static void menu() {
        consoleLog("-------Menu opções------");
        consoleLog("[1] - Imposto");
        consoleLog("[2] - Novo Salário");
        consoleLog("[3] - Classificação");
        consoleLog("[4] - Finalizar o programa");
        consoleLog("Digite a opção desejada.");
        consoleLog("------------------------");
    }

    public static double opcao1(double x) {
        double imposto = 0;
        double calculoImposto = 0;

        if (x <= 1500) {
            imposto = 0.05;
            calculoImposto = imposto * x;
            System.out.print("Valor do imposto sobre o salário R$ ");
            return calculoImposto;
        } else if (x >= 1500.01 && x <= 3000) {
            imposto = 0.10;
            calculoImposto = imposto * x;
            System.out.print("Valor do imposto sobre o salário R$ ");
            return calculoImposto;
        } else {
            imposto = 0.15;
            calculoImposto = imposto * x;
            System.out.print("Valor do imposto sobre o salário R$ ");
            return calculoImposto;
        }

    }

    public static double opcao2(double x) {
        double aumento = 0;
        double somaSalario = 0;
        if (x > 4500) {
            aumento = 250;
            x += aumento;
            System.out.print("Novo salário com aumento: R$");
            return x;
        } else if (x >= 3000.01 && x <= 4500) {
            aumento = 200;
            x += aumento;
            System.out.print("Novo salário com aumento: R$");
            return x;
        } else if (x >= 2000.01 && x <= 3000) {
            aumento = 150;
            x += aumento;
            System.out.print("Novo salário com aumento: R$");
            return x;
        } else {
            aumento = 130;
            x += aumento;
            System.out.print("Novo salário com aumento: R$");
            return x;
        }
    }

    public static String opcao3(double x) {
        String msg = "";
        if (x > 3000) {
            msg = "Bem Remunerado";
            return msg;
        } else {
            msg = "Mal Remunerado!";
            return msg;
        }

    }

    //  Ex 12
    public static void termosNumerosAleatorios() {
        int termo1 = 2;
        int termo2 = 7;
        int termo3 = 3;
        int[] numeros = new int[100];
        int[] result1 = new int[numeros.length];
        int[] result2 = new int[numeros.length];
        int[] result3 = new int[numeros.length];
        int[] total = new int[numeros.length];
        int[] proximoResult1 = new int[numeros.length];
        int[] proximoResult2 = new int[numeros.length];
        int[] proximoResult3 = new int[numeros.length];


        for (int i = 0; i < numeros.length - 1; i++) {

            if (i == 0) {
                result1[i] = termo1 * termo1;
                result2[i] = termo3 * termo2;
                result3[i] = termo3 * result1[i];
                proximoResult1[i] = result1[i];
                proximoResult2[i] = result2[i];
                proximoResult3[i] = result3[i];
                consoleLog(Arrays.toString(proximoResult1));
                consoleLog(Arrays.toString(proximoResult2));
                consoleLog(Arrays.toString(proximoResult3));
                total[i] = proximoResult1[i];
                total[i] = proximoResult2[i];
                total[i] = proximoResult3[i];
            }

            proximoResult1[i + 1] = proximoResult1[i] * termo1;
            proximoResult2[i + 1] = proximoResult2[i] * termo3;
            proximoResult3[i + 1] = proximoResult3[i] * result1[i];

            total[i] = proximoResult2[i];
        }
        consoleLog(Arrays.toString(total));
    }

    //  Ex 13

    public static void Ex13() {
        int[] idadeJogadoresTime1 = new int[15];
        int[] idadeJogadoresTime2 = new int[15];
        int[] idadeJogadoresTime3 = new int[15];
        int[] idadeJogadoresTime4 = new int[15];
        int[] idadeJogadoresTime5 = new int[15];

        double[] alturaJogadores = new double[75];

        int menorIdade = 0;
        int idade = 0;
        int countIdade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Informe a idade dos jogadores do time %dº: %n", i);
            for (int j = 0; j < 15; j++) {
                idade = escreverInt(read);
                if (idade < 17) {
                    menorIdade++;
                }
                if (i == 1) {
                    idadeJogadoresTime1[j] = idade;
                } else if (i == 2) {
                    idadeJogadoresTime2[j] = idade;
                } else if (i == 3) {
                    idadeJogadoresTime3[j] = idade;
                } else if (i == 4) {
                    idadeJogadoresTime4[j] = idade;
                } else {
                    idadeJogadoresTime5[j] = idade;
                }
                alturaJogadores[countIdade] = idade;
                countIdade++;
            }
        }

        double altura = 0.0, somaAltura = 0, totalMediaAltura = 0, countJogadores = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Informe a altura dos jogadores %d%n", i);
            for (int j = 0; j < 15; j++) {
                altura = escreverDouble(read);
                somaAltura += altura;
                countJogadores++;
            }
        }

        double peso = 0.0, somaPeso = 0.0;
        int countJogadoresPorPeso = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Informe o peso dos jogadores %d%n", i);
            for (int j = 0; j < 15; j++) {
                peso = escreverDouble(read);
                somaPeso += peso;
                countJogadoresPorPeso++;
            }
        }

        totalMediaAltura = somaAltura / countJogadores;

        consoleLog("A altura média de todos jogadores do campeonato é de: " + totalMediaAltura);

        consoleLog(jogadoresMenoresDeIdade(idadeJogadoresTime1));
        consoleLog(jogadoresMenoresDeIdade(idadeJogadoresTime2));
        consoleLog(jogadoresMenoresDeIdade(idadeJogadoresTime3));
        consoleLog(jogadoresMenoresDeIdade(idadeJogadoresTime4));
        consoleLog(jogadoresMenoresDeIdade(idadeJogadoresTime5));

        consoleLog("A média de idade dos jogadores do primeiro time é: " + mediaIdadeJogadresPorTime(idadeJogadoresTime1));
        consoleLog("A média de idade dos jogadores do Segundo time é: " + mediaIdadeJogadresPorTime(idadeJogadoresTime2));
        consoleLog("A média de idade dos jogadores do Terceiro time é: " + mediaIdadeJogadresPorTime(idadeJogadoresTime3));
        consoleLog("A média de idade dos jogadores do Quarto time é: " + mediaIdadeJogadresPorTime(idadeJogadoresTime4));
        consoleLog("A média de idade dos jogadores do Quinto time é: " + mediaIdadeJogadresPorTime(idadeJogadoresTime5));
    }

    public static int[] receberIdade(int x) {
        int i = 0;
        int[] idade = new int[15];

        System.out.println("Entrou");
        for (int numeroIdade : idade) {
            numeroIdade = escreverInt(read);
            idade[i] = numeroIdade;
            i++;
        }
        return idade;
    }

    public static int jogadoresMenoresDeIdade(int[] x) {
        int contadorMenorIdade = 0;

        for (int idade : x) {
            if (idade < 18) {
                contadorMenorIdade++;
            }
        }

        System.out.print("Jogadores menores de idade: ");
        return contadorMenorIdade;
    }

    public static int mediaIdadeJogadresPorTime(int[] x) {
        int somaIdade = 0;
        int idade = 0;
        int mediaIdade = 0;

        for (int i = 0; i < x.length; i++) {
            idade = x[i];
            somaIdade += idade;
        }
        mediaIdade = somaIdade / x.length;

        return mediaIdade;
    }

    //    Ex 14
    public static void maiorEmenor() {
        int x = 0;
        int y = 0;
        int maiorNumero = 0;
        int menorNumero = 2000000000;

        while ((x >= 0 && y >= 0)) {
            consoleLog("Digite o primeiro número: ");
            x = escreverInt(read);
            consoleLog("Digite o segundo número: ");
            y = escreverInt(read);

            if (x >= maiorNumero) {
                maiorNumero = x;
            }

            if (y >= maiorNumero) {
                maiorNumero = y;
            }

            if (x > 0 && y > 0) {
                if (y <= menorNumero) {
                    menorNumero = y;
                }
                if (x <= menorNumero) {
                    menorNumero = x;
                }
            }
        }

        consoleLog("Maior número digitado " + maiorNumero);
        consoleLog("Menor número digitado " + menorNumero);
    }


    //    Ex 15
    public static void quinzeValores() {
        int maiorNumero = 0;
        int menorNumero = 2000000000;
        double media = 0, soma = 0;
        int a = 0, b = 0;
        int numerosPares = 0, numerosDivisiveisPorCinco = 0, totalDenumeros = 0;

        for (int i = 0; i < 15; i++) {
            consoleLog("Digite o primeiro número: ");
            a = escreverInt(read);

            soma += a + b;

            if (a % 2 == 0) {
                numerosPares++;
            }

            if (a % 5 == 0) {
                numerosDivisiveisPorCinco++;
            }

            if (a >= maiorNumero) {
                maiorNumero = a;
            }
            if (a <= menorNumero) {
                menorNumero = a;
            }

            totalDenumeros++;
        }

        media = soma / totalDenumeros;

        consoleLog("Menor número: " + menorNumero);
        consoleLog("Maior número: " + maiorNumero);
        System.out.printf("A média dos números é %.2f %n", media);
        consoleLog("Total de números Pares: " + numerosPares);
        consoleLog("Total de números divisiveis por cinco: " + numerosDivisiveisPorCinco);
    }

    //    Ex 16
    public static void desenho() {
        int linha = 0, coluna = 0;
        String x = "";
        consoleLog("Digite o número de linhas: ");
        linha = escreverInt(read);
        consoleLog("Digite o número de colunas: ");
        coluna = escreverInt(read);
        read.nextLine();
        consoleLog("Digite se os números serão pares ou impares: ");
        x = escreverString(read);

        int a = 0;

        if (x.equalsIgnoreCase("par")) {
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    if (a % 2 == 0) {
                        System.out.printf("%02d xx ", a);
                    }
                    a++;
                }
                System.out.println();
            }
        }

        if (x.equalsIgnoreCase("impar")) {
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    if (a % 2 != 0) {
                        System.out.printf("xx %02d ", a);
                    }
                    a++;
                }
                System.out.println();
            }
        }

    }
}

