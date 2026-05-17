package com.FluCash;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CotacaoService {

    private static final String URL =
            "https://economia.awesomeapi.com.br/json/last/USD-BRL";

    public String buscarCotacaoDolar() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String body = response.body();
                int idx = body.indexOf("\"bid\":\"");
                if (idx != -1) {
                    int start = idx + 7;
                    int end = body.indexOf("\"", start);
                    String bid = body.substring(start, end);
                    return String.format("Cotacao USD: R$ %s", bid);
                }
            }
        } catch (Exception e) {
            return "Cotacao indisponivel no momento.";
        }
        return "Cotacao indisponivel no momento.";
    }
}
