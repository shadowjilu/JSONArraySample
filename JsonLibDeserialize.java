import org.json.*;

public class Main {

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
                "                \"sysName\": \"ccc\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sysName\": \"ddd\",\n" +
                "                \"sysId\": \"VLG,VLS\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";


        try {
            JSONArray array = new JSONArray(jsonString);
            int length = array.length();
            for (int i = 0; i < length; i++) {
                JSONObject obj = array.getJSONObject(i);

                String product = obj.getString("product");
                JSONArray valueArray = obj.getJSONArray("value");
                StringBuilder stringBuilder = new StringBuilder("\n");

                for (int j = 0; j < valueArray.length(); j++) {
                    JSONObject valueObj = valueArray.getJSONObject(j);
                    String sysName = valueObj.getString("sysName");
                    String sysId = valueObj.getString("sysId");

                    stringBuilder
                            .append("[")
                            .append(j)
                            .append("]")
                            .append(sysName)
                            .append(",")
                            .append(sysId)
                            .append("\n");
                }
                System.out.println(product + ":" + stringBuilder.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
