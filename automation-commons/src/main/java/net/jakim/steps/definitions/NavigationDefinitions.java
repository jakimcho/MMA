package net.jakim.steps.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.jakim.steps.libraries.NavigationActions;
import net.jakim.utils.StepsFactories;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yakimfb
 * @since 26.01.20
 **/
public class NavigationDefinitions
{

    NavigationActions user = StepsFactories.get()
                                           .navigationActions();

    @Given( "^(.*) is on home page$" )
    public void ivanIsOnHomePage( String actorName )
    {
        user.startsApplication();
    }

    @When( "^he navigates around the menus$" )
    public void heNavigatesAroundTheMenus()
    {
        user.navigatesThroughTheMenus();
    }

    @Then( "^site links works as expected$" )
    public void siteLinksWorksAsExpected()
    {
        assertThat(user.navigations(), is(true) );
    }
}
