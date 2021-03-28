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
import co.com.devjs.mestapp.ChatActivity;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.models.Chat;


public class ChatListAdapter extends BaseAdapter {


    private Context context;
    private final LayoutInflater inflater;
    private List<Chat> chatListInput;
    private List<Chat> chatListOutput;

    public ChatListAdapter(Context context, List<Chat> chatList) {
        this.inflater = LayoutInflater.from(context);
        this.chatListInput = chatList;
        this.chatListOutput = chatList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return chatListOutput.size();
    }

    @Override
    public Object getItem(int position) {
        return chatListOutput.get(position);
    }

    @Override
    public long getItemId(int position) {
        return chatListOutput.get(position).getIdChat();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        final Chat chat = (Chat) getItem(position);
        ViewHolder viewHolder;
        if (view != null) {
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_chat, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder.nameContact.setText(chatListOutput.get(position).getNameContact());
        viewHolder.message.setText(chatListOutput.get(position).getMessage());
        viewHolder.imgProfile.setImageResource(chatListOutput.get(position).getUrlProfilePhoto());

        view.setOnClickListener(v -> {
            Intent intent = new Intent(context, ChatActivity.class);
            context.startActivity(intent);
        });

        return view;
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
