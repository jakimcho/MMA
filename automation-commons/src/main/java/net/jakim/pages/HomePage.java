package net.jakim.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * @author yakimfb
 * @since 26.01.20
 **/
@DefaultUrl( "page:home.page" )
public class HomePage
        extends PageObject
{
    public static By WOMEN_MENU = By.cssSelector( "#block_top_menu .sf-menu > li >  a[title='Women']" );
    public static By DRESSES_MENU = By.cssSelector( "#block_top_menu .sf-menu > li >  a[title='Dresses']" );
    public static By TSHERTS_MENU = By.cssSelector( "#block_top_menu .sf-menu > li > a[title='T-shirts']" );
}
