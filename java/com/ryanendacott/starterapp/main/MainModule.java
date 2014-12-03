package com.ryanendacott.starterapp.main;

import com.ryanendacott.starterapp.application.MainApplication;
import dagger.Module;

@Module(
    injects = MainActivity.class,
    includes = MainApplication.class,
    complete = false
)
public class MainModule {
  // Put application-specific providers here.
}
