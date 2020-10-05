package com.artistPage.Capstone.storage;

public class StorageFileNotFoundException extends com.artistPage.Capstone.storage.StorageException {

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
