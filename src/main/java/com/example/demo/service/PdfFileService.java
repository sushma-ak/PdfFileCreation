package com.example.demo.service;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

@Service
public class PdfFileService {
	
	
	public void pdfCreation()
	{
		String filepath="C:\\Users\\annap\\Desktop\\PdfFiles\\simple.pdf";
		
		try {
			PdfWriter writer=new PdfWriter(filepath);
			
			PdfDocument pdfdoc=new PdfDocument(writer);
			pdfdoc.addNewPage();
			
			Document document=new Document(pdfdoc);
			document.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
