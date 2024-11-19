const axios = require('axios');

async function makeDeleteRequest(userNum) {

    let res = await axios.delete("http://localhost:3000/users/"+userNum+"/");
    console.log(res.status);
}

makeDeleteRequest(2);
