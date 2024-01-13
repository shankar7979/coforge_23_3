import { Component } from "react";

class Author extends Component {

    constructor(props) {
        super(props);
        this.state = {
            'authod_id': 78878787,
            'authod_name': 'suman kumar',
            'authod_location': 'kolkotta',
        }
    }
    render() {
        return (
            <div>
                <h2>Author Page</h2>
                <table className="table table-striped">
                    <tr>
                        <th>Id</th>
                        <td>{this.author.id}</td>
                    </tr>

                    <tr>
                        <th>Name</th>
                        <td>{this.author.name}</td>
                    </tr>

                    <tr>
                        <th>Name</th>
                        <td>{this.author.location}</td>
                    </tr>
                </table>

            </div>
        )
    }

}