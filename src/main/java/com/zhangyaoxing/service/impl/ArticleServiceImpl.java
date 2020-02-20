package com.zhangyaoxing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangyaoxing.entity.Article;
import com.zhangyaoxing.mapper.ArticleMapper;
import com.zhangyaoxing.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleMapper articleMapper;
	
	public List<Article> selectArticle(String begin, String end, String gj) {
		// TODO Auto-generated method stub
		return articleMapper.selectArticle(begin, end, gj);
	}

}
