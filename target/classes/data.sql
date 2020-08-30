DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
  user_id VARCHAR(250) PRIMARY KEY,
  subscriber_name VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS Books;
CREATE TABLE Books (
	book_id VARCHAR(250) PRIMARY KEY,
	book_name VARCHAR(250) NOT NULL,
	author VARCHAR(250) NOT NULL,
	available_copies INT,
	total_copies INT
);

INSERT INTO Users (user_id, subscriber_name, password, email) VALUES
('John', 'John Millar','ASDJAS1@21SDDEEEE','abc@xyz.com'),
('Mark', 'Mark Waugh', 'ASDJAS12#231SDDEEE', 'abc2@pqr.com'),('Peter', 'Peter Parker', 'ASDJ1231A@S121SDD', 'abc3@lmn.com');


INSERT INTO Books (book_id, book_name, author, available_copies, total_copies) VALUES
('B1212','History of Amazon Valley', 'Ross Suarez',	0, 2),
('B4232', 'Language Fundamentals', 'H S Parkmay', 5, 5);
