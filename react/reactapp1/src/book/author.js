import { Component } from "react";

export class Author extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'author_id': 78878787,
            'author_name': 'suman kumar',
            'author_location': 'kolkotta',
        }
    }
    render() {
        return (
            <div>
                <h2>Author Page</h2>
                <table className="table table-striped">
                    <tr>
                        <th>Id</th>
                        <td>{this.state.author_id}</td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td>{this.state.author_name}</td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td>{this.state.author_location}</td>
                    </tr>
                </table>
            </div>
        )
    }

}