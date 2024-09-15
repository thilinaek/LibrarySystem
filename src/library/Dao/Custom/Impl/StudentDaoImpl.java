/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import library.Dao.CrudUtil;
import library.Dao.Custom.StudentDao;
import library.entity.StudentEntity;

/**
 *
 * @author Nawanjana
 */
public class StudentDaoImpl implements StudentDao{
    @Override
    public boolean create(StudentEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO student VALUES(?,?,?,?,?)",  t.getStudentId(),t.getStudentName(),t.getEmail(),t.getContactNo(),t.getGender());
    }

    @Override
    public boolean update(StudentEntity t) throws Exception {
       return CrudUtil.executeUpdate("UPDATE student SET StudentName=?,Email=?,ContactNo=?,Gender=? WHERE StudentId = ?",  t.getStudentName(),t.getEmail(),t.getContactNo(),t.getGender(),t.getStudentId());
    }

    @Override
    public boolean delete(String studentId) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM student WHERE StudentId = ?", studentId);
}

    @Override
    public StudentEntity get(String studentId) throws Exception {
       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM student WHERE StudentId = ?", studentId);
        if(rst.next()){
          
            StudentEntity entity = new StudentEntity(rst.getString("StudentId"), 
                    rst.getString("StudentName"),rst.getString("Email"),rst.getInt("ContactNo"),rst.getString("Gender"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<StudentEntity> getAll() throws Exception {
      ArrayList<StudentEntity> studentEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM student");
        while (rst.next()) {            
            StudentEntity entity; 
            entity = new StudentEntity(
                    rst.getString("StudentId"), 
                    rst.getString("StudentName"),
                    rst.getString("Email"),
                    rst.getInt("ContactNo"),
                    rst.getString("Gender"));
            studentEntities.add(entity);
        }
        return studentEntities;
    }
    
}

