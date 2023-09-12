// My OpenWeatherMap API key
const apiKey = '18eb42d2d11bc1d773766169d56db285';


async function fetchWeatherData() {
  try {
    const response = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=${apiKey}&units=metric`
    );

    if (!response.ok) {
      throw new Error('Weather data not found');
    }

    const data = await response.json();


    const cityName = data.name;
    const temperature = data.main.temp;
    const weatherDescription = data.weather[0].description;



    const weatherDataContainer = document.querySelector('.weather-data');
    weatherDataContainer.innerHTML = `
      <h2>${cityName}</h2>
      <p>Temperature: ${temperature}°C</p>
      <p>Weather: ${weatherDescription}</p>
    `;
  } catch (error) {
    console.error(error);

    const weatherDataContainer = document.querySelector('.weather-data');
    weatherDataContainer.innerHTML = '<p>Weather data not available</p>';
  }
}

window.addEventListener('load', fetchWeatherData);
