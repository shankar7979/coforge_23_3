import { Component } from "react";

export default class RegistrationForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 0,
            name: '',
            err_id: '',
            err_name: '',
        };
    }
    id_change = (e) => {
        if (e.target.value === '') {
            //alert('id is blank')
            this.setState({ 'err_id': 'id is blank' })
        }
    }

    name_change = (e) => {
        if (e.target.value == '') {
            //alert('name is blank')
            this.setState({ 'err_name': 'name is blank' })
        }
    }

    render() {
        return (
            <div>
                <div className="container bg-info p-5  w-50" style={{ 'border-radius': '20px', 'marginLeft': '330px', 'marginTop': '50px' }}>
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control"
                            onChange={this.id_change}
                            value={this.state.id}></input>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" value={this.state.name}
                            onChange={this.name_change}
                            onClick={this.name_change}
                        ></input>
                    </div>
                    <div>
                        <button type="submit">Login</button>
                        <button type="reset">Login</button>
                    </div>
                    <hr>
                    </hr>
                </div >

                <div class="container bg-warning p-5 w-50" style={{ 'border-radius': '20px', 'marginLeft': '330px', 'marginTop': '50px' }}>

                    <div>Id is {this.state.id}</div>
                    <div>Name is {this.state.name}</div>

                </div>

            </div>
        )
    }
}