package SelecaoADA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Data {
    public static void main(String[] args) {
        //SelecaoADA.Cadastro do Cliente
        LocalDate data_nascimento = LocalDate.of(2000, 5, 15);
        System.out.println("SelecaoADA.Data de nascimento do cliente " + data_nascimento);

        //SelecaoADA.Data e hora cadastro do cliente
        LocalDateTime horaCadastro = LocalDateTime.now();
        System.out.println("SelecaoADA.Data e hora do cadastro" + horaCadastro);

        //Proximo aniversário do Cliente
        LocalDate hoje = LocalDate.now();
        LocalDate ProximoAniversario = LocalDate.now().withYear(hoje.getYear());

        if (ProximoAniversario.isBefore(hoje) || (ProximoAniversario.isEqual(hoje))) {
            ProximoAniversario = ProximoAniversario.plusYears(1);
        }
        System.out.println("Próximo aniversário do cliente " + ProximoAniversario);

        //Calcular periodo até o próximo aniversário
        Period periodoProxAniversario = Period.between(hoje, ProximoAniversario);
        System.out.println("Faltam " + periodoProxAniversario.getMonths() +
                " meses e " + periodoProxAniversario.getDays() +" dias para " +
                "o proximo aniversário!");
        //verificar se o aniversario e antes ou depois de um envento
        LocalDate dataEvento = LocalDate.of(2024, 10,11);
        if (ProximoAniversario.isAfter(dataEvento)){
            System.out.println("O aniversario do cliente é depois ");
        }
        else {
            System.out.println("O aniveresario do cliente é no mesmo dia do evento");
        }

    }
}
