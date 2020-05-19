package org.karan.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class userDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
    private int userId;
	
	@Column(name="USER_NAME")
    private String name;
	
	@Transient
	private String status;
	
	@Column(name="DateOfJoining")
	@Temporal(TemporalType.TIME)
	private Date dateOfJoining;
	
	@Lob
	private String description;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street1",column = @Column(name="ADDRESS_STREET1")),
		@AttributeOverride(name="street2",column = @Column(name="ADDRESS_STREET2"))
		
	})
	@Transient
	private Address address;
	
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",joinColumns = {@JoinColumn(name="USER_ID")})
	private Set<Address> addressSet=new HashSet<Address>();
	
	@ManyToMany
	@JoinTable(name="User_HAS_A_Vehical",joinColumns = @JoinColumn(name="User_id"),inverseJoinColumns = @JoinColumn(name="Vehical_ID"))
	private  Set<Vehical> vehical=new HashSet<Vehical>();
	
	
	public Set<Vehical> getVehical() {
		return vehical;
	}
	public void setVehical(Set<Vehical> vehical) {
		this.vehical = vehical;
	}
	public Set<Address> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfJoining() {
		return new Date();
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
