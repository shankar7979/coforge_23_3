import { useState } from "react"

export const Hook_form1=()=>{
    const [id,setId]=useState(100001);
    const [name,setName]=useState('ram kumar');

    return(
        <div>
            <h1>User Form</h1>
            <div className="form-group">
                <label>Enter Id </label>
                <input className="form-control" onChange={()=>setId(id)}></input>
            </div>
            
            <div className="form-group">
                <label>Enter Id </label>
                <input className="form-control" onChange={()=>setName(id)}></input>
            </div>
            <div className="">

            </div>
        </div>
    )
}