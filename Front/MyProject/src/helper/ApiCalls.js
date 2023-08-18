const request = (options) => {
    const headers = new Headers({
        'Content-Type': "application/json"
    })
    const defaults = {headers: headers}
    options = Object.assign({}, defaults, options);

    return fetch(options.url, options)
    .then(response => 
        response.json().then(json =>{
            if(!response.ok){
                return Promise.reject(json);
            }
            return json
        } ));

}

export function fetchHomePets(count=5){
    let urlPath = 'http://localhost:8080/home?count=' + count;
    return request(
        {
            url: urlPath,
            method: 'GET',
            count: count
        }
    )
}

