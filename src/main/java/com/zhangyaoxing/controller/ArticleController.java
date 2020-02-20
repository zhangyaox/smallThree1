package com.zhangyaoxing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangyaoxing.entity.Article;
import com.zhangyaoxing.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	
	@RequestMapping("select")
	public String select(String begin, String end, String gj, Model m) {
		List<Article> selectArticle = articleService.selectArticle(begin, end, gj);
		m.addAttribute("info", selectArticle);
		return "select";
	}
}
