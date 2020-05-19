package org.karan.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")
public class FoutWheeler extends Vehical {
   private String SterringType;

public String getSterringType() {
	return SterringType;
}

public void setSterringType(String sterringType) {
	SterringType = sterringType;
}
   
}
