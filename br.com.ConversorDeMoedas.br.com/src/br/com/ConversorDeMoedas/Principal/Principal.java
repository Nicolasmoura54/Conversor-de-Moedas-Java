package br.com.ConversorDeMoedas.Principal;
import br.com.ConversorDeMoedas.Service.ConversorService;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

                Scanner leitura = new Scanner(System.in);
                ConversorService service = new ConversorService();

                int opcao = 0;

                while (opcao != 7) {

                    System.out.println("""
                    ===============================
                    Seja bem-vindo ao Conversor!
                   
                    Escolha uma opção:
                    
                    1) Dólar => Real
                    2) Real => Dólar
                    3) Euro => Real
                    4) Real => Euro
                    5) Dólar => Euro
                    6) Euro => Dólar
                    7) Sair""");

                    opcao = leitura.nextInt();

                    if (opcao >= 1 && opcao <= 6) {
                        System.out.println("Digite o valor:");
                        double valor = leitura.nextDouble();
                        service.converter(opcao, valor);
                    } else if (opcao == 7) {
                        System.out.println("Encerrando programa...");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }
        }
