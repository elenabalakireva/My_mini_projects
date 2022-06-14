import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.json.simple.JSONArray;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        final String fileName = "data.csv";
        final String fileName2 = "data.xml";
        final String fileName3 = "data.json";
        final String fileJsonName1 = "new_data1.json";
        final String fileJsonName2 = "new_data2.json";

        List<Employee> list = parseCSV(fileName, columnMapping);
        listTOJson(list, fileJsonName1);

        List<Employee> list1 = parseXML(fileName2);
        listTOJson(list1, fileJsonName2);
    }

    public static List<Employee> parseXML(String xmlFileName) {

        try {
            List<Employee> list = new ArrayList<>();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(xmlFileName));

            Node root = doc.getDocumentElement();
            NodeList nodeList = root.getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);

                if (node.ELEMENT_NODE == node.getNodeType()) {

                    Element employee = (Element) node;

                    long id = Long.parseLong(employee.getElementsByTagName("id").item(0).getTextContent());
                    String firstName = employee.getElementsByTagName("firstName").item(0).getTextContent();
                    String lastName = employee.getElementsByTagName("lastName").item(0).getTextContent();
                    String country = employee.getElementsByTagName("country").item(0).getTextContent();
                    int age = Integer.parseInt(employee.getElementsByTagName("age").item(0).getTextContent());

                    list.add(new Employee(id, firstName, lastName, country, age));
                }
            }
            return list;
        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static List<Employee> parseCSV(String fileName, String[] columnMapping) {
        List<Employee> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(fileName))) {
            ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Employee.class);
            strategy.setColumnMapping(columnMapping);
            CsvToBean<Employee> csv = new CsvToBeanBuilder<Employee>(csvReader)
                    .withMappingStrategy(strategy)
                    .build();
            list = csv.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void listTOJson(List<Employee> list, String fileJsonName) {
        JSONArray listJson = new JSONArray();
        listJson.addAll(list);
        try (FileWriter file = new FileWriter(fileJsonName)) {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.setPrettyPrinting().create();
            file.write(gson.toJson(list));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
