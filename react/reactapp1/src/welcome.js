import Bus from './Bus';
import { Clock_hook } from './Clock_hook';
import Hello, { Greeting, Test1,Test2 } from './Example';
import { Hook1 } from './Hookprg1';
import Leader from './Leader';
import MyCounter from './MyCounter';
import RegistrationForm from './RegistrationForm';
import { Voter } from './data/Voter';
export  default function Welcome(){
    return(
        <div>
            {/* <Hello></Hello>
            <Greeting></Greeting>
            <Test1></Test1>
            <Test2></Test2> */}
             {/* <Leader voter={Voter}></Leader>  */}
            {/* <MyCounter></MyCounter> */}
            {/* <Bus fare='70' route='noida to delhi'></Bus>
            <Bus fare={data.fare} route={data.route}></Bus> */}
            {/* <Bus></Bus> */}
            {/* <RegistrationForm></RegistrationForm> */}
            <Hook1></Hook1>
            <Clock_hook></Clock_hook>
        </div>
    )
}
const data={
     "fare":40,
     "route":'delhi to gurgaon'
}

