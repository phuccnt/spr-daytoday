-- Creating the `todolist` table
CREATE TABLE IF NOT EXISTS todolist (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    completed_date TIMESTAMP,
    todo_status VARCHAR(20),
    priority VARCHAR(20),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
-- Creating the `todo` table
CREATE TABLE IF NOT EXISTS todo (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    completed_date TIMESTAMP,
    todo_status VARCHAR(20),
    priority VARCHAR(20),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    todolist_id BIGINT,
    CONSTRAINT fk_todolist
    FOREIGN KEY (todolist_id)
    REFERENCES todolist (id)
    );
CREATE INDEX idx_todolist_todo ON todo(todolist_id);

-- Inserting additional mock data into the `todolist` table
INSERT INTO todolist (name, completed_date, todo_status, priority)
VALUES ('List 4', NULL, 'PENDING', 'HIGH'),
       ('List 5', '2022-03-20 09:45:00', 'COMPLETED', 'MEDIUM'),
       ('List 6', '2022-04-10 16:20:00', 'COMPLETED', 'LOW'),
       ('List 1', '2022-01-01 10:00:00', 'COMPLETED', 'HIGH'),
       ('List 2', NULL, 'PENDING', 'MEDIUM'),
       ('List 3', NULL, 'NOT_COMPLETED', 'LOW');

-- Inserting mock data into the `todo` table
INSERT INTO todo (name, completed_date, todo_status, priority, todolist_id)
VALUES ('Task 1', '2022-01-01 10:00:00', 'COMPLETED', 'HIGH', 1),
       ('Task 2', NULL, 'PENDING', 'MEDIUM', 1),
       ('Task 3', '2022-02-15 14:30:00', 'COMPLETED', 'LOW', 1),
       ('Task 4', NULL, 'PENDING', 'HIGH', 2),
       ('Task 5', '2022-03-20 09:45:00', 'COMPLETED', 'MEDIUM', 2),
       ('Task 6', '2022-04-10 16:20:00', 'NOT_COMPLETED', 'LOW', 2),
       ('Task 7', NULL, 'PENDING', 'HIGH', 3),
       ('Task 8', '2022-03-20 09:45:00', 'COMPLETED', 'MEDIUM', 3),
       ('Task 9', '2022-04-10 16:20:00', 'NOT_COMPLETED', 'LOW', 4);


