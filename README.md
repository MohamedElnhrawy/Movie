# Movie App

This movie application provides users with an extensive collection of films, allowing them to explore detailed information about each movie. Users can search for specific films and delve into their details. Additionally, the app enables users to watch trailers and video clips related to each film. 

## Overview
- This project embraces a robust development approach by incorporating Multi-Module, MVVM (Model-View-ViewModel), and Clean Architecture principles.
- kindly not forgot to update your local.properties file with theses keys 
- API_KEY=58a122760a6319ec8c705776019a2429 
- BASE_URL=https://api.themoviedb.org/3/

# MVVM-Clean-Architecture:
Model-view-viewmodel is a software design pattern consisting of three layers:

Model (in our architecture combined with Clean Architecture refers to a domain model representing real state content).
View (activities, fragments, it displays data received through view-model).
View Model (the View Model represents an abstraction of the view, it receives data from the Model, performs necessary UI logic, and then exposes appropriate data to the View, alongside that, View Model manipulates the Model based on actions on the View. The View has a reference to a View Model but View Model doesn’t know anything about the View).

### Modules
Modules are the collection of source files and build settings that allow you to divide your project into discrete units of functionality.

- **App Module**

  `:app` module is an [com.android.application](https://developer.android.com/studio/projects/android-library), which is needed to create the app bundle. It contains dependency graph and UI related classes. It presents data to screen and handle user interactions.

- **Common Module**

  `:common` module contains code and resources which are shared between other modules

- **Core Module**

  `:core` module contains bellow packages:

  `:local` module contains local data source related classes

  `:remote` module contains remote data source related classes

  `:di` module contains implementation of repository and local - remote repository interface adapt

  `:repos` module contains use cases and repository interface adapt

  `:utils` most of useful extensions.

- **features Module**

  `:features` module contains business logic
## Clean Architecture
- Clean Architecture principles are applied to each feature module in this project.

## MVVM (Model-View-ViewModel)
- MVVM provides a clear separation between the user interface (View) and business logic (ViewModel), promoting code readability.


    
## Used in the project

*  `Jetpack Compose:`  Modern declarative UI Toolkit for Android
*  `Navigation Compose:`  Allows to easily build multi screen apps
 *  `Paging3`  Allows for the gradual loading of large datasets from the data source easily
 *  `Hilt` for dependency injection
 *  `Coroutines` for asynchronous programming
 *  `Room` for local cache 
- Flow
- OKHttp
- Retrofit
- Moshi
- Coil
- Pager
- TMDB API

## 📸 Screens

### Dark Mode

![Image Description](https://drive.google.com/uc?id=1klcOebGQLE_xw1sGhhSetTBtER0tx2n7)
![Image Description](https://drive.google.com/uc?id=1Ibp1e6qA4M3t4Ox8Wa_Ldu4lFp35KK1E)
![Image Description](https://drive.google.com/uc?id=18rusxdO-I65UjjP-4bpYm4TIc8TQXDnu)
![Image Description](https://drive.google.com/uc?id=1yGzhvYwx1vym2jDU8ltrtzkyWqor1Do2)




  














