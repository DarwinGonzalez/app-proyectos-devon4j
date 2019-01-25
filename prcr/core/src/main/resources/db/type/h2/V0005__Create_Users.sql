
CREATE TABLE Users(
   id BIGINT NOT NULL AUTO_INCREMENT,
   username varchar(20) NOT NULL,
   role varchar(20) NOT NULL,
   password varchar(64) NOT NULL,
   modificationCounter INTEGER NOT NULL,
   PRIMARY KEY (id)
);







