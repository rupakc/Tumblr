package org.tumblr.entity;

/** 
 * 
 * @author Rupak Chakraborty
 *
 */ 

public class TumblrPhoto {
	
	private String caption;
	private String url;
	private Long width;
	private Long height; 
	
	public TumblrPhoto() { 
		
		caption = "";
		url = "";
		width = 0L;
		height = 0L;
	} 
	
	/** 
	 * 
	 * @return the caption
	 */ 
	
	public String getCaption() { 
		
		return caption;
	} 
	
	/** 
	 * 
	 * @param caption the caption to set
	 */ 
	
	public void setCaption(String caption) { 
		
		this.caption = caption;
	} 
	
	/** 
	 * 
	 * @return the url
	 */ 
	
	public String getUrl() { 
		
		return url;
	} 
	
	/** 
	 * 
	 * @param url the url to set
	 */ 
	
	public void setUrl(String url) { 
		
		this.url = url;
	} 
	
	/** 
	 * 
	 * @return the width
	 */ 
	
	public Long getWidth() { 
		
		return width;
	} 
	
	/** 
	 * 
	 * @param width the width to set
	 */ 
	
	public void setWidth(Long width) { 
		
		this.width = width;
	} 
	
	/** 
	 * 
	 * @return the height
	 */ 
	
	public Long getHeight() { 
		
		return height;
	} 
	
	/** 
	 * 
	 * @param height the height to set
	 */ 
	
	public void setHeight(Long height) { 
		
		this.height = height;
	}	
}
