import { useEffect, useState } from "react"

export const Hook_form1 = () => {
    const [id, setId] = useState(100001);
    const [name, setName] = useState('ram kumar');
    
    let state='delhi';

    useEffect=(()=>{
        state='UP'
        document.id=90001
        document.name='shyam kumar'

        console.log('use effect called ')
    })

    return (
        <div>
            <h1>User Form</h1>
             <p>State is {state}</p>
            <div className="form-group">
                <label>Enter Id </label>
                <input 
                value={id}
                className="form-control" onChange={(e) => setId(e.target.value)}></input>
            </div>

            <div className="form-group">
                <label>Enter Name </label>
                <input className="form-control" onChange={(e) => setName(e.target.value)}
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