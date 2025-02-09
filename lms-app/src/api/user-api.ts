import axios from "axios";

const API_BASE_URL = "http://localhost:8080";

export const registerUser = async (username: string, password: string) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/api/users/register`, {
      username,
      password,
    });
    return response.data;
  } catch (e) {
    console.error(e);
  }
};

export const loginUser = async (username: string, password: string) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/api/users/`, {
      auth: { username, password },
    });
    return response.data;
  } catch (e) {
    console.error(e);
  }
};
