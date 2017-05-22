package auribises.com.register_guard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Register_GuardAdapter extends ArrayAdapter<Register_Guard> {

    Context context;
    int resource;
    ArrayList<Register_Guard> registerguardList,tempList;

    public Register_GuardAdapter(Context context, int resource, ArrayList<Register_Guard> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        registerguardList = objects;
        tempList = new ArrayList<>();
        tempList.addAll(registerguardList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(resource,parent,false);

        TextView txtName = (TextView)view.findViewById(R.id.textViewName);
        TextView txtGender = (TextView)view.findViewById(R.id.textViewGender);

        Register_Guard register_guard = registerguardList.get(position);
        txtName.setText(register_guard.getName());
        //txtGender.setText(student.getGender());
        txtGender.setText(String.valueOf(register_guard.getId()));

        Log.i("Test", register_guard.toString());

        return view;
    }

    public void filter(String str){

        registerguardList.clear();

        if(str.length()==0){
            registerguardList.addAll(tempList);
        }else{
            for(Register_Guard r : tempList){
                if(r.getName().toLowerCase().contains(str.toLowerCase())){
                    registerguardList.add(r);
                }
            }
        }

        notifyDataSetChanged();
    }
}
