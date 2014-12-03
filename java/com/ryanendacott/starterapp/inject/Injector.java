package com.ryanendacott.starterapp.inject;

/**
 * Injects the members of the given object.
 */
public interface Injector {

  /**
   * Uses a Dagger ObjectGraph to inject the members of the given object instance.
   * See {@link dagger.ObjectGraph#inject}.
   */
  public void inject(Object object);

}
