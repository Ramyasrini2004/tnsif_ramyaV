package com.tnsif.day16;

public class Students {


	//Program to demonstrate Student entity  


		private int rollNo;
		private String name;
		private float per;

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPer() {
			return per;
		}

		public void setPer(float per) {
			this.per = per;
		}

		public Students(int rollNo, String name, float per) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.per = per;
		}

		public Students() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Students [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
		}

	}

