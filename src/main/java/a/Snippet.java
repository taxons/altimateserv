package a;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class Snippet
{
	public static void main(String args[]) throws JauntException, IOException
	{
		formatJson();
	}

	private static void formatJson() throws JsonParseException, JsonMappingException, IOException
	{
		String json = loadStringJson();
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode obj = mapper.readValue(json, ObjectNode.class);
		System.out.println(obj.get("query"));
	}

	

	@SuppressWarnings("unused")
	private static void readWebsite() throws ResponseException
	{
		for (int i = 1; i < 10000 / 30; i++)
		{
			UserAgent userAgent = new UserAgent();         // create new userAgent (headless
													         // browser)
			userAgent.visit(
					"https://www.commonfloor.com/listing-search?city=Bangalore&search_intent=sale&house_type%5B%5D=Apartment&polygon=1&page="
							+ i + "&page_size=30");         // visit
													         // google
			// userAgent.doc.apply("butterflies"); //apply form input (starting at first editable
			// field)
			// userAgent.doc.submit("Google Search");
			Elements tables = userAgent.doc.findEach("<script>");

			for (Element ol : tables)
			{
				String res = ol.innerHTML();
				if (res.contains("window.stateFromServer.query"))
				{
					String[] lines = res.split(";");
					for (String line : lines)
					{
						if (line.contains("window.stateFromServer.query"))
						{
							line = line.replace("window.stateFromServer.query =", "");
							line = line.replace("'", "");
							System.out.println(line);
							// BufferedWriter writer = new BufferedWriter(new
							// FileWriter("C:\\Users\\npalaninathan\\Desktop\\test\\2.json"));
							// writer.write(line);
							// writer.close();
						}
					}
				}

			}
		}
	}
	private static String loadStringJson()
	{
		String json =
				"{\r\n" + 
				"	\"query\": {\r\n" + 
				"		\"city\": \"Bangalore\",\r\n" + 
				"		\"search_intent\": \"sale\",\r\n" + 
				"		\"house_type\": [\"Apartment\"],\r\n" + 
				"		\"polygon\": \"1\",\r\n" + 
				"		\"page\": \"1\",\r\n" + 
				"		\"page_size\": \"30\",\r\n" + 
				"		\"total\": 110031,\r\n" + 
				"		\"totalPremiumData\": 534,\r\n" + 
				"		\"totalBaseData\": 109497,\r\n" + 
				"		\"serpDetails\": [{\r\n" + 
				"				\"location\": {\r\n" + 
				"					\"lat\": \"13.009463\",\r\n" + 
				"					\"lon\": \"77.55268699999999\"\r\n" + 
				"				},\r\n" + 
				"				\"ad_title\": \"3BHK Apartment for Sale in RajajiNagar, Bangalore at One Bangalore West\",\r\n" + 
				"				\"cfListingId\": \"2z0k7i8nejwnwdl7\",\r\n" + 
				"				\"property_area\": 2408,\r\n" + 
				"				\"bhk\": \"3  BHK\",\r\n" + 
				"				\"price\": \"3.60Cr \",\r\n" + 
				"				\"url\": \"\\/listing\\/3bhk-apartment-for-sale-in-rajajinagar-bangalore-at-one-bangalore-west\\/2z0k7i8nejwnwdl7\"\r\n" + 
				"			}, {\r\n" + 
				"				\"location\": {\r\n" + 
				"					\"lat\": \"12.921271314256078\",\r\n" + 
				"					\"lon\": \"77.54279131779093\"\r\n" + 
				"				},\r\n" + 
				"				\"ad_title\": \"3BHK Apartment for Sale in Banashankari 3rd Stage, Bangalore at Prakruthi Orchids\",\r\n" + 
				"				\"cfListingId\": \"013jc64ww2f2pk22\",\r\n" + 
				"				\"property_area\": 1305,\r\n" + 
				"				\"bhk\": \"3  BHK\",\r\n" + 
				"				\"price\": \"59L \",\r\n" + 
				"				\"url\": \"\\/listing\\/3bhk-apartment-for-sale-in-banashankari-3rd-stage-bangalore-at-prakruthi-orchids\\/013jc64ww2f2pk22\"\r\n" + 
				"			}\r\n" + 
				"		],\r\n" + 
				"		\"totalNearbyData\": 0\r\n" + 
				"	}\r\n" + 
				"}\r\n" + 
				"";
		return json;
	}
}
