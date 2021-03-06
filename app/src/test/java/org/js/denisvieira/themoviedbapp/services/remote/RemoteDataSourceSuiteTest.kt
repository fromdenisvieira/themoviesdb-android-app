package org.js.denisvieira.themoviedbapp.services.remote

import org.js.denisvieira.themoviedbapp.services.remote.genres.GenresRemoteDataSourceSuiteTest
import org.js.denisvieira.themoviedbapp.services.remote.movies.MoviesRemoteDataSourceSuiteTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MoviesRemoteDataSourceSuiteTest::class,
    GenresRemoteDataSourceSuiteTest::class
)
class RemoteDataSourceSuiteTest