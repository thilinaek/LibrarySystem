/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.Service.Custom;

import java.util.ArrayList;
import library.Dto.StudentDto;
import library.Service.SuperService;

/**
 *
 * @author Nawanjana
 */
public interface StudentService extends SuperService{
    String save(StudentDto studentDto)throws Exception;
    String update(StudentDto studentDto)throws Exception;
    String delete(String studentName)throws Exception;
    StudentDto get(String studentName)throws Exception;
    ArrayList<StudentDto>getAll() throws Exception; 
}