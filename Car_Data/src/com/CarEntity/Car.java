package com.CarEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CarInfo")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_id;
	private String Model;
	private long Year;
	private String Color;
	private String Number;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int car_id, String model, long year, String color, String number) {
		super();
		this.car_id = car_id;
		Model = model;
		Year = year;
		Color = color;
		Number = number;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public long getYear() {
		return Year;
	}

	public void setYear(long year) {
		Year = year;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", Model=" + Model + ", Year=" + Year + ", Color=" + Color + ", Number="
				+ Number + "]";
	}

}
