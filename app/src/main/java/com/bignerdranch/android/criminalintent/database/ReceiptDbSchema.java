package com.bignerdranch.android.criminalintent.database;

public class ReceiptDbSchema {
    public static final class ReceiptTable {
        public static final String NAME = "Receipts";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
            public static final String LOCATION = "location";
            public static final String LONGITUDE = "longitude";
            public static final String LATITUDE = "latitude";
        }
    }
}