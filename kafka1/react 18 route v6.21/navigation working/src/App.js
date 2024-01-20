import {BrowserRouter as Router, NavLink, Route, Routes} from 'react-router-dom'
import {Navigate} from 'react-router-dom';
import UserForm from "./UserForm";
import UserData from "./UserData";

const App = () => {
    return (
        <>
            <nav className="nav navbar-dark bg-light text-primary navbar-expand-sm">
                <NavLink to='/userform' style={{marginLeft: '100px'}}>
                    User Form
                </NavLink>
            </nav>
            <Routes>
                <Route path="/" element={<UserForm/>}/>
                <Route path="/userform/:name" element={<UserData/>}/>
            </Routes>
        </>
    )
}
export default App;