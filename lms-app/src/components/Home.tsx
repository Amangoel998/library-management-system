import React, { useEffect, useState } from "react";
import { Container, Row } from "react-bootstrap";
import { BookCard } from "./BookCard";
import { getBooks } from "../api/book-api";
import { Book } from "./types";

export const Home: React.FC = () => {
  const [books, setBooks] = useState<Book[]>([]);

  useEffect(() => {
    const fetchBooks = async () => {
      const data = await getBooks();
      setBooks(data);
    };
    fetchBooks();
  }, []);

  return (
    <Container>
      <Row>
        {books.map((book) => (
          <BookCard key={book.id} book={book} />
        ))}
      </Row>
    </Container>
  );
};
