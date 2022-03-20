@groovy.transform.ToString()
class Tweet {

	// properties
	String username
	String text
	Integer retweets
	Integer favorites
	Date createdOn

	// constructor
	public Tweet(String username, String text) {
		this.username = username
		this.text = text
		retweets = 0
		favorites = 0
		createdOn = new Date()

	}

	void addToRetweets() {
		retweets += 1
	}

	void addToFavorites () {
		favorites += 1
	}

}