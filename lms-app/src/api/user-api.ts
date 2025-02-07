import axios from "axios";

const API_BASE_URL = "http://localhost:8080"; // Replace with your backend URL

export const registerUser = async (username: string, password: string) => {
  const response = await axios.post(`${API_BASE_URL}/auth/register`, {
    username,
    password,
  });
  return response.data;
};

export const loginUser = async (username: string, password: string) => {
  const response = await axios.get(`${API_BASE_URL}/books`, {
    auth: { username, password },
  });
  return response.data;
};
