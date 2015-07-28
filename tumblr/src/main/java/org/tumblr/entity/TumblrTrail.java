package org.tumblr.entity;

/** Defines a trail object from a given blog post 
 * 
 * @author Rupak Chakraborty
 *
 */

public class TumblrTrail {
	
	private String blogName;
	private boolean blogActive;
	private TumblrTheme theme;
	private boolean IsCurrentItem;
	private String postId;
	private String content;
	private String contentraw;
	private boolean isRootItem; 
	
	public TumblrTrail () { 
		
	}

	/**
	 * @return the blogName
	 */
	public String getBlogName() {
		return blogName;
	}

	/**
	 * @param blogName the blogName to set
	 */
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	/**
	 * @return the blogActive
	 */
	public boolean isBlogActive() {
		return blogActive;
	}

	/**
	 * @param blogActive the blogActive to set
	 */ 
	
	public void setBlogActive(boolean blogActive) {
		this.blogActive = blogActive;
	}

	/**
	 * @return the theme
	 */ 
	
	public TumblrTheme getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */ 
	
	public void setTheme(TumblrTheme theme) {
		this.theme = theme;
	}

	/**
	 * @return the isCurrentItem
	 */ 
	
	public boolean isIsCurrentItem() {
		return IsCurrentItem;
	}

	/**
	 * @param isCurrentItem the isCurrentItem to set
	 */ 
	
	public void setIsCurrentItem(boolean isCurrentItem) {
		IsCurrentItem = isCurrentItem;
	}

	/**
	 * @return the postId
	 */ 
	
	public String getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */ 
	
	public void setPostId(String postId) {
		this.postId = postId;
	}

	/**
	 * @return the content
	 */ 
	
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */ 
	
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the contentraw
	 */ 
	
	public String getContentraw() {
		return contentraw;
	}

	/**
	 * @param contentraw the contentraw to set
	 */ 
	
	public void setContentraw(String contentraw) {
		this.contentraw = contentraw;
	}

	/**
	 * @return the isRootItem
	 */ 
	
	public boolean isRootItem() {
		return isRootItem;
	}

	/**
	 * @param isRootItem the isRootItem to set
	 */ 
	
	public void setRootItem(boolean isRootItem) {
		this.isRootItem = isRootItem;
	} 
	
	
}
