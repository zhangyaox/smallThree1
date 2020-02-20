package com.zhangyaoxing.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangyaoxing.entity.Article;

public interface ArticleService {
	List<Article> selectArticle(String begin,String end,String gj);
}
