// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-3.5.1.min
//= require popper.min
//= require bootstrap
//= require_self

// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-3.3.1.min
//= require bootstrap
//= require popper.min
//= require_self

// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-3.3.1.min
//= require bootstrap
//= require popper.min
//= require_self

/*
function createPlaneAndUpdate() {
    setTimeout(doCallAndUpdate, 1000);
}

function doCallAndUpdate() {
    const http = new XMLHttpRequest();
    const url = "http://localhost:8080/plane.json"
    http.open("GET", url);

    http.send();
    http.onreadystatechange = (e) => {
        console.log(http.response)
        const genderSelector = document.querySelector('#plane')
        const length = genderSelector.options.length
        const planes = JSON.parse(http.response)
        var choice = -1
        if (length > 0) {
            choice = genderSelector.selectedIndex
            for (i = length - 1; i >= 0; i--) {
                genderSelector.options.remove(i)
            }
        }

        planes.forEach(function (value) {
            var opt = document.createElement('option');
            opt.value = value.id;
            opt.innerHTML = value.name;
            genderSelector.appendChild(opt);
        })

        if (choice !== -1) {
            genderSelector.selectedIndex = choice
        }
    }
}

*/

