CREATE TABLE listener (
   id_listener INTEGER,
   name VARCHAR(255),
   surname VARCHAR(255),
   phone VARCHAR(255),
   email VARCHAR(255),
   PRIMARY KEY (id_listener)
);

CREATE TABLE listener_user (
   id_user INTEGER,
   id_listener INTEGER references listener(id_listener),
   creation_date timestamp,
   userame VARCHAR(255),
   password VARCHAR(255),
   PRIMARY KEY (id_user)
);

CREATE TABLE token (
   id_user INTEGER references listener_user(id_user),
   creation_date timestamp,
   token VARCHAR(255)   	
);

CREATE TABLE user_audit (
   id_user INTEGER references listener_user(id_user),
   login_date timestamp
);
