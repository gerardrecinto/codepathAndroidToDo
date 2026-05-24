# ToDo — Android

Android to-do list app built during a CodePath Android bootcamp exercise. Covers `ListView` with `ArrayAdapter`, launching a second `Activity` for item editing, and persisting items across app restarts via a flat file.

![Java](https://img.shields.io/badge/Java-Android-3DDC84?logo=android&logoColor=white)
![Android](https://img.shields.io/badge/Android-API%2021%2B-3DDC84?logo=android&logoColor=white)
![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey)

---

## Features

- Add new to-do items via `EditText` + button
- Tap any item to open an edit screen; changes reflect in the list on return
- Delete items from the list
- Items persist across app restarts (flat file serialization)

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI | `ListView`, `ArrayAdapter`, `EditText`, `AlertDialog` |
| Navigation | Second `Activity` launched via explicit `Intent` |
| Persistence | Flat file via `FileOutputStream` / `FileInputStream` |

---

## Setup

Open in Android Studio, let Gradle sync, and run on an emulator or physical device (API 21+).
