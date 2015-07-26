/**
 * 
 */
package org.tumblr.blog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Rupak Chakraborty
 * TODO-Add DB Support Using the Info object
 */ 

public class BlogInfo {

	String BASE_URL = "http://api.tumblr.com/v2/blog/";
	String BLOG_NAME = "david.tumblr.com";
	String SUFFIX_URL = "/info?api_key=";
	String API_KEY = "yztzKI5WfBoZ9LcELEBvw4zDrYQRTAjQa9EwjWPlViJQugLVXS";

	/**
	 * 
	 */ 

	public BlogInfo() {
	}

	/** 
	 * 
	 * @param bLOG_NAME
	 * @param sUFFIX_URL
	 */ 

	public BlogInfo(String bLOG_NAME, String sUFFIX_URL) {
		BLOG_NAME = bLOG_NAME;
		SUFFIX_URL = sUFFIX_URL;
	}

	/**
	 * 
	 * @param bLOG_NAME
	 */ 

	public BlogInfo(String bLOG_NAME) {
		BLOG_NAME = bLOG_NAME;
	}

	/** 
	 * 
	 * @return
	 */ 

	public String getFullURL() { 

		String URL = this.BASE_URL + this.BLOG_NAME + this.SUFFIX_URL + this.API_KEY;

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
	 * @param response_object
	 * @return
	 */ 
	
	public boolean checkStatus(JSONObject response_object) { 

		boolean status = true;
		JSONObject meta_tag = (JSONObject) response_object.get("meta");
		String message = (String) meta_tag.get("msg");

		if (!message.equalsIgnoreCase("OK")) { 

			status = false;
		}

		return status;
	} 
	
	/** 
	 * 
	 * @param response_object
	 */
	
	public void printBlogInfo(JSONObject response_object) { 

		System.out.println("--------------------------------------------------\n");
		System.out.println("Title : " + response_object.get("title"));
		System.out.println("Name : " + response_object.get("name"));
		System.out.println("Posts : " + response_object.get("posts"));
		System.out.println("URL : " + response_object.get("url"));
		System.out.println("Updated (Double) : " + response_object.get("updated"));
		System.out.println("Description : " + response_object.get("description"));
		System.out.println("Likes : " + response_object.get("likes"));
		System.out.println("Ask Page Title : " + response_object.get("ask_page_title"));
		System.out.println("Is NSFW (bool) : " + response_object.get("is_nsfw"));
		System.out.println("Ask (bool) : " + response_object.get("ask"));
		System.out.println("Share Likes (bool) : " + response_object.get("share_likes"));
		System.out.println("Ask Anon (bool) : " + response_object.get("ask_anon"));
		System.out.println("-----------------------------------------------------\n");
	}
	
	/** 
	 * 
	 * @param blog_name
	 * @throws IOException
	 * @throws ParseException
	 */ 
	
	public void fetchBlogInfoPipeline(String blog_name) throws IOException, ParseException { 

		this.BLOG_NAME = blog_name;
		String link = getFullURL();
		String json_response = getJSONResponse(link);
		JSONObject json_object = getParsedJSON(json_response);
		JSONObject response = (JSONObject) json_object.get("response");
		JSONObject blog = (JSONObject) response.get("blog");
		if (checkStatus(json_object)) {
			printBlogInfo(blog);
		}
	} 
	
	/** 
	 * 
	 * @throws IOException
	 * @throws ParseException
	 */
	
	public void fetchBlogInfoPipeline() throws IOException, ParseException { 

		String link = getFullURL();
		String json_response = getJSONResponse(link);
		JSONObject json_object = getParsedJSON(json_response);
		JSONObject response = (JSONObject) json_object.get("response");
		JSONObject blog = (JSONObject) response.get("blog");
		if(checkStatus(json_object)) {
			printBlogInfo(blog);
		}
	}

	public static void main(String args[]) { 

		try {
			new BlogInfo().fetchBlogInfoPipeline();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
