import com.google.gson.Gson;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class ConsultarMoneda {

    private final String apiKey;

    public ConsultarMoneda() {
        this.apiKey = cargarApiKey();
    }

    private String cargarApiKey() {
        Properties props = new Properties();
        try {
            FileInputStream input = new FileInputStream("config.properties");
            props.load(input);
            return props.getProperty("API_KEY");
        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar la API Key desde config.properties", e);
        }
    }

    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la moneda: " + e.getMessage());
        }
    }
}
