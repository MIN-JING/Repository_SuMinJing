# Week 0 Part 2

## Learning Objective

How to get data from the server and parse it.

## Assignment

1. Please find the **Marketing Hots API** in the [API Doc](https://github.com/AppWorks-School/API-Doc/tree/master/Stylish#marketing-hots-api).

2. Use [Postman](https://www.getpostman.com) to test the API first before we start building the application.

3. Establish **Retrofit** design, open `StylishApiService.kt`, create a `StylishApiService` interface and `StylishApi` public object as below:
```
interface StylishApiService {
    @GET("marketing/hots")
    suspend fun getMarketingHots(): MarketingHotsResult
}

object StylishApi {
   val retrofitService : StylishApiService by lazy { retrofit.create(StylishApiService::class.java) }
}
```

4. Use `Retrofit` and `Coroutines` to request data from STYLiSH server via `getMarketingHots` suspend function with `Marketing Hots API`.

5. You should create a data class to handle the response from the server. Parse data to `MarketingHotsResult` class which includes List<Hots> data. Notice that we use **CamelCase** as the naming rule, so we don't accept `main_image` as a property name.

6. Pass data to Adapter from `ViewModel` with `LiveData` and display the data on the screen. You just need to update the text in the app. **Don't worry about updating the images for now.**

7. Odd cells should display only one image, and even cells should display four images.

## Hint

1. [Connecting to the Internet from Lesson 8: Connecting to the Internet of Developing Android Apps with Kotlin on Udacity](https://classroom.udacity.com/courses/ud9012/lessons/2be0ed85-721d-4a8d-a484-909b5c98336c/concepts/bef51cd0-1e3b-4350-8b75-c234aa400e14)
2. Coroutines (**DON'T USE** Retrofit's `Call object` and `enqueue function`)
3. ViewModel and LiveData
