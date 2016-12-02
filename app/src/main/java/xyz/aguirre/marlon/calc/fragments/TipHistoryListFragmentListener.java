package xyz.aguirre.marlon.calc.fragments;

import xyz.aguirre.marlon.calc.models.TipRecord;

/**
 * Created by marlon on 1/12/16.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
