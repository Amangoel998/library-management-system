import axios from "axios";

const API_BASE_URL = "http://localhost:8080";

export const getBooks = async (credentials) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/api/books/`, {
      auth: credentials,
    });
    if (response.status === 200) {
      alert("Book fetched successfully!");
      return response.data;
    }
    return [];
  } catch (e) {
    console.error(e);
  }
};

export const borrowBook = async (bookId: number, credentials) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/borrow/borrow-book/`, {
      bookId,
    });

    if (response.status === 200) {
      alert("Book borrowed successfully!");
      return response.data;
    }
    return null;
  } catch (error) {
    console.error("Error borrowing book:", error);
  }
};
