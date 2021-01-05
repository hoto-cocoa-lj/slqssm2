package slq.mapper;

import slq.pojo.Student;

public interface StudentMapper {
    public Student getOne(int id);
    public void insert1(Student s);
    public void del(int id);
}
