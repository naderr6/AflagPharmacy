package com.example.minip;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBDataBase extends SQLiteOpenHelper {

        public static final String DATABASE_NAME="ItemDataBase.db"; //.db
        public static final String TABLE_NAME="Items";
        public static final String COL_1="Item_Code";
        public static final String COL_2="Item_Name";
        public static final String COL_3="Price";
        public static final String COL_4="Expire_Date";

        public DBDataBase(Context cntxt)
        {
            super(cntxt,DATABASE_NAME,null,1);
        }

        public void onCreate(SQLiteDatabase br)
        {
            br.execSQL("create table " +TABLE_NAME+ "(Item_Code INTEGER PRIMARY KEY AUTOINCREMENT, Item_Name TEXT,Price INTEGER,Expire_Date TEXT)");
        }
        @Override
        public void onUpgrade(SQLiteDatabase dnb, int oldVr, int newVr)
        {
            dnb.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(dnb);
        }
        public boolean adddItem(String n1me, String pr1ce, String da8)
        {
            SQLiteDatabase dob=this.getWritableDatabase();
            ContentValues cVa1ues=new ContentValues();
            cVa1ues.put(COL_2,n1me);
            cVa1ues.put(COL_3,pr1ce);
            cVa1ues.put(COL_4,da8);
            long result=dob.insert(TABLE_NAME,null,cVa1ues);
            if(result==-1)
                return false;
            else
                return true;
        }
        public boolean updateItem(String c0de, String n1me, String pr1ce, String da8)
        {
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues CV1=new ContentValues();
            CV1.put(COL_1,c0de);
            CV1.put(COL_2,n1me);
            CV1.put(COL_3,pr1ce);
            CV1.put(COL_4,da8);
            db.update(TABLE_NAME,CV1,"Item_Code=?",new String[]{c0de});
            return true;
        }
        public Integer deleteItem(String c0de)
        {
            SQLiteDatabase d1b=this.getWritableDatabase();
            return d1b.delete(TABLE_NAME,"Item_Code=?",new String[]{c0de});
        }

        public Cursor getAllItemz(){
            SQLiteDatabase d2b=this.getWritableDatabase();
            Cursor cr2=d2b.rawQuery("select * from "+TABLE_NAME,null);
            return cr2;
        }
    }