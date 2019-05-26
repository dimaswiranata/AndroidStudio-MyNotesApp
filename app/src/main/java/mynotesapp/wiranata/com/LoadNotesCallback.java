package mynotesapp.wiranata.com;

import android.database.Cursor;

import java.util.ArrayList;

import mynotesapp.wiranata.com.entity.Note;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(Cursor notes);
}
