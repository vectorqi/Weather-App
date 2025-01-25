
# WeatherApp

WeatherApp is a modern weather application built using **Kotlin**, **Jetpack Compose**, and **MVVM architecture**. It provides real-time weather updates and forecast information by integrating a third-party weather API. The app also includes local data storage functionality with CRUD operations powered by **Room** and dependency injection with **Hilt**.

## Features

- Search for weather by:
  - City name
  - ZIP/Postal code
  - GPS coordinates
- Real-time weather updates
- 5-day weather forecast
- Local data storage with CRUD functionality
  - Save weather data for offline access
  - Update and delete stored weather data
- Clean and modular MVVM architecture
- Jetpack Compose for building declarative and modern UI
- Dependency injection with Hilt
- Image loading with Coil

## Tech Stack

- **Kotlin**: Programming language
- **Jetpack Compose**: UI toolkit for declarative UI
- **MVVM**: Architectural pattern
- **Hilt**: Dependency injection
- **Room**: Local database for data persistence
- **Retrofit**: HTTP client for API requests
- **KSP**: Kotlin Symbol Processing for annotation processing
- **Coil**: Image loading library for Jetpack Compose


## Requirements

- Android Studio Electric Eel or later
- Minimum SDK: 24
- Target SDK: 34
- Kotlin version: 2.0.0

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/vectorqi/Weather-App
   cd WeatherApp
   ```

2. Open the project in Android Studio.

3. Add your API key in the `local.properties` file:
   ```properties
   WEATHER_API_KEY=your_api_key_here
   ```

4. Build and run the project:
   ```bash
   ./gradlew clean build
   ```

## API Integration

The app uses a weather API to fetch real-time weather data. Replace `your_api_key_here` with your API key obtained from a weather API provider like:
- [OpenWeatherMap](https://openweathermap.org/api)
- [WeatherAPI](https://www.weatherapi.com/)

## Folder Structure

```plaintext
app/
├── data/                # Repository, database, API services
├── di/                  # Dependency injection modules
├── domain/              # Business logic and use cases
├── ui/                  # Jetpack Compose UI components
├── viewmodel/           # ViewModels for managing UI state
├── MainActivity.kt      # Entry point of the app
└── App.kt               # Application class with Hilt configuration
```

## Contributing

Contributions are welcome! Feel free to:
- Open issues for bugs and feature requests
- Submit pull requests for new features and improvements

### Steps to Contribute
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make changes and commit:
   ```bash
   git commit -m "Add your commit message"
   ```
4. Push to your forked repository:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

