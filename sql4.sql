use jsd2306;
delete
from jsdtn2306.tb_student;
delete
from jsdtn2306.tb_subject;
delete
from jsdtn2306.tb_student_subject;

insert into tb_student
values (1, 'Jack', 'male', 0, 'p1', 10000, '1990-09-12', '111', 'j@t.com', 2, now(), now(), null),
       (2, 'Mike', 'male', 0, 'p2', 10000, '1990-09-12', '122', 'm@t.com', 2, now(), now(), null),
       (3, 'Tony', 'male', 0, 'p2', 10000, '1990-09-12', '133', 't@t.com', 2, now(), now(), null);



insert into tb_subject
values (1, 'Java', null),
       (2, 'MySQL', null);



insert into tb_student_subject
values (1, 1),
       (1, 2),
       (2, 1),
       (2, 2);



select stu.name student_name, sub.name subject_name
from tb_student stu
         left join tb_student_subject ss on stu.id = ss.student_id
         join tb_subject sub on ss.subject_id = sub.id


