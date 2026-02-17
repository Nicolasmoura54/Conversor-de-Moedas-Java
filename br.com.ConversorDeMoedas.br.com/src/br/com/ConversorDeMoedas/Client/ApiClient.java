package br.com.ConversorDeMoedas.Client;

import br.com.ConversorDeMoedas.Model.RespostaPair;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_KEY = "45229c6e40371f3798e4a3b1";

    public RespostaPair converter (String base, String destino, double valor) {

        String endereco = "https://v6.exchangerate-api.com/v6/"
                + "45229c6e40371f3798e4a3b1" + "/pair/"
                + base + "/" + destino + "/" + valor;
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            return gson.fromJson(response.body(), RespostaPair.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar taxa: " + e.getMessage());
        }
    }
}

