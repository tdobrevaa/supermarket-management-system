package org.example.service.impl;

import org.example.data.Receipt;
import org.example.data.ReceiptItem;
import org.example.service.ReceiptService;

import java.io.*;

public class ReceiptServiceImpl implements ReceiptService {
    @Override
    public void saveReceiptToTextFile(Receipt receipt) throws IOException {
        FileWriter writer = new FileWriter("receipt_" + receipt.getSerialNumber() + ".txt");

        writer.write("Receipt: " + receipt.getSerialNumber() + "\n");
        writer.write("Cashier: " + receipt.getCashier().getName() + "\n");
        writer.write("Date and Time: " + receipt.getDateTime() + "\n");

        for (ReceiptItem item : receipt.getReceiptItems()) {
            writer.write(item.getGood().getName() + " x" + item.getQuantity() + " " + item.getSellingPrice() + "\n");
        }

        writer.write("Total: " + receipt.getTotal() + "\n");
        writer.close();
    }

    @Override
    public Receipt readReceiptFromTextFile(long serialNumber) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("receipt_" + serialNumber + ".txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        return null;
    }

    @Override
    public void serializeReceipt(Receipt receipt) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("receipt_" + receipt.getSerialNumber() + ".ser"));
        oos.writeObject(receipt);
        oos.close();
    }

    @Override
    public Receipt deserializeReceipt(long serialNumber) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("receipt_" + serialNumber + ".ser"));
        Receipt receipt = (Receipt) ois.readObject();
        ois.close();
        return  receipt;
    }

}
