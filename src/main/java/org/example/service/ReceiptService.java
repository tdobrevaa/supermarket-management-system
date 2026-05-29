package org.example.service;

import org.example.data.Receipt;

import java.io.IOException;

public interface ReceiptService {
    public void saveReceiptToTextFile(Receipt receipt) throws  IOException;
    public Receipt readReceiptFromTextFile(long serialNumber) throws IOException;
    public void serializeReceipt(Receipt receipt) throws IOException;
    public Receipt deserializeReceipt(long serialNumber) throws IOException, ClassNotFoundException;
}
