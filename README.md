# 🎟️ TicketPAM

Aplikasi **Pemesanan Tiket** sederhana yang dibuat menggunakan **Kotlin** dan **Jetpack Compose** sebagai tugas Praktikum **Pemrograman Aplikasi Mobile (PAM)** di Fakultas Ilmu Komputer Universitas Brawijaya.

## 📱 Deskripsi Project

TicketPAM merupakan aplikasi Android yang menampilkan antarmuka pemesanan tiket dengan fitur interaktif untuk mengatur jumlah tiket yang dibeli. Total pembayaran akan diperbarui secara otomatis sesuai jumlah tiket yang dipilih, serta tersedia tombol **RESET** untuk mengembalikan data ke kondisi awal.

## ✨ Fitur Aplikasi

* Menampilkan harga tiket tetap sebesar **Rp25.000** per tiket.
* Menambah jumlah tiket menggunakan tombol **+**.
* Mengurangi jumlah tiket menggunakan tombol **−** (minimal 1 tiket).
* Menghitung total pembayaran secara otomatis berdasarkan jumlah tiket.
* Tombol **RESET** untuk mengembalikan jumlah tiket menjadi 1 dan total pembayaran ke nilai awal.
* Antarmuka modern menggunakan **Jetpack Compose** dan **Material 3**.

## 🛠️ Teknologi yang Digunakan

* Kotlin
* Jetpack Compose
* Material 3
* Android Studio

## 📚 Komponen Jetpack Compose yang Digunakan

Project ini menggunakan beberapa komponen dasar Jetpack Compose sesuai materi praktikum, yaitu:

* `Column`
* `Row`
* `Box`
* `Spacer`
* `Text`
* `Modifier`
* `Card`
* `Button`
* `IconButton`
* `Icons`
* `remember`
* `mutableStateOf`

## 📸 Tampilan Aplikasi

### Kondisi Awal

<img width="372" height="813" alt="image" src="https://github.com/user-attachments/assets/b913d596-94d8-44e3-b1bd-1f24b15305ad" />

Pada kondisi awal, aplikasi menampilkan:

* Harga Tiket: **Rp25.000**
* Jumlah Tiket: **1**
* Total Pembayaran: **Rp25.000**

### Setelah Tombol (+) Ditekan Dua Kali

<img width="363" height="811" alt="image" src="https://github.com/user-attachments/assets/283cc995-f902-4f8c-abc4-226810e2ece6" />

Jumlah tiket berubah menjadi **3** dan total pembayaran otomatis berubah menjadi **Rp75.000**.

## 🎯 Tujuan Project

Project ini dibuat untuk mempelajari konsep dasar **State Management** pada Jetpack Compose, khususnya penggunaan `remember` dan `mutableStateOf`, serta penerapan layout dan modifier untuk membangun antarmuka Android yang interaktif.

## 👤 Identitas

**Nama:** Trisha Malina Hanim

**NIM:** 245150400111042

**Mata Kuliah:** Pemrograman Aplikasi Mobile (PAM)

**Fakultas:** Fakultas Ilmu Komputer, Universitas Brawijaya
