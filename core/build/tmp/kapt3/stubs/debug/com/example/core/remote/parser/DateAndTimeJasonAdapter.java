package com.example.core.remote.parser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/core/remote/parser/DateAndTimeJasonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/core/remote/parser/DateAndTime;", "()V", "requestSDF", "Ljava/text/SimpleDateFormat;", "responseSDF", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "core_debug"})
public final class DateAndTimeJasonAdapter extends com.squareup.moshi.JsonAdapter<com.example.core.remote.parser.DateAndTime> {
    private final java.text.SimpleDateFormat responseSDF = null;
    private final java.text.SimpleDateFormat requestSDF = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.core.remote.parser.DateAndTimeJasonAdapter.Companion Companion = null;
    private static final java.lang.String RESPONSE_FORMAT = "yyyy-MM-dd";
    private static final java.lang.String REQUEST_FORMAT = "yyyy-MM-dd\'T\'HH:mm:ss";
    
    public DateAndTimeJasonAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.example.core.remote.parser.DateAndTime fromJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override
    public void toJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable
    com.example.core.remote.parser.DateAndTime value) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/core/remote/parser/DateAndTimeJasonAdapter$Companion;", "", "()V", "REQUEST_FORMAT", "", "RESPONSE_FORMAT", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}