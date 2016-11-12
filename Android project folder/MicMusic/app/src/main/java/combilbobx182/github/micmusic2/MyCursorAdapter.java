package combilbobx182.github.micmusic2;

/**
 * Created by Ciaran on 12/11/2016.
 */

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import combilbobx182.github.micmusic2.R;

public class MyCursorAdapter extends CursorAdapter
{
    public MyCursorAdapter(Context context, Cursor cursor)
    {
        super(context, cursor, 0);
    }

    // The newView method is used to inflate a new view and return it,
    // you don't bind any data to the view at this point.
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent)
    {
        return LayoutInflater.from(context).inflate(R.layout.row, parent, false);
    }

    // The bindView method is used to bind all data to a given view
    // such as setting the text on a TextView.
    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        // Find fields to populate in inflated template
        TextView sen = (TextView) view.findViewById(R.id.Sensitivity);

        String name = cursor.getString(cursor.getColumnIndexOrThrow("sensitivity"));
        Log.d("CURSORADAPTOR",name);

        sen.setText(name);
    }
}