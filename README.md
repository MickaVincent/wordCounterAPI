# WordCounterAPI
Just a small JavaSpring API to count how many times a word has been pronounced 

* **GET:** `/initialize`

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 0 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **GET:** `/getAll`

* **Data Params**
  
  No data needs to be provided

* **Success Response:**

    **Content:** 
      `{ id : digital, counter: 750 }`
      `{ id : someWord, counter: 250 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **GET:** `/counter`

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 0 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **POST:** `/increment`

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ id : your_keyword, counter: 1 }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **DELETE:** `/delete`

* **Data Params**

  keyword = your_keyword

* **Success Response:**

    **Content:** `{ }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />

* **DELETE:** `/deleteAll`

* **Data Params**

  No data needs to be provided

* **Success Response:**

    **Content:** `[ ]`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />
