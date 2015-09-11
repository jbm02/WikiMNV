/**
 * 
 */
package fr.cap.wikimnv.consultation.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cap.wikimnv.consultation.Bouchon;
import fr.cap.wikimnv.consultation.IConsultation;
import fr.cap.wikimnv.consultation.Query;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Meta;

public class ConsultationImpl implements IConsultation {

	
	public List<Object> rechercherDerniersArticles(int nbArticles)
			throws MNVException {
		Meta meta = new Meta("nbArticles", "" + nbArticles);
		List<Meta> lmeta = new ArrayList<Meta>();
		lmeta.add(meta);
		return Bouchon.executeQuery(Query.RECHERCHE_DERNIER_ARTICLE, lmeta);
	}


	public List<Object> rechercherArticlesParMotCle(String motCle)
			throws MNVException {
		Meta meta = new Meta("motCle", motCle);
		List<Meta> lmeta = new ArrayList<Meta>();
		lmeta.add(meta);
		return Bouchon.executeQuery(Query.RECHERCHE_ARTICLE_MOT_CLE, lmeta);
	}


	public List<Object> rechercherArticlesParTag(Object tag) throws MNVException {
		Meta meta = new Meta("tag", tag.toString());
		List<Meta> lmeta = new ArrayList<Meta>();
		lmeta.add(meta);
		return Bouchon.executeQuery(Query.RECHERCHE_ARTICLE_TAG, lmeta);
	}


	public List<Object> rechercherArticlesParUser(Object user)
			throws MNVException {
		Meta meta = new Meta("user", user.toString());
		List<Meta> lmeta = new ArrayList<Meta>();
		lmeta.add(meta);
		return Bouchon.executeQuery(Query.RECHERCHE_ARTICLE_USER, lmeta);
	}


	public List<Object> rechercherArticlesParContenuSimilaire(Object contenu)
			throws MNVException {
		Meta meta = new Meta("contenu", contenu.toString());
		List<Meta> lmeta = new ArrayList<Meta>();
		lmeta.add(meta);
		return Bouchon.executeQuery(Query.RECHERCHE_ARTICLE_LIKE, lmeta);
	}

}
