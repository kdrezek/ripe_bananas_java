package com.ripe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="movie_tbl")

public class Movie {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String poster;
	
	@Column(nullable = false)
	private String title;	
	

	@Column(nullable = false)
	private String genre;
	
	@Column(nullable = false)
	private String description; 
	
	@Column(nullable = false)
	private int numrating;
	
	@Column(nullable = false)
	private int rating;

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumrating() {
		return numrating;
	}

	public void setNumrating(int numrating) {
		this.numrating = numrating;
	}
	
	public int Rating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + numrating;
		result = prime * result + rating;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Movie other = (Movie) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		
		if (poster != other.poster)
			return false;
	
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
		/* Not sure what to do if it's integer type because it's
		 * not the same idea as the id in the user route
		if (numrating == null) {
			if (other.numrating != null)
				return false;
		} else if (!numrating.equals(other.numrating))
			return false;
		
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;*/

	@Override
	public String toString() {
		return "Movie [poster=" + poster + ", title=" + title + ", genre=" + genre 
				+ ", description=" + description + ", number rating=" + numrating + 
				", rating=" + rating + "]";
	}
	

}
