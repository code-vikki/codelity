package hackerrank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;

public class Prudential {

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println(getDiscountedPrice(74005364));

    }

    public String filter(List<String> passwords){
        return "TODO"; //implement it, and return space separated passwords
    }

    public static int getDiscountedPrice(int barcode) throws IOException, ParseException {
        StringBuilder response = new StringBuilder();

        URL url = new URL("https://jsonmock.hackerrank.com/api/inventory?barcode="+barcode);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP error code : " + connection.getResponseCode());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())))) {
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }
        }
        try {
            JSONParser parser = new JSONParser();
            JSONObject responseObject = (JSONObject) parser.parse(String.valueOf(response));
            JSONArray dataArray = (JSONArray) responseObject.get("data");
            if(dataArray.isEmpty()){
                return -1;
            }
            JSONObject itemObject = (JSONObject) dataArray.get(0);
            long price = (long) itemObject.get("price");
            long discount = (long) itemObject.get("discount");
            long discountedPrice = price - ((discount / 100) * price);
            int round = Math.round(discountedPrice);
            connection.disconnect();
            return round;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
