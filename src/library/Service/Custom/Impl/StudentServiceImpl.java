/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Service.Custom.Impl;

import java.util.ArrayList;
import library.Dao.Custom.StudentDao;
import library.Dao.DaoFactory;
import library.Dto.StudentDto;
import library.Service.Custom.StudentService;
import library.entity.StudentEntity;

/**
 *
 * @author Nawanjana
 */
public class StudentServiceImpl implements StudentService{
  private final StudentDao studentDao=(StudentDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);
    @Override
    public String save(StudentDto studentDto) throws Exception {
       StudentEntity entity = getStudentEntity(studentDto);
         
        return studentDao.create(entity) ? "Success" : "Fail";
 
    }
    @Override
    public String update(StudentDto studentDto) throws Exception {
        StudentEntity entity = getStudentEntity(studentDto);
         
        return studentDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String studentName) throws Exception {
       return studentDao.delete(studentName) ?  "Success" : "Fail";
    }

    @Override
    public StudentDto get(String studentName) throws Exception {
       StudentEntity entity = studentDao.get(studentName);
        if(entity != null){
            return getStudentDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<StudentDto> getAll() throws Exception {
       ArrayList<StudentEntity> studentEntitys = studentDao.getAll();
        if(studentEntitys != null && !studentEntitys.isEmpty()){
            ArrayList<StudentDto> studentDtos = new ArrayList<>();
            
            for (StudentEntity studentEntity: studentEntitys) {
                studentDtos.add(getStudentDto(studentEntity));
            }
            
            return studentDtos;
        }
        return null;
    }

    private StudentEntity getStudentEntity(StudentDto studentDto){
       return new StudentEntity(
               studentDto.getStudentId(),
               studentDto.getStudentName(),
               studentDto.getEmail(),
               studentDto.getContactNo(),
               studentDto.getGender());
}
    private StudentDto getStudentDto(StudentEntity entity){
       return new StudentDto(
               entity.getStudentId(),
               entity.getStudentName(),
               entity.getEmail(),
               entity.getContactNo(),
               entity.getGender());
               
                 
                }
    
}

