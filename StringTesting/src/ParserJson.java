
import java.lang.reflect.Field;
import java.util.*;
import org.json.*;


public class ParserJson {

	public static void main(String args[]) throws Exception{
		
		String jsonStr = "{\"status\": \"OK\",\"origin_addresses\": [ \"Vancouver, BC, Canada\", \"Seattle, État de Washington, États-Unis\" ],\"destination_addresses\": [ \"San Francisco, Californie, États-Unis\", \"Victoria, BC, Canada\" ],\"rows\": [ {\"elements\": [ {\"status\": \"OK\",\"duration\": {\"value\": 340110,\"text\": \"3 jours 22 heures\"},\"distance\": {\"value\": 1734542,\"text\": \"1 735 km\"}}, {\"status\": \"OK\",\"duration\": {\"value\": 24487,\"text\": \"6 heures 48 minutes\"},\"distance\": {\"value\": 129324,\"text\": \"129 km\"}} ]}, {\"elements\": [ {\"status\": \"OK\",\"duration\": {\"value\": 288834,\"text\": \"3 jours 8 heures\"},\"distance\": {\"value\": 1489604,\"text\": \"1 490 km\"}}, {\"status\": \"OK\",\"duration\": {\"value\": 14388,\"text\": \"4 heures 0 minutes\"},\"distance\": {\"value\": 135822,\"text\": \"136 km\"}} ]} ]}";

		JSONObject newObject = new JSONObject(jsonStr);
		Iterator it = newObject.keys();
		while(it.hasNext()){
			System.out.println(" "+it.next());
		}
		JSONArray rows = newObject.getJSONArray("rows");
		JSONObject row = rows.getJSONObject(0);
		it = row.keys();
		
		
		
		while(it.hasNext()){
			System.out.println(" Elements:: "+it.next());
		}
		
		/* JSONArray rows = newObject.getJSONArray("rows");
		
		for(int i=0; i< rows.length(); i++){
			
			JSONObject row = rows.getJSONObject(i);
			JSONArray elements = row.getJSONArray("elements");
			
			for(int j=0; j<elements.length();j++){
				
				JSONObject element = elements.getJSONObject(j);
				JSONObject status = element.getJSONObject("status");
				JSONObject value = element.getJSONObject("value");
				JSONObject text = element.getJSONObject("text");
				
				System.out.print("Status: "+ status.toString());
				
				JSONArray durations = element.getJSONArray("duration");
				JSONObject duration = durations.getJSONObject(0);
				JSONObject value1 = duration.getJSONObject("value");
				
				
			}
		}
		*/
		
	}
}
