package com.manoel.gametrackerapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "platform")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Platform {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 255)
	private String name;
	
	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP") 
	private LocalDateTime createdAt; 
	
	@Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP") 
	private LocalDateTime updatedAt;
}

