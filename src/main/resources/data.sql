INSERT INTO patient(id, pesel, first_name, last_name, patient_file, clinic, health_insurance, city, street, house_number, home_number) values
(1,920129,'Krzysztof','Wiśniewski','BRAK','HEMATOLOGIA','SLASKA','Katowice','Emerytalna',5,2),
(2,123456,'Marcin','Alojzy','BRAK','GINEKOLOGIA','SLASKA','Warszawa','Andersa',11,2),
(3,654321,'Kazimierz','Kowalski','BRAK','GASTROLOGIA','SLASKA','Lódź','Kwiatowa',53,3),
(4,234567,'Genowefa','Nowak','BRAK','PULMONOLOGIA','SLASKA','Wietnam','Malinowa',15,1),
(5,876543,'Andrzej','Piaseczny','BRAK','HEMATOLOGIA','SLASKA','Katowice','Brzozowa',44,2);

INSERT INTO doctor(id, first_name, last_name, clinic, morning_shift, monday, tuesday, wednesday, thursday, friday) values
(1,'Tomasz','Marek','GASTROLOGIA','TRUE','TRUE','TRUE','TRUE','FALSE','FALSE'),
(2,'Marcin','Czajka','GINEKOLOGIA','TRUE','TRUE','TRUE','TRUE','FALSE','FALSE'),
(3,'Kazik','Jakiśtam','PULMONOLOGIA','TRUE','TRUE','TRUE','TRUE','FALSE','FALSE'),
(4,'Marcin','Napierała','HEMATOLOGIA','TRUE','TRUE','TRUE','TRUE','FALSE','FALSE'),
(5,'Tomasz','Walaszek','HEMATOLOGIA','TRUE','TRUE','TRUE','TRUE','FALSE','FALSE');