/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Controller;

import java.util.ArrayList;
import library.Dto.StudentDto;
import library.Service.Custom.StudentService;
import library.Service.ServiceFactory;

/**
 *
 * @author Nawanjana
 */
public class StudentController {
   private final  StudentService studentService =(StudentService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.STUDENT);
    public String save(StudentDto studentDto) throws Exception{
      return studentService.save(studentDto);
    }  
     public String update(StudentDto studentDto) throws Exception{
      return studentService.update(studentDto);
    }  
      public String delete(String studentId) throws Exception{
      return studentService.delete(studentId);
    }  
       public ArrayList<StudentDto> getAll() throws Exception{
      return studentService.getAll();
    }  
     public StudentDto get(String studentId) throws Exception{
         return studentService.get(studentId);
     }  
}