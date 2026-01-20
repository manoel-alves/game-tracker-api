package com.manoel.gametrackerapi.domain;
import com.manoel.gametrackerapi.domain.enums.GameStatus;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 255)
	private String title;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private GameStatus status;
	
	@Column(name = "created_at", nullable = false, updatable = false, 
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at", nullable = false, 
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;
}
