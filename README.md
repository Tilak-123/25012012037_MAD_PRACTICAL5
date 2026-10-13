# MAD Practical 5: Jetpack Compose Authentication & UI Screens

An Android Application developed as part of the Mobile Application Development (MAD) coursework, implementing **Login**, **Registration**, and **CheckBox Level Selection** screens using **Jetpack Compose** and **Material 3**.

---

## 📋 Student & Course Details

- **Course:** Mobile Application Development
- **Practical No:** 5
- **Student Name:** Tilak Pandya

---

## ✨ Features & Screenshots Overview

### 1. 🔑 Login Screen
- **GUNI Header Branding:** Vivid hot-pink (`#D91A60`) title.
- **Form Inputs:** Custom side-by-side labels with styled input fields for **Email** and **Password**.
- **Actions:**
  - *"Forgot Password?"* interactive action link.
  - Full-width royal blue capsule **"Login"** button.
  - Direct navigation link: *"Don't have an account? SIGN UP"*.

### 2. 📝 Registration Screen
- **Form Inputs:** Includes fields for **Name**, **Phone Number**, **City**, **Email**, **Password**, and **Confirm Password**.
- **Actions:**
  - Full-width royal blue capsule **"Register"** button.
  - Direct navigation link: *"Do you have an account? LOGIN"*.

### 3. ☑️ CheckBox Level Selection Screen
- **Subject Selection:** Parent *"Select All Subjects"* checkbox driving sub-checkboxes for:
  - Mobile Application Development
  - Web Development
  - Data Structures & Algorithms
- **Level Selection:** Checkbox selection for skill levels (*Beginner*, *Intermediate*, *Advanced*).
- **Terms Agreement:** Enable/disable submit button based on terms acceptance.
- **Logout Action:** Navigates back to the Login screen.

---

## 🛠️ Technology Stack

- **Language:** Kotlin 2.0+
- **UI Framework:** Jetpack Compose with Material 3 (`androidx.compose.material3`)
- **Activity:** `ComponentActivity` with Edge-to-Edge display support
- **Build System:** Android Gradle Plugin (AGP) 9.4.1
- **Target SDK:** 35 | **Min SDK:** 26

---

## 📁 Project Structure

```text
com.example.a25012012037_mad_practical5/
├── MainActivity.kt          # Main Activity entry point
├── AppNavigation.kt         # Navigation state management & routing
├── Screen.kt                # Sealed class defining screen routes
├── FormField.kt             # Reusable form row component with label and input field
├── LoginScreen.kt           # Login UI composable
├── RegistrationScreen.kt    # Registration UI composable
├── CheckBoxLevelScreen.kt   # CheckBox Level Selection UI composable
├── CheckBoxScreen.kt        # Wrapper composable for CheckBox screen
└── ui/theme/
    └── Theme.kt             # Material 3 Color Schemes & App Theme definition
```

---

## 🚀 How to Run

1. Clone or download this project repository.
2. Open the project in **Android Studio**.
3. Perform a **Gradle Sync** (`File > Sync Project with Gradle Files`).
4. Run the application on an Android Emulator or physical device running **Android 8.0 (API 26)** or higher.

---

## 👤 Developer Details

- **Developer Name:** Tilak Pandya
- **Enrollment Number:** 25012012037

