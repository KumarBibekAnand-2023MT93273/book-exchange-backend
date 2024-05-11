package com.fsad.bookexchange.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long exchangeRequestId;
	private String bookTitle;
	private String author;
	private String yourName;
	private String yourEmail;
	private String deliveryMethod;
	private String duration;
	private String status;
	
	@ManyToOne
	private User user;
	
	
}
