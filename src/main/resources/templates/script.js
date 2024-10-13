// Add hover effect for the buttons
document.querySelectorAll('.demo-btn, .login-btn').forEach(button => {
    button.addEventListener('mouseover', () => {
        button.style.transform = 'scale(1.05)';
    });
    button.addEventListener('mouseout', () => {
        button.style.transform = 'scale(1)';
    });
});

// Smooth scrolling for demo button
document.querySelector('.demo-btn').addEventListener('click', (e) => {
    e.preventDefault(); // Prevent default anchor behavior
    document.getElementById('why-us').scrollIntoView({
        behavior: 'smooth' // Smooth scroll
    });
});
document.querySelector('a[href="#why-us"]').addEventListener('click', (e) => {
    e.preventDefault(); // Prevent default anchor behavior
    document.getElementById('why-us').scrollIntoView({
        behavior: 'smooth' // Smooth scroll
    });
});

const card = document.querySelector('.card');

card.addEventListener('mouseenter', () => {
    card.style.color = '#5a73d8'; // Change text color on hover
});

card.addEventListener('mouseleave', () => {
    card.style.color = '#ffffff'; // Reset text color when not hovered
});


document.querySelector('a[href="#top"]').addEventListener('click', function(e) {
    e.preventDefault(); // Prevent default anchor click behavior
    window.scrollTo({
        top: 0,
        behavior: 'smooth' // Smooth scrolling effect
    });
});
// Modal functionality
const loginBtn = document.querySelector('.login-btn');
const loginModal = document.getElementById('loginModal');
const closeButton = document.querySelector('.close-button');

// Show modal when login button is clicked
loginBtn.addEventListener('click', (event) => {
    event.preventDefault(); // Prevent default anchor behavior
    loginModal.style.display = 'block'; // Show modal
});

// Close modal when close button is clicked
closeButton.addEventListener('click', () => {
    loginModal.style.display = 'none'; // Hide modal
});

// Close modal when clicking outside of modal content
window.addEventListener('click', (event) => {
    if (event.target === loginModal) {
        loginModal.style.display = 'none'; // Hide modal
    }
});

// Handle form submission
document.getElementById('loginForm').addEventListener('submit', (event) => {
    event.preventDefault(); // Prevent default form submission
    // You can add your login logic here
    alert('Login functionality not implemented yet!'); // Placeholder alert
    loginModal.style.display = 'none'; // Close modal after submission
});