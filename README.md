# GS-Kotlin - Extreme Events Monitor 

## Alunos 
### Amanda Cornelsen Carbone - RM97760
### Vinicius Shuet - RM98160 <br>

---

**GS-Kotlin** is an Android application developed in Kotlin that allows users to monitor extreme events such as natural disasters, severe weather conditions, or other significant occurrences. The app provides real-time updates and detailed information, helping users stay informed and prepared.

---

## 🛠️ Technologies Used

- **Language:** Kotlin (Android)
- **Architecture:** MVVM (Model-View-ViewModel)
- **Libraries & Tools:** Retrofit, GsonConverterFactory, Coroutines
- **API:** Public API for extreme events (or custom data source)
- **Design:** Material Design for a modern, intuitive interface

---

## 📂 Project Structure
GS-Kotlin/
├── app/src/main/java/...
│ ├── MainActivity.kt # Main screen handling UI and interactions
│ ├── ExtremeEventService.kt # API service interface for fetching event data
│ ├── ExtremeEventServiceFactory.kt # Configures Retrofit for API calls
│ ├── models/
│ │ └── ExtremeEvent.kt # Data model for extreme events
│ └── viewmodel/
│ └── EventViewModel.kt # Manages data and updates UI using LiveData
├── app/src/main/res/
│ ├── layout/ # XML layouts for activities and fragments
│ └── drawable/ # Images and icons
└── build.gradle.kts # Project dependencies and configuration

---

## 🚀 Features

- **Real-Time Event Monitoring:** Fetches and displays extreme events from a reliable data source.
- **User-Friendly Interface:** Material Design UI with clear navigation.
- **Event Details:** View specific information for each extreme event, including type, location, severity, and timestamp.
- **Manual Refresh:** Allows users to refresh the data manually to get the latest updates.
- **Error Handling:** Displays appropriate messages in case of API or network failures.
- **Asynchronous Operations:** Uses Kotlin Coroutines for smooth background data fetching without blocking the UI.

---

## Images
#### Imagem 1 - 5 Edit Texts <br>
<img src="images/Tela 1 - 5 EditText.png" width="300"/> <br>
#### Imagem 2 - Adicionando Itens <br>
<img src="images/Tela 2 - Adicionando Itens.png" width="300"/> <br>
#### Imagem 3 - Excluindo itens <br>
<img src="images/Tela 3 - Excluindo Itens.png" width="300"/> <br> 
#### Imagem 4 - Comprovando as exigências <br> 
<img src="images/Tela 4 - Comprovando as exigÊncias.png" width="300"/> <br>
#### Imagem 5 - Integrantes <br> 
<img src="images/Tela 5 - Integrantes.png" width="300"/> <br>
