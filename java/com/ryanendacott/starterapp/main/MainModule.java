package com.ryanendacott.starterapp.main;

import dagger.Module;

@Module(
    injects = {
        MainActivity.class,
        MainFragment.class
    }
)
public class MainModule {
  // Put application-specific providers here.
}
