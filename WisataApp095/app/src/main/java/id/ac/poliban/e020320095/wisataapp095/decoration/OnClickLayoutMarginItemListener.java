package id.ac.poliban.e020320095.wisataapp095.decoration;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by eka on 01/02/2023.
 */

public interface OnClickLayoutMarginItemListener {
    void onClick(Context context, View v, int position, int spanIndex, RecyclerView.State state);
}
