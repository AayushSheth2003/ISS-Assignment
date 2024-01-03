document.addEventListener('DOMContentLoaded', function () {
  const form = document.getElementById('myForm');
  const responseContainer = document.getElementById('response');

  form.addEventListener('submit', function (e) {
    e.preventDefault();

    const formData = new FormData(form);
    const formDataObject = {};
    formData.forEach((value, key) => {
      formDataObject[key] = value;
    });

    // For demonstration purposes, log the form data to the console
    console.log(formDataObject);

    // Display a response message
    responseContainer.innerText = 'Form submitted successfully!';
  });
});
