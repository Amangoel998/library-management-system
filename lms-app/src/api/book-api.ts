import axios from "axios";

const API_BASE_URL = "http://localhost:8080/api"; // Replace with your backend URL

export const getBooks = async () => {
  const response = await axios.get(`${API_BASE_URL}/books`);
  return (
    response.data ?? [
      { id: 1, title: "Title 1", author: "Author 1" },
      { id: 2, title: "Title 2", author: "Author 2" },
      { id: 3, title: "Title 3", author: "Author 3" },
      { id: 4, title: "Title 4", author: "Author 4" },
      { id: 5, title: "Title 5", author: "Author 5" },
      { id: 6, title: "Title 6", author: "Author 6" },
      { id: 7, title: "Title 7", author: "Author 7" },
      { id: 8, title: "Title 8", author: "Author 8" },
      { id: 9, title: "Title 9", author: "Author 9" },
      { id: 10, title: "Title10", author: "Author10" },
    ]
  );
};
