-- Insert Users
INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE) VALUES
(1, 'user1', '$2a$10$YnJzQ5Z7U6ZzZzZzZzZzZu', 'ROLE_USER'), -- Password: password1
(2, 'admin1', '$2a$10$YnJzQ5Z7U6ZzZzZzZzZzZu', 'ROLE_ADMIN'); -- Password: admin123

-- Insert Books
INSERT INTO BOOK (ID, TITLE, AUTHOR, ISBN) VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', '9780743273565'),
(2, '1984', 'George Orwell', '9780451524935'),
(3, 'To Kill a Mockingbird', 'Harper Lee', '9780061120084');

-- Insert Borrow Records
INSERT INTO BORROW_RECORD (ID, USER_ID, BOOK_ID, BORROW_DATE, RETURN_DATE) VALUES
(1, 1, 1, '2023-10-01', '2023-10-15'),
(2, 1, 2, '2023-10-05', NULL),
(3, 2, 3, '2023-10-10', '2023-10-20');