# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [x] Trailers for popular movies are played automatically when the movie is selected (1 point).
  * [x] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  * [x] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [x] Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
- [x] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

<img src="/Youtube.gif?raw=true" width="250px"><br>

### Notes

Parsing JSON for the additional movie details was a little difficult,
I didn't realize the JSON response was already formatted as a single oject so I did not have to convert to an array.

## Open-source libraries used
- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android
- [Glide-Transformations](https://github.com/wasabeef/glide-transformations) - Image editing library
- [ButterKnife](https://jakewharton.github.io/butterknife/) - Library for reducing view boilerplate

---

## Flix Part 1

### User Stories
#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x] (2pts) Views should be responsive for both landscape/portrait mode.
   - [x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.


### App Walkthough GIF

<img src="/Portrait.gif?raw=true" width="250px">

<img src="/Landscape.gif?raw=true" width="450px" >

### Notes
It was a nice challenge learning how to use the new RecyclerView in this project.

### Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids


## License

    Copyright 2019 Gibriel Spiteri

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
