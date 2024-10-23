package src;

import java.util.Scanner;
import java.util.Scanner;
import javax.swing.plaf.IconUIResource;
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
//        somaTermoCincoAtualizada(10, 50);

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
        consoleLog(salarios());

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
        int[] numeros = new int[x];
        int soma = 0;
        for (int i = 0; i <= numeros.length; i++) {
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
//    public static int Ex12 () {

//    }

}



