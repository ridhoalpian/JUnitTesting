package com.example.teamapp // Deklarasi paket (package) tempat kelas mApps berada

import org.junit.Assert // Mengimpor kelas assertions atau pernyataan pengecekan yang disediakan oleh kerangka kerja pengujian JUnit
import org.junit.Test // Pernyataan import yang mengimport anotasi @Test dari kerangka kerja pengujian JUnit

class mAppsTest { // Deklarasi sebuah kelas bernama mAppsTest

    val mApps = mApps() // Mendeklarasikan objek mApps dari kelas mApps
    @Test // Anotasi @Test digunakan untuk menandai metode yang akan dijalankan sebagai bagian dari pengujian
    fun testAddSuccess(){ // Metode pengujian yang diberi anotasi @Test
        val result = mApps.add(10, 10) // Variabel result diinisialisasi dengan hasil pemanggilan fungsi add dari objek mApps dengan parameter 10 dan 10
        Assert.assertEquals(20, result) // Pernyataan assertion yang memeriksa apakah result, yaitu hasil dari pemanggilan fungsi add (dengan parameter 10 dan 10), sama dengan nilai yang diharapkan, yaitu 20
    }
}