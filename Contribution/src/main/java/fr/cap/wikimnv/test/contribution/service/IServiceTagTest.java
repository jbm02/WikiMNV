package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.contribution.service.IServiceTag;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Tag;

public class IServiceTagTest {
	
	IServiceTag serviceTag;
	
	public IServiceTagTest() {
		serviceTag = (IServiceTag) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("sTag");
	}
	
	String libelle = "test";
	Set<Tag> listetag = new HashSet<Tag>();
	@Test
	public void testRechercheTextuelle() {
		try {
			listetag = serviceTag.rechercheTextuelle(libelle);
		} catch (MNVException e) {
			fail("Not yet implemented");
		}
	}

}
