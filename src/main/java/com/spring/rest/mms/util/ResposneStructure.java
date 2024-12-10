package com.spring.rest.mms.util;

public class ResposneStructure<T> {

	private int status;
	private String mesaage;
	private T data;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMesaage() {
		return mesaage;
	}
	public void setMesaage(String mesaage) {
		this.mesaage = mesaage;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public static <T> ResposneStructure<T> create(int status, String mesaage, T data){
		ResposneStructure<T> resposneStructure = new ResposneStructure<T>();
		resposneStructure.setStatus(status);
		resposneStructure.setMesaage(mesaage);
		resposneStructure.setData(data);
		return resposneStructure;
	}
}