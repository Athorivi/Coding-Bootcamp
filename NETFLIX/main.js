$(document).ready(function () {
    let settings = {
        "async": true,
        "crossDomain": true,
        "url": "https://api.themoviedb.org/3/search/movie?include_adult=false&page=1&query=mad&language=en-US&api_key=5f10c82edcd3506c34eec2e5a9d3db98",
        "method": "GET",
        "headers": {},
        "data": "{}"
    }


   

    $.ajax(settings).done(function (response) {
        console.log(response);
        for (let movie of response.results) {
            $("#movies").append(
                `<div class="col-12 col-sm-6 col-lg-4 mb-4">
                <div class="card">
                    <img class="card-img-top" src="https://image.tmdb.org/t/p/w500${movie.backdrop_path}" alt="${movie.title} poster">
                    <div class="card-body">
                        <h4 class="card-title ">${movie.title}</h4>
                        <h5 class="card-subtitle ">${movie.release_date.split("-")[0]}</h5>
                        <p class="card-text">${movie.overview}</p>
                        <a href="#" class="btn btn-primary btn-block">Watch now</a>
                    </div>
                </div>
            </div>`
            );
        }






    });
});