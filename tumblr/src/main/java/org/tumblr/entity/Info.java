package org.tumblr.entity;

/** 
 * Defines the object for blog info
 * @author Rupak Chakraborty
 *
 */ 

public class Info {
	
	private String title;
	private String name;
	private Long posts;
	private String url;
	private double updated;
	private String description;
	private Long likes;
	private String askPageTitle;
	private boolean isNSFW;
	private boolean ask;
	private boolean share_likes;
	private boolean ask_anon;
	
	/** 
	 * 
	 */ 
	
	public Info() { 
		
		title = "";
		name = "";
		posts = 0L;
		url = "";
		updated = 0.0;
		description = "";
		likes = 0L;
		askPageTitle = "";
		isNSFW = false;
		ask = false;
		share_likes = false;
		ask_anon = false;
	} 
	
	/** 
	 * 
	 * @return the title
	 */ 
	
	public String getTitle() {
		return title;
	}
	/** 
	 * 
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	} 
	
	/** 
	 * 
	 * @param name the name to set
	 */ 
	
	public void setName(String name) {
		this.name = name;
	} 
	
	/** 
	 * 
	 * @return the posts
	 */ 
	
	public Long getPosts() {
		return posts;
	} 
	
	/** 
	 * 
	 * @param posts the posts to set
	 */ 
	
	public void setPosts(Long posts) {
		this.posts = posts;
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
	 * @return the updated
	 */ 
	
	public double getUpdated() {
		return updated;
	} 
	
	/** 
	 * 
	 * @param updated the updated to set
	 */ 
	
	public void setUpdated(double updated) {
		this.updated = updated;
	} 
	
	/** 
	 * 
	 * @return the description
	 */ 
	
	public String getDescription() {
		return description;
	} 
	
	/** 
	 * 
	 * @param description the description to set
	 */ 
	
	public void setDescription(String description) {
		this.description = description;
	} 
	
	/** 
	 * 
	 * @return the likes
	 */ 
	
	public Long getLikes() {
		return likes;
	} 
	
	/** 
	 * 
	 * @param likes the likes to set
	 */ 
	
	public void setLikes(Long likes) {
		this.likes = likes;
	} 
	
	/** 
	 * 
	 * @return the askPageTitle
	 */ 
	
	public String getAskPageTitle() {
		return askPageTitle;
	} 
	
	/** 
	 * 
	 * @param askPageTitle the askPageTitle to set
	 */ 
	
	public void setAskPageTitle(String askPageTitle) {
		this.askPageTitle = askPageTitle;
	} 
	
	/** 
	 * 
	 * @return the isNSFW
	 */ 
	
	public boolean isNSFW() {
		return isNSFW;
	} 
	
	/** 
	 * 
	 * @param isNSFW the isNSFW to set
	 */ 
	
	public void setNSFW(boolean isNSFW) {
		this.isNSFW = isNSFW;
	} 
	
	/** 
	 * 
	 * @return the ask
	 */
	 
	public boolean isAsk() {
		return ask;
	} 
	
	/** 
	 * 
	 * @param ask the ask to set
	 */ 
	
	public void setAsk(boolean ask) {
		this.ask = ask;
	} 
	
	/** 
	 * 
	 * @return the share_likes
	 */ 
	
	public boolean isShare_likes() {
		return share_likes;
	} 
	
	/** 
	 * 
	 * @param share_likes the share_likes to set
	 */ 
	
	public void setShare_likes(boolean share_likes) {
		this.share_likes = share_likes;
	} 
	
	/** 
	 * 
	 * @return the ask_anon
	 */ 
	
	public boolean isAsk_anon() {
		return ask_anon;
	} 
	
	/** 
	 * 
	 * @param ask_anon the ask_anon to set
	 */ 
	
	public void setAsk_anon(boolean ask_anon) {
		this.ask_anon = ask_anon;
	}
}
