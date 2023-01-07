package n2exercici1.Java;

import n2exercici1.Annotations.SerializeToJson;
import n2exercici1.Class.Cat;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class Main {


    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        SerializeToJson serializeToJson;
        String path = "";
        boolean exit = false;
        Cat cat = new Cat("Pesol", "Browm", 3);

        obj.put("House owner, a Cat:\n", cat);

        try {
            if (cat.getClass().isAnnotationPresent(SerializeToJson.class)){
                serializeToJson = cat.getClass().getAnnotation(SerializeToJson.class);
                path = serializeToJson.path();
            } else {
                System.out.println("Can't find any annotation here.");
            }
            FileWriter file = new FileWriter(path);
            file.write(obj.toJSONString());
            file.flush();
            exit = true;
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(exit ? ".json file created!" : "Seems there was a problem out there...");
    }

}
