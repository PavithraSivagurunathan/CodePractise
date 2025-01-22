package api;

//import org.json.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
//import org.json.JSONArray;
import java.io.InputStreamReader;

public class SumAgeGreaterThan50 {

    public static void main(String[] args) {
        // URL of the API endpoint (replace with your actual API URL)
        String apiUrl = "https://example.com/api/users";
        
        try {
            // Step 1: Get the JSON from the API
            String jsonResponse = getJsonResponse(apiUrl);
            
            // Step 2: Parse the JSON response
         //   JSONArray jsonArray = new JSONArray(jsonResponse);
            
            // Step 3: Iterate through the JSON array and calculate the sum of ages > 50
            int sum = 0;
            //for (int i = 0; i < jsonArray.length(); i++) {
            //    JSONObject user = jsonArray.getJSONObject(i);
              //  int age = user.getInt("age");
                
                // Check if age is greater than 50
               // if (age > 50) {
                    //sum += age;
                //}
           // }

            // Output the result
            System.out.println("Sum of ages greater than 50: " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to make an HTTP GET request and return the response as a string
    public static String getJsonResponse(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        // Return the JSON response as a string
        return response.toString();
    }
}

