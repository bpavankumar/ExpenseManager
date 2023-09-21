-- Main Expense categories
INSERT INTO expense VALUES (1, 'Expenses made at any restaurant, cafe or any other eatery as such', null, 'Food & Beverage');
INSERT INTO expense VALUES (2, 'Expenses made on a monthly basis such as bills', null, 'Bills & Utilities');
INSERT INTO expense VALUES (3, 'Expenses made towards transportation, travel', null, 'Transportation');
INSERT INTO expense VALUES (4, 'Expenses made as part of any purchases, shopping', null, 'Shopping');
INSERT INTO expense VALUES (5, 'Expenses made at any Movies, Events, Functions', null, 'Entertainment');
INSERT INTO expense VALUES (6, 'Expenses made in order to maintain Family wellness, grooming & medical expenses', null, 'Health & Fitness');
INSERT INTO expense VALUES (7, 'Expenses made as part of any functions, marriages etc. as Gifts', null, 'Gifts & Donation');
INSERT INTO expense VALUES (8, 'Expenses made as part of any renovation, specific to house or family', null, 'Family');
INSERT INTO expense VALUES (9, 'Expenses made as part of Childrens Education or self-improvement', null, 'Education');
INSERT INTO expense VALUES (10, 'Expenses made as part of Investments - usually FDs & RDs', null, 'Investment');
INSERT INTO expense VALUES (11, 'Expenses made as part of LIC policy premiums for Self, Spouse & Kids', null, 'Insurances');
INSERT INTO expense VALUES (12, 'Expenses made which do not fit the above categories', null, 'Other Expenses');

UPDATE expense SET expense_category_id=null;

INSERT INTO expense VALUES (13, 'Expenses made at any restaurant as such', 1, 'Restaurant');
INSERT INTO expense VALUES (14, 'Expenses made at any cafe or any other eatery as such', 1, 'Cafe');

INSERT INTO expense VALUES (15, 'Expenses towards mobile postpaid bills', 2, 'Phone Bill');
INSERT INTO expense VALUES (16, 'Expenses towards Electricity bills', 2, 'Electricity Bill');
INSERT INTO expense VALUES (17, 'Expenses towards cooking gas cylinder bills', 2, 'Gas Bill');
INSERT INTO expense VALUES (18, 'Expenses towards Water bills', 2, 'Water Bill');
INSERT INTO expense VALUES (19, 'Expenses towards DTH cable bills', 2, 'Television Bill');
INSERT INTO expense VALUES (20, 'Expenses towards Internet bills', 2, 'Internet Bill');
INSERT INTO expense VALUES (21, 'Expenses towards Home loan EMI bills', 2, 'House EMI');
INSERT INTO expense VALUES (22, 'Expenses towards paying rentals', 2, 'Rentals');

UPDATE expense SET expense_category_name = 'Food & Beverage' WHERE expense_category_id=1;
UPDATE expense SET expense_category_name = 'Bills & Utilities' WHERE expense_category_id=2;

--Altered the approach to use a category name instead of an id.
ALTER TABLE expense DROP COLUMN expense_category_id;