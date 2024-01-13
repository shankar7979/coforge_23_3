import { Component } from "react";
import { Book } from "./book";
import { Author } from "./author";

export class MyBook extends Component{
    constructor(props){
       super(props);
    }
    render(){
        return(
            <div className="container">
            <Book></Book>
            <Author></Author>
            </div>
        )
    }
}