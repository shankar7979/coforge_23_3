import { useParams } from "react-router-dom";

const UserData=(props)=>{
    let { name } = useParams();

    return(
        <div>
            <h1>User Data </h1>
            Name is `/user`{}.
        </div>
    )
};
export default UserData;