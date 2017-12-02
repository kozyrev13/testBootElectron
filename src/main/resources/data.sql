INSERT INTO users(username,password,enabled) VALUES ('max','koz', true);

INSERT INTO users(username,password,enabled) VALUES ('aaa','bbb', true);

INSERT INTO user_roles (username, role) VALUES ('max', 'ROLE_USER');

INSERT INTO user_roles (username, role) VALUES ('max', 'ROLE_ADMIN');

INSERT INTO user_roles (username, role) VALUES ('aaa', 'ROLE_USER');