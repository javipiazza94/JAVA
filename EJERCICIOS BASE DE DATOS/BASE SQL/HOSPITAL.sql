CREATE TABLE HOSPITALES (id_hospital number,
            nombre varchar2(25) not null,
            telefono varchar2(9),
            constraint pk_hospitales primary key (id_hospital));


CREATE TABLE PACIENTES (dni varchar2(9),
                        hospital number,
                        vacuna date,
                        constraint pk_pacientes primary key (dni),
                        constraint fk_hospitales foreign key (hospital) references hospitales (id_hospital));
                        
ALTER TABLE HOSPITALES MODIFY (telefono varchar (9));
ALTER TABLE HOSPITALES ADD constraint ct_tlf unique (telefono);
ALTER TABLE PACIENTES ADD constraint ct_dni check (LENGTH (dni));                        
                        