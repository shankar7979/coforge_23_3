import { Component } from "react";

export default class Clock extends Component{
    constructor(props){
        super(props);
        this.state={
            time:new Date().toLocaleTimeString()
        }
    }
    render(){
        return(
            <>
             Time is {this.state.time}
            </>
        )
    }
}