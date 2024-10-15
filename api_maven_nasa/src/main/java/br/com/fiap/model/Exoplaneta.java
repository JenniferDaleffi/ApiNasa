package br.com.fiap.model;

public class Exoplaneta {

	private String englishName;
	private String gravity;
	private String name;
	private String id;

	public Exoplaneta() {
		super();
	}

	public Exoplaneta(String englishName, String gravity, String name, String id) {
		super();
		this.englishName = englishName;
		this.gravity = gravity;
		this.name = name;
		this.id = id;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Exoplaneta [englishName=" + englishName + ", gravity=" + gravity + ", name=" + name + ", id=" + id
				+ "]";
	}
}