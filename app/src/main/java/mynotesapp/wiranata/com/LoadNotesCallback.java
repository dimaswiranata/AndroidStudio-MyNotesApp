package mynotesapp.wiranata.com;

import java.util.ArrayList;

import mynotesapp.wiranata.com.entity.Note;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
