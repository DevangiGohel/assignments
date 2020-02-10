import React from 'react';
import logo from './logo.svg';
import './App.css';
import Login from './Login/login.js'
import { BrowserRouter as Router, Route,Link } from 'react-router-dom';
export default function demo() {
  return(

    <Router>
      <div>
        <ul>
          <li>
            <Link to="/login">Login</Link>
          </li>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/">Dashboard</Link>
          </li>
        </ul>

        <hr />
    <switch>
      <Route path="/login">
      <Login />
      </Route>
    </switch>
    </div>
    </Router>
  );
}

