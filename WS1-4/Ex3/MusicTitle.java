
/**
 * @author jta787
 * @version 16/11/19
 */
public class MusicTitle implements MusicTitleInterface {
	
	private String title;
	private String artist;
	private int cost;
	
	/**
	 * @param title
	 * @param artist
	 * @param cost
	 */
	public MusicTitle(String Title, String Artist, int Price) {
		this.title=Title;
		this.artist=Artist;
		this.cost=Price;
	}
	
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

    /**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

    /**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

    /**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * getTitle returns title
	 */
@Override
	public String getTitle() {
		
		return title; 
	}
/**
 * getArtist returns artist
 */
@Override
	public String getArtist() {
		
		return artist;
	}
/**
 * getPrice returns cost
 */
@Override
	public int getPrice() {
		return cost;
	}
/**
 * toString method returns title, artist and price
 */
@Override
	public String toString() {
		return "MusicTitle [getTitle()=" + getTitle() + ", getArtist()=" + getArtist() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
	public static void main(String[] args) {
		

}

}
