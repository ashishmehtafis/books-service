package books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String id;
	private String subscriberName;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public User(String id, String subscriberName, String password, String email) {
		this.id = id;
		this.subscriberName = subscriberName;
		this.password = password;
		this.email = email;
	}
	
	@Id
	@Column(name = "user_id", nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "subscriber_name", nullable = false)
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	
	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", subscriberName=" + subscriberName + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
