import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
import App from "./App";
import 'bootstrap/dist/css/bootstrap.min.css';
import CustomerComponentDashboard from './CustomerComponentDashboard';
import CustomerComponentDashboard_Hook from './CustomerComponentDashboard_Hook';
import SearchCustomer from './Customer_Hook/SearchCustomer';
import SearchCustomer1 from './Customer_Hook/SearchCustomer1';
import ShowAllCustomer from './Customer_Hook/ShowAllCustomer';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>

    {/* <App /> */}
    {/* <CustomerComponentDashboard></CustomerComponentDashboard> */}
    {/* <CustomerComponentDashboard_Hook></CustomerComponentDashboard_Hook> */}
    {/* <SearchCustomer></SearchCustomer> */}
    <SearchCustomer1></SearchCustomer1>
    {/* <ShowAllCustomer></ShowAllCustomer> */}
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
