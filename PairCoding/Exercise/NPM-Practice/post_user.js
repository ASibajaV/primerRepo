const axios = require('axios');
makeGetRequest = require('./get_users');

async function makePostRequest() {

    params = {
        id: 2,
        first_name: 'Song',
        last_name: 'Gonzalez',
        email: 'sgo@gmail.com'
      }

    let res = await axios.post("http://localhost:3000/users/", params);

    console.log(res.data);
}

makeGetRequest();

makePostRequest();

makeGetRequest();
