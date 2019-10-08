package com.example.notesapp;

import android.app.Person;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SummaryListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return PersonDB.getInstance().getPersonList().size();
    }
    @Override
    public Object getItem(int position) {
        return PersonDB.getInstace().getPersonList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View row_view = inflater.inflate(R.layout.person_row, viewGroup, false);

        Person p = PersonDB.getInstance().getPersonList().get(position);
        //
        ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());
        return row_view;
    }
}
