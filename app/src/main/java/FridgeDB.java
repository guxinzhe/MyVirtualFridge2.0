import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import bjoernbinzer.myvirtualfridge20.LogDBHelper;

/**
 * Created by Alina on 20.10.2015.
 */

/* Interface for FridgeDB access */

public class FridgeDB {

    private static LogDBHelper mDBHelper;

    public static void createFridgeDB (Context context){
        mDBHelper = new LogDBHelper(context);
    }

    public static long insertEntry(int id, String product, String durability,
                                   double quantity, String uom, double price,
                                   String category ){

        // Gets the data repository in write mode
        SQLiteDatabase db = mDBHelper.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(LogDBHelper.COLUMN_ENTRY_ID, id);
        values.put(LogDBHelper.COLUMN_PRODUCT, product);
        values.put(LogDBHelper.COLUMN_DURABILITY, durability);
        values.put(LogDBHelper.COLUMN_QUANTITY, quantity);
        values.put(LogDBHelper.COLUMN_UOM, uom);
        values.put(LogDBHelper.COLUMN_PRICE, price);
        values.put(LogDBHelper.COLUMN_CATEGORY, category);

        //Insert the new row, returning the primary key of the new row
        long newRowId;
        return newRowId = db.insert(LogDBHelper.TABLE_NAME, null,values);
    }
}
