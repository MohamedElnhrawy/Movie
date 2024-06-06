package com.example.core.remote.parser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/core/remote/parser/DateJasonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "()V", "contractPDFSDF", "Ljava/text/SimpleDateFormat;", "requestSDF", "responseSDF", "theOtherResponseSDF", "transactionSDF", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "parseDate", "dateStr", "", "Companion", "core_debug"})
public final class DateJasonAdapter extends com.squareup.moshi.JsonAdapter<java.util.Date> {
    private final java.text.SimpleDateFormat responseSDF = null;
    private final java.text.SimpleDateFormat theOtherResponseSDF = null;
    private final java.text.SimpleDateFormat requestSDF = null;
    private final java.text.SimpleDateFormat transactionSDF = null;
    private final java.text.SimpleDateFormat contractPDFSDF = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.core.remote.parser.DateJasonAdapter.Companion Companion = null;
    private static final java.lang.String RESPONSE_FORMAT = "yyyy-MM-dd\'T\'HH:mm:ss";
    private static final java.lang.String THE_OTHER_RESPONSE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final java.lang.String REQUEST_FORMAT = "yyyy-MM-dd";
    private static final java.lang.String TRANSACTION_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    private static final java.lang.String CONTRACT_PDF_DATE_FORMAT = "d/M/yyyy";
    
    public DateJasonAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Date fromJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override
    public void toJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable
    java.util.Date value) {
    }
    
    private final java.util.Date parseDate(java.text.SimpleDateFormat $this$parseDate, java.lang.String dateStr) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/core/remote/parser/DateJasonAdapter$Companion;", "", "()V", "CONTRACT_PDF_DATE_FORMAT", "", "REQUEST_FORMAT", "RESPONSE_FORMAT", "THE_OTHER_RESPONSE_FORMAT", "TRANSACTION_DATE_FORMAT", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}