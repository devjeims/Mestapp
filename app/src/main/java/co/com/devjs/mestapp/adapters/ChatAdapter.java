package co.com.devjs.mestapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.devjs.mestapp.ChatActivity;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.models.Chat;

public class ChatAdapter extends BaseAdapter {

    private final LayoutInflater inflater;

    private final List<String> messages;

    private Context context;

    public ChatAdapter(Context context, List<String> messages) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public String getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        //CORREGIR
        return 1L;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = inflater.inflate(R.layout.item_message_chat, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder.messageContent.setText(messages.get(position));

        return convertView;
    }


    class ViewHolder {

        @BindView(R.id.content_message)
        TextView messageContent;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
