package com.example.detail;

import com.example.core.model.MovieDetailUI;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/example/detail/DetailUIState;", "", "movie", "Lcom/example/core/model/MovieDetailUI;", "isLoading", "", "error", "", "(Lcom/example/core/model/MovieDetailUI;ZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "()Z", "setLoading", "(Z)V", "getMovie", "()Lcom/example/core/model/MovieDetailUI;", "setMovie", "(Lcom/example/core/model/MovieDetailUI;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "detail_debug"})
public final class DetailUIState {
    @org.jetbrains.annotations.Nullable
    private com.example.core.model.MovieDetailUI movie;
    private boolean isLoading;
    @org.jetbrains.annotations.NotNull
    private java.lang.String error;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.detail.DetailUIState copy(@org.jetbrains.annotations.Nullable
    com.example.core.model.MovieDetailUI movie, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public DetailUIState() {
        super();
    }
    
    public DetailUIState(@org.jetbrains.annotations.Nullable
    com.example.core.model.MovieDetailUI movie, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.core.model.MovieDetailUI component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.core.model.MovieDetailUI getMovie() {
        return null;
    }
    
    public final void setMovie(@org.jetbrains.annotations.Nullable
    com.example.core.model.MovieDetailUI p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}