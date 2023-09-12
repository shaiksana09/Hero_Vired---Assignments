// Function to fetch country data from the API
async function fetchCountryData() {
    try {
      const response = await fetch('https://restcountries.com/v2/all');
      if (!response.ok) {
        throw new Error('Failed to fetch data');
      }
  
      const data = await response.json();
  
      // Get data for a random country from the API response
      const randomIndex = Math.floor(Math.random() * data.length);
      const randomCountry = data[randomIndex];
  
      // Update the HTML with the country information
      const countryInfoContainer = document.querySelector('.country-info');
      countryInfoContainer.innerHTML = `
        <h2>${randomCountry.name}</h2>
        <p>Capital: ${randomCountry.capital || 'N/A'}</p>
        <p>Population: ${randomCountry.population || 'N/A'}</p>
        <p>Region: ${randomCountry.region || 'N/A'}</p>
        <p>Subregion: ${randomCountry.subregion || 'N/A'}</p>
        <p>Country Code: ${randomCountry.alpha2Code || 'N/A'}</p>
      `;
    } catch (error) {
      console.error(error);
      // Display an error message if data couldn't be fetched
      const countryInfoContainer = document.querySelector('.country-info');
      countryInfoContainer.innerHTML = '<p>Failed to fetch country data</p>';
    }
  }
  
  // Function to handle the "Get Country Data" button click
  function handleGetCountryDataClick() {
    fetchCountryData();
  }
  
  // Attach a click event listener to the "Get Country Data" button
  const getCountryDataButton = document.getElementById('get-country-data-btn');
  getCountryDataButton.addEventListener('click', handleGetCountryDataClick);
  
  // Fetch country data when the page loads
  window.addEventListener('load', fetchCountryData);
  