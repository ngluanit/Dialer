package com.moez.QKSMS.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/moez/QKSMS/util/NightModeManager;", "", "context", "Landroid/content/Context;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "widgetManager", "Lcom/moez/QKSMS/manager/WidgetManager;", "(Landroid/content/Context;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/manager/WidgetManager;)V", "createCalendar", "Ljava/util/Calendar;", "time", "", "getPreviousInstanceOfTime", "parseTime", "setNightEnd", "", "hour", "", "minute", "setNightStart", "updateAlarms", "updateCurrentTheme", "updateNightMode", "mode", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class NightModeManager {
    private final android.content.Context context = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.manager.WidgetManager widgetManager = null;
    
    public final void updateCurrentTheme() {
    }
    
    public final void updateNightMode(int mode) {
    }
    
    public final void setNightStart(int hour, int minute) {
    }
    
    public final void setNightEnd(int hour, int minute) {
    }
    
    private final void updateAlarms() {
    }
    
    private final java.util.Calendar createCalendar(java.lang.String time) {
        return null;
    }
    
    /**
     * Parses the hour and minute out of the [time], which should be formatted h:mm
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar parseTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    /**
     * Returns a Calendar set to the most recent occurrence of this time
     */
    private final java.util.Calendar getPreviousInstanceOfTime(java.lang.String time) {
        return null;
    }
    
    @javax.inject.Inject()
    public NightModeManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.WidgetManager widgetManager) {
        super();
    }
}