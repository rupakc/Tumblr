package org.tumblr.tag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.tumblr.util.StringUtil;

/** 
 * 
 * @author rupachak
 * //TODO - Add DB Support Using Tag Object
 * TODO- Add Multithreading
 */

public class TagFetch {

	String BASE_URL = "http://api.tumblr.com/v2/tagged?tag=";
	String API_URL = "&api_key=";
	String FILTER_URL = "&filter=";
	String API_KEY = "yztzKI5WfBoZ9LcELEBvw4zDrYQRTAjQa9EwjWPlViJQugLVXS";
	String TAG = "levis";
	String FILTER_TYPE = "text";

	public String formLink() { 

		String URL = "";
		this.TAG = StringUtil.fillTagSpace(this.TAG);
		URL = this.BASE_URL + this.TAG + this.API_URL + this.API_KEY + this.FILTER_URL + this.FILTER_TYPE;

		return URL;
	}

	/** 
	 * Given a link to the API endpoint returns the JSON response
	 * @param link String containing the link of the endpoint
	 * @return String containing the response
	 * @throws IOException
	 */ 

	public String getJSONResponse(String link)throws IOException { 

		URL url = new URL(link);
		String temp = "";
		String response = "";
		BufferedReader br;

		br = new BufferedReader(new InputStreamReader(url.openStream()));

		while((temp = br.readLine()) != null) { 

			response = response + temp;
		}

		return response;
	}

	/**
	 * 
	 * @param response
	 * @return
	 * @throws ParseException
	 */ 

	public JSONObject getParsedJSON(String response) throws ParseException { 

		JSONParser parser;
		JSONObject json;

		parser = new JSONParser();
		json = (JSONObject) parser.parse(response);

		return json;
	}

	public void printJSON(JSONObject tumblr_tag) { 

		JSONArray response_array = (JSONArray) tumblr_tag.get("response");
		JSONObject response_object; 

		for (int i = 0; i < response_array.size(); i++) { 

			response_object = (JSONObject) response_array.get(i);
			System.out.println("-----------------------------------------------------\n");
			System.out.println("Blog Name : " + response_object.get("blog_name"));
			System.out.println("Id : " + response_object.get("id"));
			System.out.println("Post Url : " + response_object.get("post_url"));
			System.out.println("Slug : " + response_object.get("slug"));
			System.out.println("Type : " + response_object.get("type"));
			System.out.println("Tags : " + response_object.get("tags"));
			System.out.println("Date : " + response_object.get("date"));
			System.out.println("Timestamp : " + response_object.get("timestamp"));
			System.out.println("State : " + response_object.get("state"));
			System.out.println("Format : " + response_object.get("format"));
			System.out.println("Recommended_Source : " + response_object.get("recommended_source"));
			System.out.println("Caption : " + response_object.get("caption"));
			System.out.println("Highlighted : " + response_object.get("highlighted"));
			System.out.println("Short Url : " + response_object.get("short_url"));
			System.out.println("Note Count : " + response_object.get("note_count"));
			System.out.println("Link Url : " + response_object.get("link_url"));
			System.out.println("Image Permalink : " + response_object.get("image_permalink"));
			System.out.println("Reblog : " + response_object.get("reblog"));
			System.out.println("--------------------------------------------------------\n");
		}
	}   

	public String getJSONResponseForTag(String tag) throws IOException {  

		this.TAG = tag;
		String url = formLink();

		return getJSONResponse(url);
	} 

	@SuppressWarnings("unchecked")
	public <T> Set<T> getSetFromJSON(JSONArray array) { 

		Set<T> generic_tag_set = new HashSet<T>(); 

		for (int i = 0; i < array.size(); i++) { 

			generic_tag_set.add((T) array.get(i));
		}

		return generic_tag_set;
	} 

	public static void main(String args[]) throws IOException, ParseException { 

		TagFetch tag = new TagFetch();
		
		tag.printJSON(tag.getParsedJSON(tag.getJSONResponseForTag("food cool")));
	}

}
