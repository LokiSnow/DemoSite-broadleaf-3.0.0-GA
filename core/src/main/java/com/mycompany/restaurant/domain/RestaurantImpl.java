package com.mycompany.restaurant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="BLC_RESTAURANT_DTL")
public class RestaurantImpl implements Restaurant{
	@Id
	@GenericGenerator(
	        name="restId",
	        strategy="org.broadleafcommerce.common.persistence.IdOverrideTableGenerator",
	        parameters = {
	            @Parameter(name="segment_value", value="RestaurantImpl"),
	            @Parameter(name="entity_name", value="com.mycompany.restaurant.domain.RestaurantImpl")
	        }
	    )
	@Column(name = "REST_ID")
	public long restId;
	@Column(name = "SEQ_NO")
	public long seqNO;
	@Column(name = "REST_NAME")
	public String restName;
	@Column(name = "REST_PHONE_NO")
	public String restPhoneNo;
	
	
	@Override
	public long getSeqNO() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setSeqNO(long seqNO) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getRestName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setRestName(String restName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getRestPhoneNo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setRestPhoneNo(String restPhoneNo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public long getRestId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setRestId(long restId) {
		// TODO Auto-generated method stub
		
	}
	
}
