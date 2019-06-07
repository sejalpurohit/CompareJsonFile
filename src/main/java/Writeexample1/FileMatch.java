package Writeexample1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FileMatch {

	public static void main(String[] args) throws FileNotFoundException {
		JsonParser parser = new JsonParser();
		String path1 = "C:\\Users\\sejal.purohit\\myworkspace\\WriteJson\\src\\main\\java\\Writeexample1\\data1.json";
		String path2 = "C:\\Users\\sejal.purohit\\myworkspace\\WriteJson\\src\\main\\java\\Writeexample1\\data2.json";

		JsonElement jsonElement1 = parser.parse(new FileReader(path1));
		JsonElement jsonElement2 = parser.parse(new FileReader(path2));

		System.out.println("pojo 1 ==  " + jsonElement1);
		System.out.println("pojo 2 ==  " + jsonElement2);

		System.out.println(FileMatch.compareJson(jsonElement1, jsonElement2));

	}

	public static boolean compareJson(JsonElement json1, JsonElement json2) {

		boolean isEqual = true;
		if (json1 != null && json2 != null) {

			if (json1.isJsonObject() && json2.isJsonObject()) {

				Set<Entry<String, JsonElement>> ens1 = ((JsonObject) json1).entrySet();
				Set<Entry<String, JsonElement>> ens2 = ((JsonObject) json2).entrySet();

				JsonObject json2obj = (JsonObject) json2;

				if (ens1 != null && ens2 != null && ens1.size() == ens2.size()) {
					for (Entry<String, JsonElement> en : ens1) {
						isEqual = isEqual && compareJson(en.getValue(), json2obj.get(en.getKey()));

					}

				} else {
					return false;

				}

			}

			else if (json1.isJsonArray() && json2.isJsonArray()) {
				JsonArray jarr1 = json1.getAsJsonArray();
				JsonArray jarr2 = json2.getAsJsonArray();
				if (jarr1.size() != jarr2.size()) {
					return false;
				} else {
					int i = 0;
					// Iterate JSON Array to JSON Elements
					for (JsonElement je : jarr1) {
						isEqual = isEqual && compareJson(je, jarr2.get(i));
						i++;
					}
				}
			}

			else if (json1.isJsonNull() && json2.isJsonNull()) {
				return true;
			}

			// Check whether both jsonElement are primitives
			else if (json1.isJsonPrimitive() && json2.isJsonPrimitive()) {
				if (json1.equals(json2)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else if (json1 == null && json2 == null) {
			return true;
		} else {
			return false;
		}
		return isEqual;
	}
}