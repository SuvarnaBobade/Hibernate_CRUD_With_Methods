package com.ProductEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="ProductInfo")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String product_name;
	private String company_name;
	private long price;
	private float wgt;
	private String Color;
	private String Brand;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String product_name, String company_name, long price, float wgt,
			String color, String brand) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.company_name = company_name;
		this.price = price;
		this.wgt = wgt;
		Color = color;
		Brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public float getWgt() {
		return wgt;
	}

	public void setWgt(float wgt) {
		this.wgt = wgt;
	}

	

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", company_name=" + company_name + ", price="
				+ price + ", wgt=" + wgt + ", Color=" + Color + ", Brand="
				+ Brand + "]";
	}
}
