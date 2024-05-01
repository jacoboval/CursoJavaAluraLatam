import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsultarDivisa {
    public  Divisa buscarDivisa(String codigoDivisa){
        //URI divisa = URI.create("https://v6.exchangerate-api.com/v6/1b548de8660e37b3d5062c2b/pair/EUR/GBP/10");
        URI divisa = URI.create("https://v6.exchangerate-api.com/v6/1b548de8660e37b3d5062c2b/pair/MXN/USD/10");
        // https://v6.exchangerate-api.com/v6/1b548de8660e37b3d5062c2b/pair/EUR/GBP/10
        //System.out.println("divisa = " + divisa);

        // Dond impplentar la url pra conversion en pares????



        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(divisa)

                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Divisa.class);
            } catch (Exception e) {
                throw new RuntimeException("Código de divisa no encontrado.");
            }
        }
    }
}
