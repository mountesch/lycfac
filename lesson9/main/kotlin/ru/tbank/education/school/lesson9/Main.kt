package ru.tbank.education.school.lesson9

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.DriverManager.println
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream


fun main() {
    val sourceFolder = File("project_data")
    val zipFile = File("archive.zip")

    zipFolder(sourceFolder, zipFile)

    println("Готово")
}

fun zipFolder(sourceFolder: File, zipFile: File) {
    val zipOutputStream = ZipOutputStream(FileOutputStream(zipFile))

    try {
        addFilesToZip(sourceFolder, sourceFolder, zipOutputStream)
    } finally {
        zipOutputStream.close()
    }
}

fun addFilesToZip(
    rootFolder: File,
    currentFolder: File,
    zipOutputStream: ZipOutputStream
) {
    val files = currentFolder.listFiles() ?: return

    for (file in files) {
        if (file.isDirectory) {
            addFilesToZip(rootFolder, file, zipOutputStream)
        } else {
            val extension = file.extension.lowercase()

            if (extension == "txt" || extension == "log") {
                val entryName = file.absolutePath
                    .substring(rootFolder.absolutePath.length + 1)

                val zipEntry = ZipEntry(entryName)
                zipOutputStream.putNextEntry(zipEntry)

                val inputStream = FileInputStream(file)
                try {
                    val buffer = ByteArray(1024)
                    var length: Int

                    while (inputStream.read(buffer).also { length = it } > 0) {
                        zipOutputStream.write(buffer, 0, length)
                    }
                } finally {
                    inputStream.close()
                }

                zipOutputStream.closeEntry()

                println("Добавлен файл: $entryName (${file.length()} байт)")
            }
        }
    }
}
