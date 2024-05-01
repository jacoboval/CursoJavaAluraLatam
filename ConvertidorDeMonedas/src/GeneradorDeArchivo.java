import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
public class GeneradorDeArchivo {
    public void guardarJson(Divisa divisa) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(divisa.base_code()+".json");
        escritura.write(gson.toJson(divisa));
        escritura.close();
    }

}
