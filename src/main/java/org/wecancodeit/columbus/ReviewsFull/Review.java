package org.wecancodeit.columbus.ReviewsFull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@ManyToOne
	private Category category;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}
	@SuppressWarnings ("unused")
	private Review () {
	
	}
	
	public Review(String name, Category category) {
		this.name = name;
		this.category = category;
		
	}
	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return id == ((Review) obj).id;
	}

}
