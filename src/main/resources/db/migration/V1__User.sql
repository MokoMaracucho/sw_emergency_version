CREATE TYPE enum_gender AS ENUM ('FEMALE', 'MALE');
CREATE TYPE enum_privilege AS ENUM ('USER', 'ADMINISTRATEUR', 'SUPER_ADMINISTRATEUR');

CREATE TABLE tb_user (
    id_user UUID PRIMARY KEY,
    gender_user enum_gender NOT NULL,
    first_name_user VARCHAR(30) NOT NULL,
    last_name_user VARCHAR(30) NOT NULL,
    age_user INTEGER NOT NULL,
    email_user VARCHAR(50) NOT NULL,
    password_user VARCHAR(60) NOT NULL,
    occupation_user VARCHAR(50) NOT NULL,
    privilege_user enum_privilege NOT NULL
);