package com.manoel.gametrackerapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "ownership", uniqueConstraints = {
		@UniqueConstraint(name = "uq_game_platform", 
				columnNames = {"game_id", "platform_id"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ownership {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "game_id", nullable = false, foreignKey = @ForeignKey(name = "fk_name"))
	private Game game;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "platform_id", nullable = false, foreignKey = @ForeignKey(name = "fk_platform"))
	private Platform platform;
	
	@Column(name = "acquired_at")
	private LocalDateTime acquiredAt;
	
	@Column(name = "status_on_platform", length = 50)
	private String statusOnPlatform;
	
	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;
}
