package net.jakim.steps.libraries;

import net.jakim.pages.HomePage;
import net.thucydides.core.annotations.Step;

/**
 * @author yakimfb
 * @since 26.01.20
 **/

public abstract class NavigationActions
{


    protected HomePage homePage;

    @Step
    public void startsApplication()
    {
        homePage.open();
    }

    @Step
    public abstract void navigatesThroughTheMenus();

    public abstract boolean navigations();
}
