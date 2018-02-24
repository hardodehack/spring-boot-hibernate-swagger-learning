package tech.hardik.springapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class HardikEntity {

	public HardikEntity(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public HardikEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

	@Column
	@NotNull
	// @Temporal(TemporalType.TIMESTAMP)
	private String firstName;

	@Column
	@NotNull
	// @Temporal(TemporalType.TIMESTAMP)
	private String lastName;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
