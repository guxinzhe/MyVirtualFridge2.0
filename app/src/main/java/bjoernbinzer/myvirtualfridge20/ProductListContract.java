package bjoernbinzer.myvirtualfridge20;

import android.provider.BaseColumns;

/**
 * Created by Alina on 16.10.2015.
 */
public class ProductListContract {
        // To prevent someone from accidentally instantiating the contract class,
        // give it an empty constructor.
        public ProductListContract() {}

        /* Inner class that defines the table contents */
        public static abstract class ProductListEntry implements BaseColumns {
            public static final String TABLE_NAME = "ProductList";
            public static final String COLUMN_NAME_ENTRY_ID = "entryid";
            public static final String COLUMN_NAME_PRODUCT = "product";
            public static final String COLUMN_NAME_HALTBARKEIT = "haltbarkeit";
            public static final String COLUMN_NAME_MENGE = "menge";
            public static final String COLUMN_NAME_UOM = "einheit";
            public static final String COLUMN_NAME_PRICE = "price";
            public static final String COLUMN_NAME_CATEGORY = "category";
        }
    }

