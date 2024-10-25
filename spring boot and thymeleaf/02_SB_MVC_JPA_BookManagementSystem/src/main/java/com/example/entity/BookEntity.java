package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Book")

public class BookEntity {

	@Id
	@Column(name="BOOKID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int bookid;
	
	@Column(name="BOOKNAME")
	public String bookname;
	
	@Column(name="AUTHORNAME")
	public String authorname;
	
	@Column(name="BOOKPRICE")
	public String bookprice;
	
	
	
}
