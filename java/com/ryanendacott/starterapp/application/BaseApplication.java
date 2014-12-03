package com.ryanendacott.starterapp.application;

import android.app.Application;
import com.ryanendacott.starterapp.inject.Injector;
import com.ryanendacott.starterapp.main.MainModule;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

/**
 * Application class to provide the Dagger Object Graph.
 */
public class BaseApplication extends Application implements Injector {
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
        new ApplicationModule(this),
        new MainModule()
    );
  }

  public void inject(Object object) {
    mObjectGraph.inject(object);
  }
}
