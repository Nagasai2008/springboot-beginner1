function getRandomUser() {
    fetch('https://randomuser.me/api/')
        .then(response => response.json())
        .then(data => {
            const user = data.results[0];

            document.getElementById("user-name").textContent =
                `${user.name.first} ${user.name.last}`;

            document.getElementById("user-gender").textContent =
                user.gender;

            document.getElementById("user-image").src =
                user.picture.large;
        })
        .catch(error => {
            console.error("Error fetching user:", error);
        });
}