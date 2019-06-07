package Writeexample1;

import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WriteJson {

	public static void main(String[] args) throws FileNotFoundException {
		
		Boolean check= null;
		
		String file1 = "{\"name\":\"AUDI\",\"model\":\"2014\",\"price\":\"30000\",\"colors\":[\"GRAY\",\"BLACK\",\"WHITE\"]}";
		String file2 = "{\"name\":\"AUDI\",\"model\":\"2014\",\"price\":\"30000\",\"colors\":[\"GRAY\",\"BLACK\",\"WHITE\"]}";

		JsonParser parser = new JsonParser();
		Gson gson = new Gson();

		JsonElement jsonElement1 = parser.parse(file1);
		JsonElement jsonElement2 = parser.parse(file2);



		if (jsonElement1 != null && jsonElement2 != null) {

			if (jsonElement1.isJsonObject() && jsonElement2.isJsonObject()) {
				Set<Entry<String, JsonElement>> e1 = ((JsonObject) jsonElement1).entrySet();
				Set<Entry<String, JsonElement>> e2 = ((JsonObject) jsonElement2).entrySet();

				JsonObject j2 = (JsonObject) jsonElement2;

				if (e1 != null && e2 != null && e1.size() == e2.size()) {
					for (int i = 0; i < e1.size(); i++) {
						 check = false;
					
						for (int j = 0; j < e2.size(); j++) {

							if (e1.equals(e2)) {
								check = true;

							}

						}

					}

				}

				if(check == true) {
					System.out.println("String matches");
				}
				else {
					System.out.println("Not matched");
				}
			}

		}

	}

}
