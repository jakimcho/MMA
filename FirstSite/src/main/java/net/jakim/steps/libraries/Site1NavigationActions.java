package net.jakim.steps.libraries;

import static net.jakim.pages.HomePage.*;

/**
 * @author yakimfb
 * @since 26.01.20
 **/
public class Site1NavigationActions
        extends NavigationActions
{
    @Override
    public void navigatesThroughTheMenus()
    {
        this.homePage.$( WOMEN_MENU ).waitUntilClickable()
                     .click();
        this.homePage.$( TSHERTS_MENU ).waitUntilClickable()
                     .click();
        this.homePage.$( DRESSES_MENU ).waitUntilClickable()
                     .click();
    }

    @Override
    public boolean navigations()
    {
        return this.homePage.getTitle()
                            .equals( "dadas" );
    }
}
