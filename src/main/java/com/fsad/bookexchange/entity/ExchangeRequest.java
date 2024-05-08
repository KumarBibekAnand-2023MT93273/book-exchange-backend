package com.fsad.bookexchange.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private String bookName;
	private String author;
	private String name;
	private String email;
	private String deliveryMethod;
	private String duration;
	
}
