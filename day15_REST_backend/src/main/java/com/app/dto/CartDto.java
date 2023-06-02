package com.app.dto;

import javax.persistence.Column;

import com.app.pojos.BaseEntity;
import com.app.pojos.CuisineCategory;
import com.app.pojos.Scale;
import com.app.pojos.VegNonVegCategory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
public class CartDto  {

	
	private String dishName;
	
	private String dishPhoto;

	private int price;
	
	private Scale size;
	private Long orderId;
	private Long dishId;
	private Long hotelId;
	private Long itemsId;
	private Long cartId;
	private Long customerId;
	private int qunatity;
	
	public CartDto(String dishName, int i, Scale scale,String path,Long dishId,Long hotelId,Long itemsId) {
		super();
		this.dishName = dishName;
		this.price = i;
		this.size = scale;
		this.dishPhoto = path;
		this.dishId = dishId;
		this.hotelId = hotelId;
		this.itemsId = itemsId;
	}
	
	public CartDto(String dishName, int i, Scale scale,String path,Long dishId,Long hotelId,Long itemsId,int quantity,long customerId,long orderId,long cartId) {
		  super();
		  this.orderId = orderId;
		  this.dishName = dishName;
		  this.price = i;
		  this.size = scale;
		  this.dishPhoto = path;
		  this.dishId = dishId;
		  this.hotelId = hotelId;
		  this.itemsId = itemsId;
		  this.qunatity = quantity;
		  this.customerId = customerId;
		  this.cartId = cartId;
		 }

	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishPhoto() {
		return dishPhoto;
	}

	public void setDishPhoto(String dishPhoto) {
		this.dishPhoto = dishPhoto;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Scale getSize() {
		return size;
	}

	public void setSize(Scale size) {
		this.size = size;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getDishId() {
		return dishId;
	}

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public Long getItemsId() {
		return itemsId;
	}

	public void setItemsId(Long itemsId) {
		this.itemsId = itemsId;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	
	
	
	
}
