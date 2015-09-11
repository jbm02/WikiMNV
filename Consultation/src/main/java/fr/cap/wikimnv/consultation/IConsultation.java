package fr.cap.wikimnv.consultation;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;

public interface IConsultation {

	List<Object> rechercherDerniersArticles(int nbArticles) throws MNVException;	
	
	List<Object> rechercherArticlesParMotCle(String motCle) throws MNVException;
	List<Object> rechercherArticlesParTag(Object tag) throws MNVException;
	List<Object> rechercherArticlesParUser(Object user) throws MNVException;
	
	//????????!
	List<Object> rechercherArticlesParContenuSimilaire(Object contenu) throws MNVException;

}
