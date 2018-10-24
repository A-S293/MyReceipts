package com.bignerdranch.android.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.criminalintent.Receipt;
import com.bignerdranch.android.criminalintent.database.ReceiptDbSchema.ReceiptTable;

import java.util.Date;
import java.util.UUID;

import static com.bignerdranch.android.criminalintent.database.ReceiptDbSchema.ReceiptTable.*;

public class ReceiptCursorWrapper extends CursorWrapper {

    public ReceiptCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Receipt getReceipt() {
        String uuidString = getString(getColumnIndex(Cols.UUID));
        String title = getString(getColumnIndex(Cols.TITLE));
        long date = getLong(getColumnIndex(Cols.DATE));
        int isSolved = getInt(getColumnIndex(Cols.SOLVED));
        String suspect = getString(getColumnIndex(ReceiptTable.Cols.SUSPECT));
        String location = getString(getColumnIndex(Cols.LOCATION));
        String longitude = getString(getColumnIndex(Cols.LONGITUDE));
        String latitude = getString(getColumnIndex(Cols.LATITUDE));


        Receipt receipt = new Receipt(UUID.fromString(uuidString));
        receipt.setTitle(title);
        receipt.setDate(new Date(date));
        receipt.setSolved(isSolved != 0);
        receipt.setSuspect(suspect);
        receipt.setLocation(location);
        receipt.setLongitude(longitude);
        receipt.setLatitude(latitude);

        return receipt;
    }
}
