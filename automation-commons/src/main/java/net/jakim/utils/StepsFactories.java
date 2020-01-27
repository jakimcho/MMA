package net.jakim.utils;

import net.jakim.steps.libraries.NavigationActions;
import net.serenitybdd.core.Serenity;

/**
 * @author yakimfb
 * @since 26.01.20
 **/
public class StepsFactories
{
    private Class<? extends NavigationActions> navigationActionsClass;
    private static StepsFactories STEPS_FACTORIES;

    private StepsFactories()
    {

    }

    public static StepsFactories init()
    {
        if ( STEPS_FACTORIES == null )
        {
            STEPS_FACTORIES = new StepsFactories();
        }

        return STEPS_FACTORIES;
    }

    public StepsFactories withNavigationActions( final Class<? extends NavigationActions> navigationActionsClass )
    {
        this.navigationActionsClass = navigationActionsClass;
        return this;
    }

    public static StepsFactories get()
    {
        return STEPS_FACTORIES;
    }

    public NavigationActions navigationActions()
    {
        return Serenity.getStepFactory()
                       .getNewCachedStepLibraryFor( this.navigationActionsClass );
    }


}
