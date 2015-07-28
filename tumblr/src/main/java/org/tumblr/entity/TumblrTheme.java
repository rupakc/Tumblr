package org.tumblr.entity;

/** 
 * Defines a Tumblr Theme for a given Tumblr trail object
 * @author Rupak Chakraborty
 *
 */ 

public class TumblrTheme {
	
	private String avatar_shape;
	private String header_image;
	private String header_image_scaled;
	private String link_color;
	private String background_color;
	private String header_image_focused;
	private String header_stretch;
	private boolean show_avatar;
	private boolean show_description;
	private boolean show_header_image;
	private boolean show_title;
	private String body_font;
	private Long header_bounds;
	private String title_color;
	private String title_font;
	private String title_font_weight;
	
	public TumblrTheme() { 
		
	}

	/** 
	 * 
	 * @return the avatar_shape
	 */ 
	
	public String getAvatarShape() {
		return avatar_shape;
	}

	/** 
	 * 
	 * @param avatar_shape the avatar_shape to set
	 */ 
	
	public void setAvatarShape(String avatar_shape) {
		this.avatar_shape = avatar_shape;
	}

	/** 
	 * 
	 * @return the header_image
	 */ 
	
	public String getHeader_image() {
		return header_image;
	}

	/** 
	 * 
	 * @param header_image the header_image to set
	 */ 
	
	public void setHeader_image(String header_image) {
		this.header_image = header_image;
	}

	/**
	 * @return the header_image_scaled
	 */
	
	public String getHeader_image_scaled() {
		return header_image_scaled;
	}

	/**
	 * @param header_image_scaled the header_image_scaled to set
	 */
	
	public void setHeader_image_scaled(String header_image_scaled) {
		this.header_image_scaled = header_image_scaled;
	}

	/**
	 * @return the link_color
	 */
	
	public String getLink_color() {
		return link_color;
	}

	/**
	 * @param link_color the link_color to set
	 */ 
	
	public void setLink_color(String link_color) {
		this.link_color = link_color;
	}

	/**
	 * @return the background_color
	 */
	
	public String getBackground_color() {
		return background_color;
	}

	/**
	 * @param background_color the background_color to set
	 */ 
	
	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	/**
	 * @return the header_image_focused
	 */ 
	
	public String getHeader_image_focused() {
		return header_image_focused;
	}

	/**
	 * @param header_image_focused the header_image_focused to set
	 */ 
	
	public void setHeader_image_focused(String header_image_focused) {
		this.header_image_focused = header_image_focused;
	}

	/**
	 * @return the header_stretch
	 */
	
	public String getHeader_stretch() {
		return header_stretch;
	}

	/**
	 * @param header_stretch the header_stretch to set
	 */ 
	
	public void setHeader_stretch(String header_stretch) {
		this.header_stretch = header_stretch;
	}

	/**
	 * @return the show_avatar
	 */
	
	public boolean isShow_avatar() {
		return show_avatar;
	}

	/**
	 * @param show_avatar the show_avatar to set
	 */
	
	public void setShow_avatar(boolean show_avatar) {
		this.show_avatar = show_avatar;
	}

	/**
	 * @return the show_description
	 */
	
	public boolean isShow_description() {
		return show_description;
	}

	/**
	 * @param show_description the show_description to set
	 */ 
	
	public void setShow_description(boolean show_description) {
		this.show_description = show_description;
	}

	/**
	 * @return the show_header_image
	 */
	
	public boolean isShow_header_image() {
		return show_header_image;
	}

	/**
	 * @param show_header_image the show_header_image to set
	 */ 
	
	public void setShow_header_image(boolean show_header_image) {
		this.show_header_image = show_header_image;
	}

	/**
	 * @return the show_title
	 */ 
	
	public boolean isShow_title() {
		return show_title;
	}

	/**
	 * @param show_title the show_title to set
	 */ 
	
	public void setShow_title(boolean show_title) {
		this.show_title = show_title;
	}

	/**
	 * @return the body_font
	 */ 
	
	public String getBody_font() {
		return body_font;
	}

	/**
	 * @param body_font the body_font to set
	 */ 
	
	public void setBody_font(String body_font) {
		this.body_font = body_font;
	}

	/**
	 * @return the header_bounds
	 */ 
	
	public Long getHeader_bounds() {
		return header_bounds;
	}

	/**
	 * @param header_bounds the header_bounds to set
	 */ 
	
	public void setHeader_bounds(Long header_bounds) {
		this.header_bounds = header_bounds;
	}

	/**
	 * @return the title_color
	 */ 
	
	public String getTitle_color() {
		return title_color;
	}

	/**
	 * @param title_color the title_color to set
	 */ 
	
	public void setTitle_color(String title_color) {
		this.title_color = title_color;
	}

	/**
	 * @return the title_font
	 */ 
	
	public String getTitle_font() {
		return title_font;
	}

	/**
	 * @param title_font the title_font to set
	 */ 
	
	public void setTitle_font(String title_font) {
		this.title_font = title_font;
	}

	/**
	 * @return the title_font_weight
	 */ 
	
	public String getTitle_font_weight() {
		return title_font_weight;
	}

	/**
	 * @param title_font_weight the title_font_weight to set
	 */ 
	
	public void setTitle_font_weight(String title_font_weight) {
		this.title_font_weight = title_font_weight;
	} 
}
