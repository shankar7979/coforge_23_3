import { Router, Routes } from "react-router-dom"
import Clock from "./Clock"
import RegistrationForm from "./RegistrationForm"
import { Counter1 } from "./Counter1"
import { Hook_form1 } from "./hook_form1"
import Bus from "./Bus"

export const Dashboard=()=>{

    return(
        <Router>
            <Navbar></Navbar>
            <Routes>
                <Route path="/" element={<Clock></Clock>}></Route>
                <Route path="/registrationform" element={<RegistrationForm></RegistrationForm>}></Route>
                <Route path="/counter1" element={<Counter1></Counter1>}></Route>
                <Route path="/" element={<Hook_form1></Hook_form1>}></Route>
                <Route path="/" element={<Bus></Bus>}></Route>
            </Routes>
        </Router>
    )
}