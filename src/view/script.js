const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");

loginButton.addEventListener("click", (e) => {
    e.preventDefault();
    const username = loginForm.username.value;
    const password = loginForm.password.value;

    if (username === "användare" && password === "lösen") {
        window.location = "mainpage.html";
    } else {
        loginErrorMsg.style.opacity = 1;
    }
})

const patientOne = document.getElementById("patient-1");
const patientTwo = document.getElementById("patientTwo");
patientOne.addEventListener("click", displaypatientone);



patientTwo.addEventListener("click", displaypatienttwo);

function displaypatientone(){
    document.getElementById("name").innerHTML = "Patient ett";
    document.getElementById("room").innerHTML = "Rum 1";
    document.getElementById("condition").innerHTML = "lorem"
}

function displaypatienttwo(){
    document.getElementById("name").innerHTML = "Patient två";
    document.getElementById("room").innerHTML = "Rum 2";
    document.getElementById("condition").innerHTML = "lorem"
} 