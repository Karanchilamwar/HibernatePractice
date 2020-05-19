package org.karan.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class TwoWheeler extends Vehical {
	
    private String sterringType;

	public String getSterringType() {
		return sterringType;
	}

	public void setSterringType(String sterringType) {
		this.sterringType = sterringType;
	}
    
    
}
