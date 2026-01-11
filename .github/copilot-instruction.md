app/
├── src/
│   ├── main/
│   │   ├── AndroidManifest.xml
│   │   ├── java/com/yourcompany/yourapp/
│   │   │   ├── di/                    # Dependency Injection (Hilt modules)
│   │   │   │   ├── AppModule.kt
│   │   │   │   ├── RepositoryModule.kt
│   │   │   │   └── DatabaseModule.kt
│   │   │   ├── data/                  # Data layer
│   │   │   │   ├── local/             # Local data source (Room, SharedPreferences)
│   │   │   │   │   ├── dao/
│   │   │   │   │   ├── database/
│   │   │   │   │   └── entity/
│   │   │   │   ├── remote/            # Remote data source (API calls)
│   │   │   │   │   ├── api/
│   │   │   │   │   ├── dto/
│   │   │   │   │   └── interceptor/
│   │   │   │   └── repository/        # Repository implementation
│   │   │   │       └── *Repository.kt
│   │   │   ├── domain/                # Domain layer (Business logic)
│   │   │   │   ├── model/             # Domain models (entities)
│   │   │   │   ├── repository/        # Repository interfaces
│   │   │   │   └── usecase/           # Use cases
│   │   │   │       └── *UseCase.kt
│   │   │   ├── presentation/          # Presentation layer (UI)
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── screen/
│   │   │   │   │   │   ├── home/
│   │   │   │   │   │   │   ├── HomeScreen.kt
│   │   │   │   │   │   │   ├── HomeViewModel.kt
│   │   │   │   │   │   │   └── HomeUiState.kt
│   │   │   │   │   │   └── detail/
│   │   │   │   │   ├── component/
│   │   │   │   │   │   └── *Composable.kt
│   │   │   │   │   ├── navigation/
│   │   │   │   │   │   └── NavGraph.kt
│   │   │   │   │   └── theme/
│   │   │   │   │       ├── Color.kt
│   │   │   │   │       ├── Type.kt
│   │   │   │   │       └── Theme.kt
│   │   │   │   └── viewmodel/
│   │   │   │       └── *V
