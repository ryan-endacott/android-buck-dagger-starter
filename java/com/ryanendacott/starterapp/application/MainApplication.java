package com.ryanendacott.starterapp.application;

import android.app.Application;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

/**
 * Application class to provide the Dagger Object Graph.
 */
public class MainApplication extends Application {
  private ObjectGraph mObjectGraph;

  @Override
  public void onCreate() {
    super.onCreate();

    mObjectGraph = ObjectGraph.create(getModules().toArray());
  }

  /**
   * Gets the modules used in the application.  Add all new top-level modules here.
   */
  protected List<Object> getModules() {
    return Arrays.<Object>asList(
        new ApplicationModule(this)
    );
  }

  public void inject(Object object) {
    mObjectGraph.inject(object);
  }
}
