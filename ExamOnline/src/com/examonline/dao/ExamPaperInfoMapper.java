package com.examonline.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.examonline.po.ExamPaperInfo;

/**
  *
  * <p>Title: ExamPaperInfoMapper</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-16
  * @time: 下午4:28:09
  * @version: 1.0
  */

@Repository
public interface ExamPaperInfoMapper {

	public List<ExamPaperInfo> getExamPapers(Map<String, Object> map);
	
	public ExamPaperInfo getExamPaperById(int examPaperId);

	public List<ExamPaperInfo> getExamPapersClear();
	
	public int isAddExamPaper(ExamPaperInfo examPaper);
	
	public int isUpdateExamPaper(ExamPaperInfo examPaper);
	
	public int isDelExamPaper(int examPaperId);
	
	public int getExamPpaerTotal();
	
	public int isUpdateExamPaperSubjects(Map<String, Object> map);
	
	public int isUpdateExamPaperScore(Map<String, Object> map);
}
