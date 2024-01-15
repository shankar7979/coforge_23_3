import Hello, { Greeting, Test1,Test2 } from './Example';
import Leader from './Leader';
import MyCounter from './MyCounter';
import { Voter } from './data/Voter';
export  default function Welcome(){
    return(
        <div>
            {/* <Hello></Hello>
            <Greeting></Greeting>
            <Test1></Test1>
            <Test2></Test2> */}
            {/* <Leader voter={Voter}></Leader> */}
            <MyCounter></MyCounter>
        </div>
    )
}
