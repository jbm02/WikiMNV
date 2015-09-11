package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.core.commons.exception.MNVException;



public interface IServiceContribution {
	Object sauver(Object article)throws MNVException;
	boolean demandePublication(Object article) throws MNVException;
}
