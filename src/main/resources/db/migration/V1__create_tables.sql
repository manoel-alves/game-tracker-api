CREATE TYPE game_status AS ENUM ('UNPLAYED', 'PLAYING', 'COMPLETED', 'DROPPED')

CREATE TABLE game (
    id UUID PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    status game_status NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE platform (
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ownership (
    id UUID PRIMARY KEY,
    game_id UUID NOT NULL,
    platform_id UUID NOT NULL,
    acquired_at TIMESTAMP,
    status_on_platform VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_game FOREIGN KEY (game_id) REFERENCES game(id),
    CONSTRAINT fk_platform FOREIGN KEY (platform_id) REFERENCES platform(id),
    CONSTRAINT uq_game_platform UNIQUE (game_id, platform_id)
);