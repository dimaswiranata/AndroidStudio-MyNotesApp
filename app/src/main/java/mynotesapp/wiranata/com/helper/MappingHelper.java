package mynotesapp.wiranata.com.helper;

import android.database.Cursor;

import java.util.ArrayList;

import mynotesapp.wiranata.com.entity.Note;

import static android.provider.MediaStore.Audio.Playlists.Members._ID;
import static mynotesapp.wiranata.com.db.DatabaseContract.NoteColumns.DATE;
import static mynotesapp.wiranata.com.db.DatabaseContract.NoteColumns.DESCRIPTION;
import static mynotesapp.wiranata.com.db.DatabaseContract.NoteColumns.TITLE;

public class MappingHelper {

    public static ArrayList<Note> mapCursorToArrayList(Cursor notesCursor) {
        ArrayList<Note> notesList = new ArrayList<>();

        while (notesCursor.moveToNext()) {
            int id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(_ID));
            String title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(TITLE));
            String description = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DESCRIPTION));
            String date = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DATE));
            notesList.add(new Note(id, title, description, date));
        }

        return notesList;
    }
}
