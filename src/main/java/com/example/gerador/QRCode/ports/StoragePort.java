package com.example.gerador.QRCode.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}
