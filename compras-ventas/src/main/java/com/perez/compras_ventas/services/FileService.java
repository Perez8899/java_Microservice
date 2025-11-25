package com.perez.compras_ventas.services;

import com.perez.compras_ventas.common.dto.FileDownloadResponse;
import com.perez.compras_ventas.common.dto.FileRequest;
import com.perez.compras_ventas.common.dto.FileResponse;

import java.io.File;

public interface FileService {

    FileResponse createFile(FileRequest fileRequest);

    File retrieveFile(FileResponse fileResponse);

    FileDownloadResponse fileDownload(String filePath);
}
