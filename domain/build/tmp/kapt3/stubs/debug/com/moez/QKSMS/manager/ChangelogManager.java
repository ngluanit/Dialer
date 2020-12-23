package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManager;", "", "didUpdate", "", "getChangelog", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/manager/ChangelogManager$Changelog;", "markChangelogSeen", "", "Changelog", "domain_debug"})
public abstract interface ChangelogManager {
    
    /**
     * Returns true if the app has benn updated since the last time this method was called
     */
    public abstract boolean didUpdate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.moez.QKSMS.manager.ChangelogManager.Changelog> getChangelog();
    
    public abstract void markChangelogSeen();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManager$Changelog;", "", "added", "", "", "improved", "fixed", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdded", "()Ljava/util/List;", "getFixed", "getImproved", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_debug"})
    public static final class Changelog {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> added = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> improved = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> fixed = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAdded() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getImproved() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getFixed() {
            return null;
        }
        
        public Changelog(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> added, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> improved, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> fixed) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManager.Changelog copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> added, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> improved, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> fixed) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}