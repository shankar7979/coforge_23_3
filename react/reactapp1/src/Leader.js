import React, { Component } from "react";

export default  class Leader extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'id': 4343434,
            'name': 'pritam kumar',
            'age': 30
        }
        this.changeLeader=this.changeLeader.bind(this);
    }
    render() {
        return (
            <React.Fragment>
                <div className="container bg-warning text-dark border border-primary p-5 m-5" style={{'borderRadius':'20px'}}>
                        <h2>Leader data</h2>
                         <div>Id is {this.state.id}</div>
                         <div>Name is {this.state.name}</div>
                         <div>Age is {this.state.age}</div>
                </div>
                <div>
                    <button type="button"  onClick={this.changeLeader} >Change Leader data </button>
                </div>
            </React.Fragment>
        )
    }
    changeLeader(){
        this.setState({
            id:6776678768,
            name:'arvind kumar',
            age:60,
        })
    }
}