import com.google.gson.Gson;

import java.util.ArrayList;

public class Main2 {
    class MyJSON {
        String product;
        ArrayList<Main.ValueClass> value;
    }

    class ValueClass {
        String sysName;
        String sysId;
    }

    public static void main(String[] args) {
        String jsonString = "[\n" +
                "    {\n" +
                "        \"product\": \"AJS\",\n" +
                "        \"value\": [\n" +
                "            {\n" +
                "                \"sysName\": \"aaa\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"bbb\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"ccc\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"ddd\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"product\": \"BBD\",\n" +
                "        \"value\": [\n" +
                "            {\n" +
                "                \"sysName\": \"aaa\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"bbb\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"ddd\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";
        Gson g = new Gson();
        MyJSON[] jsons = g.fromJson(jsonString, MyJSON[].class);

        for (int i = 0; i < jsons.length; i++) {
            for (int j = 0; j < jsons[i].value.size(); j++) {
                System.out.println(jsons[i].product + "," + jsons[i].value.get(j).sysId + "," + jsons[i].value.get(j).sysName);
            }
        }
    }
}
