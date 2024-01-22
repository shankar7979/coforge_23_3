import {BrowserRouter as Router, NavLink, Route, Routes} from 'react-router-dom'
import {Navigate} from 'react-router-dom';
import UserForm from "./UserForm";
import UserData from "./UserData";

const App = () => {
    return (
        <div>
            <nav className="nav navbar-light bg-light text-white navbar-expand-sm w-50" style={{'marginLeft':'350px'}}>
                <NavLink to='/userform' style={{marginLeft: '100px'}}>
                    User Form
                </NavLink>
                
                <NavLink to='/userdata' style={{marginLeft: '100px'}}>
                    
                </NavLink>

            </nav>

            <Routes>
                <Route path="/" element={<UserForm/>}/>
                <Route path="/userform" element={<UserForm/>}/>
                <Route path="/userdata" element={<UserData/>}/>
            </Routes>
        </div>
    )
}
export default App;
