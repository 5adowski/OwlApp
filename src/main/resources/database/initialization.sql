CREATE TABLE letters (
    id UUID PRIMARY KEY,
    sender UUID NOT NULL,
    text TEXT NOT NULL
);

CREATE TABLE owleries (
    id UUID PRIMARY KEY,
    members UUID[] NOT NULL,
    letters UUID[]
);

CREATE TABLE wizards (
    id UUID PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    owleries UUID[]
);