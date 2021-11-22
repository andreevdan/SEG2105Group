package com.example.termproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CourseDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME ="Courses.db";
    private static final String TABLE_COURSES="courses";
    private static final String COLUMN_ID="_id";
    private static final String COLUMN_COURSENAME="coursename";
    private static final String COLUMN_DESCRIPTION="description";


    public CourseDBHandler(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_COURSES_TABLE ="CREATE TABLE " + TABLE_COURSES
                +"("+COLUMN_ID+" INTEGER PRIMARY KEY,"
                + COLUMN_COURSENAME+" TEXT,"
                + COLUMN_DESCRIPTION+" TEXT"+ ")";
        db.execSQL(CREATE_COURSES_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COURSES);
        onCreate(db);
    }
    public void add(ClassClass course){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_COURSENAME,course.name);
        values.put(COLUMN_DESCRIPTION,course.description);


        db.insert(TABLE_COURSES,null,values);
        db.close();
    }

    public ClassClass find(String coursename){
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM " + TABLE_COURSES + " WHERE "+COLUMN_COURSENAME+" = \"" + coursename +"\"";
        Cursor cursor =db.rawQuery(query,null);
        ClassClass course =new ClassClass();

        if (cursor.moveToFirst()){
            course.changeID(cursor.getInt(0)); //Integer.parseInt(cursor.getString(0)));
            course.changeName(cursor.getString(1));
            course.changeDescription(cursor.getString(2));
            cursor.close();
        }else{
            course=null;
        }
        db.close();
        return course;
    }

    public boolean delete(int id){
        boolean result =false;
        SQLiteDatabase db = this.getWritableDatabase();
        String query="SELECT * FROM " + TABLE_COURSES + " WHERE "+COLUMN_ID+" = \"" + id +"\"";
        Cursor cursor =db.rawQuery(query,null);

        if(cursor.moveToFirst()){
            String idStr = cursor.getString(0);
            db.delete(TABLE_COURSES,COLUMN_ID+" = "+idStr,null);
            cursor.close();
            result =true;
        }
        db.close();
        return result;
    }

    public Cursor viewData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM "+TABLE_COURSES;
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
    public ClassClass find(int id){
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM " + TABLE_COURSES + " WHERE "+COLUMN_ID+" = \"" + id +"\"";
        Cursor cursor =db.rawQuery(query,null);
        ClassClass course =new ClassClass();

        if (cursor.moveToFirst()){
            course.changeID(cursor.getInt(0)); //Integer.parseInt(cursor.getString(0)));
            course.changeName(cursor.getString(1));
            course.changeDescription(cursor.getString(2));
            cursor.close();
        }else{
            course=null;
        }
        db.close();
        return course;
    }
    public void editDescription(int id, String description){
        SQLiteDatabase db = this.getWritableDatabase();
        String strSQL = "UPDATE "+TABLE_COURSES+" SET "+COLUMN_DESCRIPTION+" = \""+
                description+ "\" WHERE "+ COLUMN_ID +" = \""+ id+"\"";

        db.execSQL(strSQL);
        db.close();
    }
    public void editName(int id, String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String strSQL = "UPDATE "+TABLE_COURSES+" SET "+COLUMN_COURSENAME+" = \""+
                name+ "\" WHERE "+ COLUMN_ID +" = \""+ id+"\"";

        db.execSQL(strSQL);
        db.close();
    }
}