

CREATE TABLE bp (
	bpno 	VARCHAR(25) 	NOT NULL,
	bpname 	VARCHAR(255) 	NOT NULL,
	CONSTRAINT pk_bp PRIMARY KEY (bpno)
);

CREATE UNIQUE INDEX bp_idx ON bp (
	bpno
);


CREATE TABLE sale (
	saleno 		VARCHAR(25) 	NOT NULL,
	bpno 		VARCHAR(25) 	NOT NULL,
	saledate 	DATE 		NOT NULL,
	total 		NUMERIC(19,4) 	NOT NULL DEFAULT 0,
	CONSTRAINT pk_sale PRIMARY KEY (saleno),
	CONSTRAINT fk_sale_rel_bp FOREIGN KEY (bpno) REFERENCES bp(bpno) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE UNIQUE INDEX sale_idx ON sale (
	saleno
);

CREATE INDEX salebp_idx ON sale (
	bpno
);


