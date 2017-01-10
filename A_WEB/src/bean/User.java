package bean;

public class User {
	
	String id, email , password , createdDate, urlPhoto;
	Boolean authentication = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}
	
	public User(String id,String email ,String password , String createdDate, String urlPhoto){
		setId(id);
		setEmail(email);
		setPassword(password);
		setCreatedDate(createdDate);
		setUrlPhoto(urlPhoto);
		if("123".equals(getId()) && "123".equals(getPassword())){
			setAuthentication(true);
		}
	}

	public Boolean getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Boolean authentication) {
		this.authentication = authentication;
	}

	
}
