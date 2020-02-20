package com.zhangyaoxing.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangyaoxing.entity.Article;

public interface ArticleMapper {
	List<Article> selectArticle(@Param("begin")String begin,@Param("end")String end,@Param("gj")String gj);
}
