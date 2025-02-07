import React from "react";
import { Card } from "react-bootstrap";
import { BookCardProps } from "./types";

export const BookCard: React.FC<BookCardProps> = ({ book }) => {
  return (
    <Card style={{ width: "18rem", margin: "10px" }}>
      <Card.Body>
        <Card.Title>{book.title}</Card.Title>
        <Card.Subtitle className="mb-2 text-muted">{book.author}</Card.Subtitle>
      </Card.Body>
    </Card>
  );
};
