package sg.edu.np.madweek3practical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView description;
    ImageView image;
    public ViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
        image = itemView.findViewById(R.id.imageView);

    }


}


