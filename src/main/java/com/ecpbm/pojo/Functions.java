package com.ecpbm.pojo;

/**
 * 系统功能信息
 */

import java.util.HashSet;
import java.util.Set;

public class Functions implements Comparable<Functions> {
	private int id;
	private String name;
	private int parentid;
	private boolean isleaf;

	// 关联的属性
	private Set ais = new HashSet();

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

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public boolean isIsleaf() {
		return isleaf;
	}

	public void setIsleaf(boolean isleaf) {
		this.isleaf = isleaf;
	}

	public Set getAis() {
		return ais;
	}

	public void setAis(Set ais) {
		this.ais = ais;
	}


	/**
	 * 在排序时将两个Function对象的id进行比较，根据比较结果返回数值
	 * @param arg0
	 * @return
	 */
	@Override
	public int compareTo(Functions arg0) {
		return ((Integer) this.getId()).compareTo((Integer) (arg0.getId()));
	}
}
