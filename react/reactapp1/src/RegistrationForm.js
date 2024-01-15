import { Component } from "react";

export default class RegistrationForm extends Component{
    constructor(props){
        super(props);
        this.state={
            id:0,
            name:''
        };
    }
    render(){
        return(
            <div className="container bg-info p-5  w-50"  style={{'border-radius':'20px','marginLeft':'330px','marginTop':'50px'}}>
                    <div className="form-group">
                      <label>Enter Id</label>
                      <input className="form-control" value={this.state.id}></input>
                    </div>
                    
                    <div className="form-group">
                      <label>Enter Name</label>
                      <input className="form-control" value={this.state.name}></input>
                    </div>
                    <div>
                        <button type="submit">Login</button>
                        <button type="reset">Login</button>
                    </div>
            </div>
        )
    }
}