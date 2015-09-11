package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.contribution.service.IServiceArticle;
import fr.cap.wikimnv.contribution.service.impl.ServiceArticleImpl;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Article;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;

public class IServiceArticleTest {
	IServiceArticle serviceArticle;
	Article article;
	
	public IServiceArticleTest() {
		serviceArticle = (IServiceArticle) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("sArticle");
	}
	
	@Test
	public void testChangerEtat() {
		try{
			EtatPublication etatPublication=EtatPublication.PUBLIE;
			Object idArticle="1";
			serviceArticle.changerEtat(etatPublication, idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}

	@Test
	public void testLister() {
	
		try{
		
			serviceArticle.lister(getClass());
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
		
	}

	@Test
	public void testLire() {
try{
			
			Object idArticle="1";
			serviceArticle.lire(idArticle, Article.class);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testSupprimer() {
		try{
			
			Object idArticle="1";
			serviceArticle.supprimer(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testSauver() {
try{
			
			Object idArticle="1";
			serviceArticle.supprimer(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}	
	
	}

}
