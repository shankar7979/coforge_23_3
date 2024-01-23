import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import CustomerService from './services/CustomerService';


function SearchCustomer() {
    const [id, setId] = useState('');
    const [err_id, setErrorId] = useState('');
    const navigate = useNavigate();
    const [customer, setCustomer] = useState([]);
    const [customer_found, setCustomerFound] = useState(false);

    useEffect(() => {
       // console.log('...search customer called use effect \nid is '+id)
    })
    const findById = async () => {
    //const findById = () => {
        console.log('id is.. ' + id)
          await new CustomerService().getCustomerById(id)
        //new CustomerService().getCustomerById(id)
            .then(response => {
                console.log('response called ')

                // if (response.status === 200) {
                //     window.location.href = response.request.responseURL;
                //     console.log('200 status code ')
                // }
                
                console.log('findBy id called found')
                setCustomer(response.data)
                setCustomerFound(true)
                console.log(customer)
                console.log("id " + customer.customerId)
                console.log("name " + customer.customerName)
                console.log("salary " + customer.customerSalary)

            })
            .catch(e => {
                // console.log(e.response);
                console.log(e);
                console.log(e.response);
                //reject(e.response.data);
                //  handleErr
                // if (e.response && e.response.status === 401) {
                //     window.location.href = "logon";
                //   }
            })
    }
    return (
        <div className='container w-50'>
            <h1>Search Customer </h1>
            <div className="form-group" >
                <label>Enter Id</label>
                <input className="form-control" onChange={
                    (e) => {
                        if (e.target.value == '')
                            setErrorId('id is blank')
                        //   else if (e.target.value.length < 2 || e.target.value.length > 5)
                        //     setErrorId('id must of min 2 digit or max 5 digit')
                        else {
                            setErrorId('')
                            setId(e.target.value)
                        }
                    }
                }></input>
                <div className="text-info">{err_id}</div>
            </div>
            <div>
                <button type="submit" onClick={findById}>Submit</button>
            </div>
            <div>

                {
                    customer_found &&
                    <div>
                        <p>{customer[0].customerId}</p>
                        <p>{customer[0].customerName}</p>
                        <p>{customer[0].customerSalary}</p>
                    </div>
                }
            </div>
        </div>
    )
}
export default SearchCustomer;