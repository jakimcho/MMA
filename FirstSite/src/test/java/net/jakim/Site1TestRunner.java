package net.jakim;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.jakim.steps.libraries.Site1NavigationActions;
import net.jakim.utils.StepsFactories;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author yakimfb
 * @since 26.01.20
 **/

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(
        plugin =
                {
                        "json:target/cucumber.json",
                        "junit:target/cucumber.xml"
                },
        features = "features/",
        glue = "net.jakim.steps.definitions",
        snippets = SnippetType.CAMELCASE,
        tags = {  } )
public class Site1TestRunner
{

    @BeforeClass
    public static void init()
    {
        StepsFactories.init()
                      .withNavigationActions( Site1NavigationActions.class );
    }
}
