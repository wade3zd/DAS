CREATE TABLE `overall_test` (
   `DATE` datetime NOT NULL,
  `DAU` int(20) NOT NULL,
  `PV` int(20) NOT NULL,
  `NEWUSER` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into overall_test values('2015-09-09',1234,12345,123);
insert into overall_test values('2015-09-08',1212,12323,101);
insert into overall_test values('2015-09-07',1245,12546,143);
insert into overall_test values('2015-09-06',1734,12679,167);
insert into overall_test values('2015-09-05',1834,17356,134);
insert into overall_test values('2015-09-04',1335,13546,126);
insert into overall_test values('2015-09-03',1534,18577,169);
insert into overall_test values('2015-09-02',1218,18533,125);
insert into overall_test values('2015-09-01',1457,17567,157);