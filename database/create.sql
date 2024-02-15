DROP table IF exists teams;

CREATE TABLE teams (
    id serial PRIMARY key,
    team_name VARCHAR(255),
    coach_name VARCHAR(255),
    founded_year INT,
    address VARCHAR(255),
    city VARCHAR(255),
    country VARCHAR(255)
);

