package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IServiceTemplate;
import fr.cap.wikimnv.contribution.service.impl.ServiceTemplateImpl;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Template;

public class IServiceTemplateTest {
	IServiceTemplate gtemplate=new ServiceTemplateImpl();
	Template template=new Template("document");
	
	@Test
	public void testAjouterMeta() {
		try{
			String test="titre";
			gtemplate.ajouterMeta(template, test);
			boolean expected=true;
			boolean actuel=template.getMeta().contains(test);
			assertEquals(expected, actuel);
		}catch(MNVException e) {
			e.getMessage();
		}
	}

	@Test
	public void testSupprimerMeta() {
		try {
		String test="titre";
			gtemplate.supprimerMeta(template, test);
			boolean expected=false;
			boolean actual=template.getMeta().contains(test);
			assertEquals(expected, actual);
		} catch (MNVException e) {
			e.getMessage();
		}
				
		
	}

}
