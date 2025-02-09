import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { createRoot } from "react-dom/client";
import { SideNavbar } from "./components/SideNavbar";
import { Home } from "./components/Home";
import { Login } from "./components/Login";
import { UserContextProvider } from "./contexts/UserContext";
import "bootstrap/dist/css/bootstrap.min.css";
import "./styles.css";

const App: React.FC = () => {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Library Management system</h1>
      </header>
      <Router>
        <UserContextProvider>
          <SideNavbar />
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/login" element={<Login />} />
          </Routes>
        </UserContextProvider>
      </Router>
    </div>
  );
};

const root = createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
