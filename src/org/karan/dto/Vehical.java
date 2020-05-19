package org.karan.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.context.annotation.Description;

@Entity
@DiscriminatorColumn(name="VEHICAL_TYPE",discriminatorType = DiscriminatorType.STRING)
public class Vehical {
	@Id @GeneratedValue
   private int vehical_id;
   
	private String LicenceNumber;
	
	private String chesisNumber;

	public int getVehical_id() {
		return vehical_id;
	}

	public void setVehical_id(int vehical_id) {
		this.vehical_id = vehical_id;
	}

	public String getLicenceNumber() {
		return LicenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		LicenceNumber = licenceNumber;
	}

	public String getChesisNumber() {
		return chesisNumber;
	}

	public void setChesisNumber(String chesisNumber) {
		this.chesisNumber = chesisNumber;
	}
	
	
}
