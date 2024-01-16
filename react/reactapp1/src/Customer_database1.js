import { Component } from "react";

export class Customer extends Component{
    constructor(props){
        super(props);
        this.state={
            data1:[]
        }
    }
    componentDidMount(){
        const url="http://localhost:8080/customer/all"
        fetch(url)
           .then(result=>result.json())
           .then(result=>{
            this.setState({
                data1:result
            })
           })
    }
    render(){
        return(
            <div>
                <h2>Customer Data</h2>
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Salary</th>
                    </tr>{
                    this.state.data1.map(customer=>
                        <tr>
                          <td>{customer.customerId}</td>
                          <td>{customer.customerName}</td>
                          <td>{customer.customerSalary}</td>
                        </tr>
                    )
                }
                </table>
            </div>
        )
    }

}