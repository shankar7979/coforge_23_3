import { useEffect, useState } from "react"

export const Hook_form1 = () => {
    const [id, setId] = useState(0);
    const [err_id, setErrorId] = useState('');
    const [name, setName] = useState('');
    const [err_name, setErrorName] = useState('');

    useEffect = (() => {
        document.title = 'react hook form validation'
        console.log('use effect called ')
    })


    return (
        <div>
            <div className="w-75 bg-info border p-5 m-5" style={{ 'border-radius': '20px' }}>
                <h1>User Form</h1>

                <div className="form-group">
                    <label>Enter Id </label>
                    <input
                        value={id}
                        className="form-control" onChange={(event) => {
                            if (event.target.value == '')
                                setErrorId('id is blank')
                            else
                                setId(event.target.value)
                        }
                        }></input>
                </div>
                <div className="danger">
                   {err_id}          
                </div>

                <div className="form-group">
                    <label>Enter Name </label>
                    <input className="form-control" onChange={(e) => {
                       if (e.target.value == '')
                            setErrorName('name is blank')
                        else if (e.target.value.length < 5)
                        setErrorName('name length must of minimum 5 chars ')
                        else if (e.target.value.length > 15)
                        setErrorName('name length must of maximum 15 chars ')
                        else
                            setName(e.target.value)
                    }
                    }
                        value={name}
                    ></input>
                </div>
                <div>
                    {err_name}
                </div>
            </div>
            <div className="w-75 bg-info border p-5 m-5" style={{ 'border-radius': '20px' }}>
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