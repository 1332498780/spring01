package cn.hzy.demo.model;

import java.util.Date;

public class Student {
	
	private int id;
	private String name;
	private Date date;
	private IdCard idCard;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "[id:"+id+",name"+name+",data:"+date+",idCard="+idCard+"]";
	}
}
