
CREATE TABLE Users(
   id BIGINT NOT NULL AUTO_INCREMENT,
   username varchar(20) NOT NULL,
   role varchar(20) NOT NULL,
   password char(64) NOT NULL,
    modification_counter INTEGER NOT NULL,
   PRIMARY KEY (id)
);







