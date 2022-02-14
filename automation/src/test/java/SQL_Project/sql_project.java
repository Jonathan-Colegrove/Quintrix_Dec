//package SQL_Project;
//
//import java.sql.*
//DriverManager.getConnection();
//private final String userName = "";
//private final String password = "";
//
//public class sql_project {
//	
//	1. Get 10 cities in descending alphabetical order.
//
//	SELECT * FROM city
//	ORDER BY city DESC
//	LIMIT 10;
//
//
//	2. Get all films with "airplane" in the title.
//
//	SELECT * FROM film
//	WHERE title LIKE '%airplane%';
//
//
//	3. Get the highest payment amount.
//
//	SELECT MAX(amount) FROM payment;
//
//
//	4. Get the number of records in the customer table for store id #1.
//
//	SELECT COUNT(customer_id) FROM customer
//	WHERE store_id = 1;
//
//
//	5. Get all payment records for customer with email address "NANCY.THOMAS@sakilacustomer.org"
//
//	SELECT *
//	FROM payment p LEFT JOIN customer c
//	ON c.customer_id = p.customer_id
//	WHERE email = 'NANCY.THOMAS@sakilacustomer.org'; 
//
//
//	6. Use a View to get the film info for actor Bob Fawcett.
//
//	SELECT film_info
//	FROM actor_info
//	WHERE first_name = 'Bob'
//	AND last_name = 'Fawcett';
//
//
//
//	7. Use a Stored Procedure to get the 4 inventory ids for the film "Alien Center" at Store #2. 
//	don't create a view, use the 1 that's already there.
//
//	SELECT inventory_id
//	FROM film_in_stock
//	WHERE film = 'Alien Center'
//	AND store = 2;
//
//
//	8. Insert a new store. USE A TRANSACTION. (Pay attention to constraints and the order that you are inserting data.) 
//	involves inserts to multiple tables
//
//	START TRANSACTION
//	INSERT INTO store(
//					store_id,
//					manager_staff_id,
//					address_id,
//					last_update)
//	VALUES(3, 1, 3, '2019-01-16 04:57:12')
//	COMMIT;
//
//
//	9. Update the timestamp to the current date/time for the new store you entered in the previous question.
//
//	UPDATE store
//	SET last_update = '2021-12-16 04:57:12'
//	WHERE store_id = 3;
//
//
//	10. Delete the new store.
//
//	START TRANSACTION
//	DELETE FROM store
//	WHERE store_id = 3
//	ROLLBACK TRANSACTION;
//}