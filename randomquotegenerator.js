// Function to fetch a random quote from the API
async function fetchRandomQuote() {
    try {
      const response = await fetch('https://type.fit/api/quotes');
      if (!response.ok) {
        throw new Error('Failed to fetch data');
      }
  
      const data = await response.json();
  
      // Get a random quote from the API response
      const randomIndex = Math.floor(Math.random() * data.length);
      const randomQuote = data[randomIndex];
  
      // Update the HTML with the random quote
      const quoteContainer = document.querySelector('.quote');
      quoteContainer.innerHTML = `<p>"${randomQuote.text}"</p><p>- ${randomQuote.author || 'Unknown'}</p>`;
    } catch (error) {
      console.error(error);
      // Display an error message if data couldn't be fetched
      const quoteContainer = document.querySelector('.quote');
      quoteContainer.innerHTML = '<p>Failed to fetch a quote</p>';
    }
  }
  
  // Function to handle the "New Quote" button click
  function handleNewQuoteClick() {
    fetchRandomQuote();
  }
  
  // Attach a click event listener to the "New Quote" button
  const newQuoteButton = document.getElementById('new-quote-btn');
  newQuoteButton.addEventListener('click', handleNewQuoteClick);
  
  // Fetch a random quote when the page loads
  window.addEventListener('load', fetchRandomQuote);
  