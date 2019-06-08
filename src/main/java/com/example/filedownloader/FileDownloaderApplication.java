package com.example.filedownloader;

import com.example.filedownloader.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileDownloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDownloaderApplication.class, args);
	}

}
