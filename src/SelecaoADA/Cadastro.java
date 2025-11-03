//package SelecaoADA;
//
//public class Cadastro {
//    public static void main (String[] args) {
//// String não é um tipo e sim uma classe em Java.
//        String nomeDigitado = "Anderson Vieira";
//        String nomeCadastrado = "anderson vieira";
//
////      comparação das strings + lembrar de criar variaveis novas para cada manipulação de strings
//        boolean iguais = nomeDigitado.equals(nomeCadastrado);
//            System.out.println("Os nomes são exatamente iguais? " + iguais);
//
//// comparação ignorando as maiusculas e minusculas
//        boolean comparacao_str = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
//            System.out.println("Os nomes são iguais ignorando maiusculas e minusculas? " + comparacao_str);
//
//// converter para maiusculas
//        String dig_maiusculas = nomeDigitado.toUpperCase();
//            System.out.println(dig_maiusculas);
//
//// converter para minusculas
//        String dig_minusculas = nomeDigitado.toLowerCase();
//            System.out.println(dig_minusculas);
//
//// obter o numero de caracteres
//        int tamanho = nomeDigitado.length();
//            System.out.println("O nome possui: "+tamanho +" de caracteres");
//// Saudação concatenada
//        String saudacao = "Bem vindo, ".concat(dig_maiusculas).concat( "!");
//            System.out.println(saudacao);
//
//// Obter a primeira letra do nome
//        char primeiraLetra = nomeDigitado.charAt(0);
//            System.out.println("A primeira letra do nome é " + primeiraLetra);
//
//// Encontrar a posição do sobrenome usando indexof
//        int posicaoNome = nomeDigitado.indexOf("Vieira");
//            System.out.println("A posição do sobrenome é " + posicaoNome);
//        if (posicaoNome != -1){
//            System.out.println("O Sobrenome se encontra na posição "+ posicaoNome);
//        }else{
//            System.out.println("O sobrenome não foi encontrado!");
//        }
//
//    }
//}
