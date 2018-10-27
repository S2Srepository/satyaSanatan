package com.app.S2S.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity(name="SubCategory")
@Table(name="SubCategory")
public class SubCategory {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String catDiscription;
	@Column
	private String CatName;
	@Column
	private String fileName;
	@Column
	private String filePath;
	@Transient
	public CommonsMultipartFile[] files;
	public SubCategory(){}
	public SubCategory(int id ,String catDiscription,String CatName,String fileName,String filePath){
		this.catDiscription=catDiscription;
		this.id=id;
		this.CatName=CatName;
		this.fileName=fileName;
		this.filePath=filePath;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatDiscription() {
		return catDiscription;
	}
	public void setCatDiscription(String catDiscription) {
		this.catDiscription = catDiscription;
	}
	public String getCatName() {
		return CatName;
	}
	public void setCatName(String catName) {
		CatName = catName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public CommonsMultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}

}
