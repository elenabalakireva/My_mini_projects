import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import static java.nio.file.Files.readString;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = readString(Path.of("data.json"));
        List employeelist = (List) mapper.readValue(json, new TypeReference<>(){});
            System.out.println(employeelist.toString());

    }
}
