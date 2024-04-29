import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Clase que contiene metodo para consultar la API
public class ConsultaAPI {

    //Instanciamos un objeto de la Clase donde se almacena la api key
    Credenciales credenciales = new Credenciales();

    //Metodo que regresa el json de la API convertido en clase del tipo JsonToClass
    public JsonToClass consultarApi(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + credenciales.getApiKey() +"/latest/USD");

        //Solicitamos request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            //Recibimos respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Convertimos el json de respuesta a la clase de java y lo retornamos
            //metodo fromJson de Gson() le enviamos como parametros el cuerpo de la respuesta y nombre de la
            //clase a convertir
            return new Gson().fromJson(response.body(), JsonToClass.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }






}
