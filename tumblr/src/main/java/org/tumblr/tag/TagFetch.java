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
	
	/** 
	 * 
	 * @param tumblr_tag
	 */ 
	
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
			System.out.println("Reblog Key : " + response_object.get("reblog_key"));
			System.out.println("Reblog : " + response_object.get("reblog"));
			JSONArray array = (JSONArray)response_object.get("photos"); 

			for (int j = 0; j < array.size(); j++) { 
				JSONObject temp = (JSONObject) array.get(j);
				printTumblrPhoto(temp);
			} 
			
			JSONArray trail = (JSONArray) response_object.get("trail"); 
			
			for (int k = 0; k < trail.size(); k++) { 
				
				JSONObject temp = (JSONObject) trail.get(k);
				printTumblrTrail(temp);
			} 
			
			System.out.println("--------------------------------------------------------\n");
		}
	}   
	
	/** 
	 * 
	 * @param trail
	 */ 
	
	public void printTumblrTrail(JSONObject trail) { 

		System.out.println("-------------------------------------------------------------\n");
		System.out.println("Content : " + trail.get("content"));
		System.out.println("Content Raw : " + trail.get("content_raw"));
		System.out.println("Is Current Item : " + trail.get("is_current_item"));
		System.out.println("Is Root Item : " + trail.get("is_root_item"));
		JSONObject blog = (JSONObject) trail.get("blog");
		System.out.println("Blog Name : " + blog.get("name"));
		System.out.println("Blog Active : " + blog.get("active"));
		JSONObject theme = (JSONObject) blog.get("theme");
		printTumblrTheme(theme);
		JSONObject post = (JSONObject) trail.get("post");
		System.out.println("Post Id : " + post.get("id"));
		System.out.println("---------------------------------------------------------------\n");
	}
	
	/** 
	 * 
	 * @param theme
	 */ 
	
	public void printTumblrTheme(JSONObject theme) { 

		System.out.println("-------------------------------------------------------------\n");
		System.out.println("Avatar Shape : " + theme.get("avatar_shape"));
		System.out.println("Header Image : " + theme.get("header_image"));
		System.out.println("Header Image Scaled : " + theme.get("header_image_scaled"));
		System.out.println("Link Color : " + theme.get("link_color"));
		System.out.println("Background Color : " + theme.get("background_color"));
		System.out.println("Header Image Focused : " + theme.get("header_image_focused"));
		System.out.println("Header Stretch : " + theme.get("header_stretch"));
		System.out.println("Show Avatar : " + theme.get("show_avatar"));
		System.out.println("Show Description : " + theme.get("show_description"));
		System.out.println("Show Header Image : " + theme.get("show_header_image"));
		System.out.println("Show Title : " + theme.get("show_title"));
		System.out.println("Title Color : " + theme.get("title_color"));
		System.out.println("Title Font : " + theme.get("title_font"));
		System.out.println("Title Font Weight : " + theme.get("title_font_weight"));
		System.out.println("Body Font : " + theme.get("body_font"));
		System.out.println("Header Bounds : " + theme.get("header_bounds"));
		System.out.println("--------------------------------------------------------------\n");
	}
	
	/** 
	 * 
	 * @param photo_object
	 */ 
	
	public void printTumblrPhoto(JSONObject photo_object) { 

		JSONArray alt_sizes = (JSONArray) photo_object.get("alt_sizes");
		JSONObject original_size = (JSONObject) photo_object.get("original_size");
		JSONObject temp; 

		System.out.println("-----------------------------------------------------\n");
		System.out.println("Photo Caption : " + photo_object.get("caption"));
		System.out.println("Width Original : " + original_size.get("width"));
		System.out.println("Height Original : " + original_size.get("height"));
		System.out.println("URL Original : " + original_size.get("url"));
		System.out.println("Alt Sizes Array :- "); 

		for (int i = 0; i < alt_sizes.size(); i++) { 

			temp = (JSONObject) alt_sizes.get(i);
			System.out.println("Width Alternate : " + temp.get("width"));
			System.out.println("Height Alternate : " + temp.get("height"));
			System.out.println("URL Alternate : " + temp.get("url"));
		}

		System.out.println("---------------------------------------------------------\n");
	} 
	
	/** 
	 * 
	 * @param tag
	 * @return
	 * @throws IOException
	 */ 
	
	public String getJSONResponseForTag(String tag) throws IOException {  

		this.TAG = tag;
		String url = formLink();

		return getJSONResponse(url);
	} 
	
	/** 
	 * 
	 * @param array
	 * @return
	 */ 
	
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

		tag.printJSON(tag.getParsedJSON(tag.getJSONResponseForTag("fashion")));
	}
}
