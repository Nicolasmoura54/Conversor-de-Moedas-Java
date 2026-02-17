package br.com.ConversorDeMoedas.Service;

import br.com.ConversorDeMoedas.Client.ApiClient;
import br.com.ConversorDeMoedas.Model.RespostaPair;

public class ConversorService {

    private ApiClient apiClient = new ApiClient();

    public void converter(int opcao, double valor) {

        String base = "";
        String destino = "";

        switch (opcao) {
            case 1 -> { base = "USD"; destino = "BRL"; }
            case 2 -> { base = "BRL"; destino = "USD"; }
            case 3 -> { base = "EUR"; destino = "BRL"; }
            case 4 -> { base = "BRL"; destino = "EUR"; }
            case 5 -> { base = "USD"; destino = "EUR"; }
            case 6 -> { base = "EUR"; destino = "USD"; }
        }

        RespostaPair resposta = apiClient.converter(base, destino, valor);

        if ("success".equals(resposta.getResult())) {
            System.out.println("Taxa: " + resposta.getConversion_rate());
            System.out.println("Valor convertido: " + resposta.getConversion_result());
        } else {
            System.out.println("Erro na conversão.");
        }
    }
}