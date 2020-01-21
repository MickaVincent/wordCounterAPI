# WordCounterAPI
Just a small JavaSpring API to count how many times a word has been pronounced with a MongoDB database

* **GET:** `/initialize` Creates a new keyword

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 0 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **GET:** `/getAll` Retreives list of registered keywords 

* **Data Params**
  
  No data needs to be provided

* **Success Response:**

    **Content:** 
      <br />[<br/>
          { id : digital, counter: 750 }<br />
          { id : someWord, counter: 250 }<br />
     ]
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **GET:** `/counter` Retrieves the given keyword

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 0 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **POST:** `/increment`Increments keyword's counter and returns it

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 1 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **DELETE:** `/delete` Deletes given keyword

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **DELETE:** `/deleteAll` Deletes all the registered keyword

* **Data Params**

  No data needs to be provided

* **Success Response:**

    **Content:** `[ ]`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />
