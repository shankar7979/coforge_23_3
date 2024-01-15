import { Component } from "react";

export default class Bus extends Component{
    constructor(props){
        super(props);
        this.state={
            'regno':178988098,
            'name':'dtc',
            'state':'delhi'
        }
    }
    render(){
        return(
            <>
            <div className="border border-primary w-50 p-5 m-5">
              <div>Reg no {this.state.regno}</div>
              <div>Name {this.state.name}</div>
              <div>State {this.state.state}</div>
              <div>
                <h2> With props </h2>
                 <div>Fare is {this.props.fare}</div> 
                 <div>Route is {this.props.route}</div> 
              </div>
              </div>
            </>
        )
    }
 componentDidMount(){
    console.log('componentDidMount called ')
 }
 componentWillMount(){
    console.log('componentWillMount called ')
}
shouldComponentUpdate(){
    console.log('should component update  ')
    }

}
Bus.defaultProps={
    'fare':100,
    'route':'delhi to faridabad'
}