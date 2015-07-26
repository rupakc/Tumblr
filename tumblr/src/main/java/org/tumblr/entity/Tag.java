package org.tumblr.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Tag {

	private String blogName;
	private String Id;
	private String postURL;
	private String slug;
	private String type;
	private Set<String> tags;
	private Date date;
	private double timestamp;
	private String state;
	private String format;
	private String recommendedSource;
	private String caption;
	private String shortURL;
	private String linkURL;
	private Long noteCount;
	private String imagePermalink;
	private String reblogTreeHtml;
	private String reblogComment; 
	
	
	/**
	 * 
	 */
	public Tag() { 
		
		blogName = "";
		Id = "";
		postURL = "";
		slug = "";
		type = "";
		tags = new HashSet<String>();
		date = new Date();
		timestamp = 0.0;
		state = "";
		format = "";
		recommendedSource = "";
		caption = "";
		shortURL = "";
		linkURL = "";
		noteCount = 0L;
		imagePermalink = "";
		reblogTreeHtml = "";
		reblogComment = "";
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
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the postURL
	 */
	public String getPostURL() {
		return postURL;
	}
	/**
	 * @param postURL the postURL to set
	 */
	public void setPostURL(String postURL) {
		this.postURL = postURL;
	}
	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}
	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the tags
	 */
	public Set<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the timestamp
	 */
	public double getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the recommendedSource
	 */
	public String getRecommendedSource() {
		return recommendedSource;
	}
	/**
	 * @param recommendedSource the recommendedSource to set
	 */
	public void setRecommendedSource(String recommendedSource) {
		this.recommendedSource = recommendedSource;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	 * @return the shortURL
	 */
	public String getShortURL() {
		return shortURL;
	}
	/**
	 * @param shortURL the shortURL to set
	 */
	public void setShortURL(String shortURL) {
		this.shortURL = shortURL;
	}
	/**
	 * @return the linkURL
	 */
	public String getLinkURL() {
		return linkURL;
	}
	/**
	 * @param linkURL the linkURL to set
	 */
	public void setLinkURL(String linkURL) {
		this.linkURL = linkURL;
	}
	/**
	 * @return the noteCount
	 */
	public Long getNoteCount() {
		return noteCount;
	}
	/**
	 * @param noteCount the noteCount to set
	 */
	public void setNoteCount(Long noteCount) {
		this.noteCount = noteCount;
	}
	/**
	 * @return the imagePermalink
	 */
	public String getImagePermalink() {
		return imagePermalink;
	}
	/**
	 * @param imagePermalink the imagePermalink to set
	 */
	public void setImagePermalink(String imagePermalink) {
		this.imagePermalink = imagePermalink;
	}
	/**
	 * @return the reblogTreeHtml
	 */
	public String getReblogTreeHtml() {
		return reblogTreeHtml;
	}
	/**
	 * @param reblogTreeHtml the reblogTreeHtml to set
	 */
	public void setReblogTreeHtml(String reblogTreeHtml) {
		this.reblogTreeHtml = reblogTreeHtml;
	}
	/**
	 * @return the reblogComment
	 */
	public String getReblogComment() {
		return reblogComment;
	}
	/**
	 * @param reblogComment the reblogComment to set
	 */
	public void setReblogComment(String reblogComment) {
		this.reblogComment = reblogComment;
	}
}
