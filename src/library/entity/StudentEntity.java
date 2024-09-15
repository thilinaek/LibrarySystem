/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.entity;

/**
 *
 * @author Nawanjana
 */
public class StudentEntity {
     private String studentId;
    private String studentName;
    private String email;
    private Integer contactNo;
    private String gender;

    public StudentEntity() {
    }

    public StudentEntity(String studentId, String studentName, String email, Integer contactNo, String gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.contactNo = contactNo;
        this.gender = gender;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contactNo
     */
    public Integer getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(Integer contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", contactNo=" + contactNo + ", gender=" + gender + '}';
    }
    
}
