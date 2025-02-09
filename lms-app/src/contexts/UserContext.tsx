import { Credentials } from "components/types";
import React, { createContext, useContext, useState } from "react";

export const UserContext = createContext(undefined);

export const UserContextProvider = ({ children }) => {
  const [credentials, setCredentials] = useState<Credentials>();

  const getCredentials = () => {
    return credentials;
  };
  const value = {
    getCredentials,
    setCredentials,
  };
  return <UserContext.Provider value={value}>{children}</UserContext.Provider>;
};

export const useUserContext = () => {
  const context = useContext(UserContext);
  if (!context) {
    throw new Error("Use not logged in.");
  }
  return context;
};
