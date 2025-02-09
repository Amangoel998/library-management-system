import React, { useEffect, useState } from "react";
import { Container, Row } from "react-bootstrap";
import { BookCard } from "./BookCard";
import { borrowBook, getBooks } from "../api/book-api";
import { Book } from "./types";
import { useUserContext } from "../contexts/UserContext";

export const Home: React.FC = () => {
  const [books, setBooks] = useState<Book[]>([]);
  const credentials = useUserContext();

  useEffect(() => {
    handleFetchBooks();
  }, []);

  const handleFetchBooks = async () => {
    const data = await getBooks(credentials);
    if (!!data) {
      setBooks(data);
    }
  };

  const handleBorrow = async (bookId) => {
    await borrowBook(bookId, credentials);
  };

  return (
    <Container>
      <Row>
        <h1 className="mb-4">Books</h1>
        <div className="row">
          {books.map((book) => (
            <div key={book.id} className="col-md-4 mb-4">
              <div className="card">
                <div className="card-body">
                  <h5 className="card-title">{book.title}</h5>
                  <h6 className="card-subtitle mb-2 text-muted">
                    Author: {book.author}
                  </h6>
                  <p className="card-text">Copies Available: {book.copies}</p>
                  <button
                    className={`btn ${
                      book.copies === 0 ? "btn-secondary" : "btn-primary"
                    }`}
                    onClick={() => handleBorrow(book.id)}
                    disabled={book.copies === 0}
                  >
                    {book.copies === 0 ? "Out of Stock" : "Borrow"}
                  </button>
                </div>
              </div>
            </div>
          ))}
        </div>
      </Row>
    </Container>
  );
};
