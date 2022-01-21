package com.example.demo.entity;



@Entity
public class customer {
	    
		private String name;
		private String gender;
		private Integer DOB;
		private String address;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Integer getDOB() {
			return DOB;
		}
		public void setDOB(Integer dOB) {
			DOB = dOB;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		private String city;
		


}
