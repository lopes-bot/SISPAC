package br.com.pdf;


import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import br.com.Dbconnect.ConnectDb;


public class Gerar {
	
    public Gerar(int idevento) throws SQLException {
    	String sql = "SELECT * FROM evento AS e WHERE e.id_evento = ?";
    	ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
        Document document = new Document();
          
          try {
        	  
        	  ps.setInt(1, idevento);
        	  ps.execute();
              PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\victo\\Desktop\\poo_java\\Sispac_evento.pdf"));
              document.open();
              Font f = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
              Font font = FontFactory.getFont(FontFactory.TIMES, 14, Font.NORMAL);
              // adicionando um parágrafo no documento
              while(ps.getResultSet().next()) {
            	 Paragraph paragraph = new Paragraph(ps.getResultSet().getString("nomeevento"), f); 
            	 paragraph.setAlignment(Element.ALIGN_CENTER);
            	 paragraph.setSpacingAfter(40.0f);
                 document.add(paragraph);
                 
                 Paragraph p1 = new Paragraph("Endereço do evento: " + ps.getResultSet().getString("endereco") , font);
                 p1.setSpacingAfter(20.0f);
                 document.add( p1 );
                 
                 Paragraph p2 = new Paragraph("Data de abertura do evento: " + ps.getResultSet().getString("datainicio") , font   );
                 p2.setSpacingAfter(20.0f);
                 document.add( p2 );
                 
                 Paragraph p3 = new Paragraph("Data de encerramento do evento: " + ps.getResultSet().getString("datafim") , font   );
                 p3.setSpacingAfter(20.0f);
                 document.add( p3 );
                 
                 Paragraph p4 = new Paragraph("Horário de abertura do evento: " + ps.getResultSet().getString("horainicio") , font );
                 p4.setSpacingAfter(20.0f);
                 document.add( p4 );
                 
                 Paragraph p5 = new Paragraph("Horário de encerramento do evento: " + ps.getResultSet().getString("horafim") , font   );
                 p5.setSpacingAfter(20.0f);
                 document.add( p5 );
                 
                 Paragraph p6 = new Paragraph("Carga horária do evento: " + ps.getResultSet().getString("cargahoraria") + " hora(s)", font   );
                 p6.setSpacingAfter(20.0f);
                 document.add( p6 );
                 
                 Paragraph p7 = new Paragraph("Área principal do evento: " + ps.getResultSet().getString("area") , font   );
                 p7.setSpacingAfter(20.0f);
                 document.add( p7 );
                 
                 Paragraph p8 = new Paragraph("Número de vagas máximas para o evento: " + ps.getResultSet().getString("vagas") + " vagas" , font   );
                 p8.setSpacingAfter(20.0f);
                 document.add( p8 );
              }
              
    }
          catch(DocumentException de) {
              System.err.println(de.getMessage());
          }
          catch(IOException ioe) {
              System.err.println(ioe.getMessage());
          }
          ps.close();
          document.close();
    }
   	
}