package com.examonline.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.examonline.po.StudentInfo;

/**
  *
  * <p>Title: StudentInfoMapper</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-16
  * @time: 上午10:17:57
  * @version: 1.0
  */

@Repository
public interface StudentInfoMapper {

	public List<StudentInfo> getStudents(Map<String, Object> map);
	
	public StudentInfo getStudentById(int studentId);
	
	public int isUpdateStudent(StudentInfo student);
	
	public int isDelStudent(int studentId);
	
	public int isAddStudent(StudentInfo student);
	
	public int getStudentTotal();
	
	public StudentInfo getStudentByAccountAndPwd(String studentAccount);
	
	public int isResetPwdWithStu(StudentInfo studentInfo);
	
	public List<StudentInfo> getStudentsByClassId(int classId);
}
