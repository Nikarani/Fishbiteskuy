package com.example.fishbiteskuy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBDataSource {

        private SQLiteDatabase database;
        private DBHelper dbhelper;

        public DBDataSource(Context context) {
            dbhelper = new DBHelper(context);
        }

        public void open() throws SQLException {
            database = dbhelper.getWritableDatabase();
        }

        public void close() {
            dbhelper.close();
        }

        // Menambahkan pengguna baru ke database
        public boolean registerUser(String username, String password) {
            ContentValues values = new ContentValues();
            values.put(DBHelper.COLUMN_USERNAME, username);
            values.put(DBHelper.COLUMN_PASSWORD, password);

            // Insert data dan cek apakah berhasil
            long result = database.insert(DBHelper.TABLE_USERS, null, values);
            return result != -1; // Mengembalikan true jika sukses
        }

        // Mengecek keberadaan pengguna saat login
        public boolean checkUser(String username, String password) {
            String[] columns = { DBHelper.COLUMN_ID };
            String selection = DBHelper.COLUMN_USERNAME + " = ? AND " + DBHelper.COLUMN_PASSWORD + " = ?";
            String[] selectionArgs = { username, password };

            Cursor cursor = database.query(DBHelper.TABLE_USERS, columns, selection, selectionArgs, null, null, null);
            int cursorCount = cursor.getCount();
            cursor.close();
            return cursorCount > 0; // Mengembalikan true jika pengguna ditemukan
        }
    }



