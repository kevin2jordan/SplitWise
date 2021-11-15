# Low Level System Design - Splitwise

### Problem Statement
* We have to desing and implement Splitwise

### Business(Functional) requirment
* User: Each user should have a userId, name, email, mobile number.
* Expense: Could either be EQUAL, EXACT or PERCENT
* Users can add any amount, select any type of expense and split with any of the available users.
* The percent and amount provided could have decimals upto two decimal places.
* In case of percent, you need to verify if the total sum of percentage shares is 100 or not.
* In case of exact, you need to verify if the total sum of shares is equal to the total amount or not.
* The application should have a capability to show expenses for a single user as well as balances for everyone.
* When asked to show balances, the application should show balances of a user with all the users where there is a non-zero balance.
* The amount should be rounded off to two decimal places. Say if User1 paid 100 and amount is split equally among 3 people. Assign 33.34 to first person and 33.33 to others.

### Sample Input
SHOW

SHOW u1

EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL

SHOW u4

SHOW u1

EXPENSE u1 1250 2 u2 u3 EXACT 370 880

SHOW

EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20

SHOW u1

SHOW

### Sample Output
No balances

No balances

User4 owes User1: 250

User2 owes User1: 250

User3 owes User1: 250

User4 owes User1: 250

User2 owes User1: 620

User3 owes User1: 1130

User4 owes User1: 250

User1 owes User4: 230

User2 owes User1: 620

User3 owes User1: 1130

User1 owes User4: 230

User2 owes User1: 620

User2 owes User4: 240

User3 owes User1: 1130

User3 owes User4: 240

### Expectation from this round
* Demonstrable code is first expectation. To do this, you can choose any interface you are comfortable with - CLI, WebApp, MobileApp, APIs or even simply run the code via Tests or a main method.
* Code should be extensible.
* Clean professional level code.
* Functional Completeness including good modelling.
* User Identification but not authentication.
* Backend Database is optional. However modelling should be complete.
