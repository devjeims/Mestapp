package co.com.devjs.mestapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.models.Chat;

public class ChatAdapter extends BaseAdapter {

    private final LayoutInflater inflater;

    private final List<Chat> chatList;

    private Context context;

    public ChatAdapter(Context context, List<Chat> chatList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.chatList = chatList;
    }

    @Override
    public int getCount() {
        return chatList.size();
    }

    @Override
    public Chat getItem(int position) {
        return chatList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return chatList.get(position).getIdChat().longValue();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Chat chat = getItem(position);
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = inflater.inflate(R.layout.item_chat, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder.nameContact.setText(chatList.get(position).getNameContact());
        holder.message.setText(chatList.get(position).getMessage());
        holder.imgProfile.setImageResource(chatList.get(position).getUrlProfilePhoto());

        convertView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RegistroPersonaActivity.class);
            intent.putExtra("datosPersona", persona);
            context.startActivity(intent);
        });

        return convertView;
    }



    class ViewHolder {
        @BindView(R.id.name_contact)
        TextView nameContact;
        @BindView(R.id.message_content)
        TextView message;
        @BindView(R.id.img_profile)
        ImageView imgProfile;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
