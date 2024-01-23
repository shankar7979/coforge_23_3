import { useEffect, useState } from "react";
import CustomerService from "./services/CustomerService";
const SearchCustomer1 = () => {
    const [customer, getAllCustomer] = useState([]);

    useEffect(() => {
        new CustomerService().getCustomerById(1)
            .then(response => {
                getAllCustomer(response.data)
            })
            .catch(e => {
                console.log(e);
                console.log(e.response);
            })
    }, [])

    return (
        <div>
            <h1>all customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>salary</th>
                </tr>
                {
                    customer.map(cust =>
                        <tr>
                            <td>{cust.customerId}</td>
                            <td>{cust.customerName}</td>
                            <td>{cust.customerSalary}</td>
                        </tr>
                    )
                }
            </table>
        </div>
    )
}
export default SearchCustomer1;