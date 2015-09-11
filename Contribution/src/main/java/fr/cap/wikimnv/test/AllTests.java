package fr.cap.wikimnv.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.cap.wikimnv.test.contribution.service.IServiceArticleTest;

@RunWith(Suite.class)
@SuiteClasses({ IServiceArticleTest.class })
public class AllTests {

}
