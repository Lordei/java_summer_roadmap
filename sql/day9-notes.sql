CREATE TABLE notes (
                       id INTEGER PRIMARY KEY AUTOINCREMENT,
                       title TEXT NOT NULL,
                       content TEXT NOT NULL,
                       created_at TEXT NOT NULL
);

INSERT INTO notes (title, content, created_at)
VALUES ('Study Java', 'Practice SQLite today', datetime('now'));