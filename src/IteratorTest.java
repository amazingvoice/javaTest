import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class IteratorTest {

    public static void main(String[] args) {
        String json = readJsonFile("test.json");
        /*
        JsonObject object = (JsonObject) JsonParser.parseString(json);
        String minVersion = object.getAsJsonObject("videoConfigList").get("minAppVersion").getAsString();
        System.out.println(minVersion);
         */

        /*
        Gson gson = new Gson();
        ResponseData responseData = gson.fromJson(json, new TypeToken<ResponseData>() {}.getType());
        System.out.println(responseData.getVideoConfigList().getConfigVersion());
        ArrayList<String> arrayList = responseData.getVideoConfigList().getCustomizedList();
        System.out.println(arrayList);
        System.out.println(responseData.getVideoConfigList().getMinAppVersion());
        System.out.println(responseData.getVideoConfigList().getMTKDefault());
        System.out.println(responseData.getVideoConfigList().getQCOMDefault());
         */

        System.out.println("test");

        HashMap<String, String[]> map = new HashMap<>();
        map.put("a", new String[]{"1", "2"});
    }


    public static String readJsonFile(String fileName) {
        String line = null;
        try {
            File jsonFile = new File(fileName);
            Reader inputStreamReader = new InputStreamReader(
                    new FileInputStream(jsonFile), StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine())!=null) {
                stringBuilder.append(line);
            }
            bufferedReader.close();
            inputStreamReader.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
