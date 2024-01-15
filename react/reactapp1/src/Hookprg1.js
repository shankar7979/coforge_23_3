import { useState } from "react"
export const Hook1=()=>{
     const [counter,Increment]=useState(0);

     return(
        <div className="container bg-info m-5 p-5 border">
           Count is {counter}
           <div>
            <button type="button" onClick={()=>Increment(counter+1)} >Counter Increment</button>
           </div>
           
           <div>
            <button type="button" onClick={()=>Increment(counter-1)} >Counter Decrement</button>
           </div>

        </div>
     )
}