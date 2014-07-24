package com.itextpdf.core.pdf;

import com.itextpdf.core.pdf.objects.PdfDictionary;
import com.itextpdf.core.pdf.objects.PdfName;
import com.itextpdf.core.pdf.objects.PdfNumber;
import com.itextpdf.core.pdf.objects.PdfObject;

import java.io.IOException;

public class PdfTrailer extends PdfDictionary {

    private PdfTrailer() {
        super();
    }

    public PdfTrailer(PdfDocument doc) {
        super(doc);
    }

    public PdfCatalog getCatalog() {
        return (PdfCatalog)get(PdfName.Root);
    }

    public void setCatalog(PdfCatalog catalog) {
        put(PdfName.Root, catalog);
    }

    public PdfDocumentInfo getDocumentInfo() {
        return (PdfDocumentInfo)get(PdfName.Info);
    }

    public void setInfo(PdfDocumentInfo info) {
        put(PdfName.Info, info);
    }



    public void setSize(int size) {
        put(PdfName.Size, new PdfNumber(size));
    }

}
