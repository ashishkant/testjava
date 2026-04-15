#!/bin/bash

# Install SQLite3 if not present
sudo apt update
sudo apt install -y sqlite3

# Create the database and table
sqlite3 src/main/resources/school.db <<EOF
CREATE TABLE student (
    student_roll_number INTEGER PRIMARY KEY AUTOINCREMENT,
    student_name TEXT,
    student_address TEXT,
    student_email TEXT
);

INSERT INTO student (student_name, student_address, student_email) VALUES ('John Doe', '123 Main St', 'john@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Jane Smith', '456 Oak Ave', 'jane@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Bob Johnson', '789 Pine Rd', 'bob@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Alice Brown', '321 Elm St', 'alice@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Charlie Wilson', '654 Maple Dr', 'charlie@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Diana Davis', '987 Cedar Ln', 'diana@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Edward Miller', '147 Birch Blvd', 'edward@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Fiona Garcia', '258 Spruce Ct', 'fiona@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('George Rodriguez', '369 Willow Way', 'george@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Helen Martinez', '741 Poplar Pl', 'helen@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Ian Anderson', '852 Ash St', 'ian@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Julia Thomas', '963 Hickory Ave', 'julia@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Kevin Jackson', '159 Dogwood Dr', 'kevin@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Laura White', '260 Magnolia Ln', 'laura@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Michael Harris', '371 Sycamore Blvd', 'michael@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Nancy Clark', '482 Chestnut Ct', 'nancy@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Oliver Lewis', '593 Redwood Way', 'oliver@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Paula Walker', '604 Palm Pl', 'paula@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Quinn Hall', '715 Cypress St', 'quinn@example.com');
INSERT INTO student (student_name, student_address, student_email) VALUES ('Rachel Young', '826 Fir Ave', 'rachel@example.com');
EOF

echo "Database created successfully at src/main/resources/school.db"