import { useState } from "react"

export const Hook_form1 = () => {
    const [id, setId] = useState(100001);
    const [name, setName] = useState('ram kumar');

    return (
        <div>
            <h1>User Form</h1>
            <div className="form-group">
                <label>Enter Id </label>
                <input 
                value={id}
                className="form-control" onChange={() => setId(id)}></input>
            </div>

            <div className="form-group">
                <label>Enter Name </label>
                <input className="form-control" onChange={() => setName(name)}
                value={name}
                ></input>
            </div>
            <div className="border w-50 mt-5 bg-dark text-light p-5">
                <div>
                    id is {id}
                </div>
                
                <div>
                    name is {name}
                </div>

            </div>
        </div>
    )
}