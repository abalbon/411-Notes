package com.csuf.cpsc41101.testapplication;

import android.app.Person;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SummaryListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return PersonDB.getInstance().getPersonList().size();
    }
    @Override
    public Object getItem(int position) {
        return PersonDB.getInstance().getPersonList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View row_view;

        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.person_row, viewGroup, false);
        }else row_view = view;

        //
        Person p = PersonDB.getInstance().getPersonList().get(i);
        //
        ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());
        row_view.setTag(new Integer(i));

        row_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // testing code
                        Toast.makeText(view.getContext(), "View Object was touched by the user", Toast.LENGTH_SHORT).show();
                        // How to implement page navigation
                        Intent intent = new Intent(view.getContext(), PersonDetailActivity.class);
                        intent.putExtra("personIndex", ((Integer)view.getTag()).intValue());
                        view.getContext().startActivity(intent);

                    }
                }
        );

        return row_view;
    }
}

/*
adaptedView has a notidydatasetchanged call back which will notify the view to change the display
 */