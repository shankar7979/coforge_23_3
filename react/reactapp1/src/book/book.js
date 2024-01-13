import { Component } from "react";
export class Book extends Component {

    constructor(props) {
        super(props);
        this.state = {
            'isbn': 1900909,
            'bname': 'react for beginner',
            'cost': 1200
        };
    }
    render() {
        return (
            <div>
               <div className="bg-info text-primary p-5 m-5">
                 <h1>Book Component</h1>
                  <table className="table table-striped">
                    <tr>
                      <th>isbn</th>
                      <td>{this.state.isbn}</td>  
                    </tr>
                    
                    <tr>
                      <th>isbn</th>
                      <td>{this.state.bname}</td>  
                    </tr>
                    <tr>
                      <th>isbn</th>
                      <td>{this.state.cost}</td>  
                    </tr>

                  </table>
                 </div> 
            </div>
        )
    }


}

