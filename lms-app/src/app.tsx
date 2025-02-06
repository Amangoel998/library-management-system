import React from "react";
import { createRoot } from "react-dom/client";

const App: React.FC = () => {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Library Management system</h1>
      </header>
    </div>
  );
};

const root = createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
