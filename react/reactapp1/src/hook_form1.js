import { useEffect, useState } from "react"

export const Hook_form1 = () => {
    const [id, setId] = useState(0);
    const [name, setName] = useState('');

    useEffect = (() => {
        document.title='react hook form validation'
        console.log('use effect called ')
    })

   const nameValidate=(e)=>{
            if(e.target.value=='')
            alert('name is blank')
          else if(e.target.value.length<5)
            alert('name length must of minimum 5 chars ')
          else if(e.target.value.length>15)
            alert('name length must of maximum 15 chars ')
        else 
            setName(e.target.value)
    }

    return (
        <div>
            <div className="w-75 bg-info border p-5 m-5" style={{'border-radius':'20px'}}>
                <h1>User Form</h1>

                <div className="form-group">
                    <label>Enter Id </label>
                    <input
                        value={id}
                        className="form-control" onChange={(event) => 
                        {if(event.target.value=='')
                        alert('id is blank')
                    else 
                        setId(event.target.value)
                        }
                    }></input>
                </div>
                <div className="form-group">
                    <label>Enter Name </label>
                    <input className="form-control" onChange={nameValidate}
                        value={name}
                    ></input>
                </div>
            </div>
            <div className="w-75 bg-info border p-5 m-5" style={{'border-radius':'20px'}}>
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