package co.com.devjs.mestapp.chat;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.adapters.ChatListAdapter;
import co.com.devjs.mestapp.models.Chat;

public class ChatListFragment extends Fragment {

    @BindView(R.id.listViewChats)
    ListView listViewChats;

    ChatListAdapter chatListAdapter;

    private List<Chat> chatList;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chat_list, container, false);
        ButterKnife.bind(this,root);
        loadData();
        chatListAdapter = new ChatListAdapter(getContext(), chatList);
        listViewChats.setAdapter(chatListAdapter);
        return root;
    }

    private void loadData() {
        chatList = new ArrayList<>();
        chatList.add(new Chat(1L, "Santiago Toro", R.drawable.ic_profile, "Hola James, que tal?"));
        chatList.add(new Chat(2L, "Morgan Quintero", R.drawable.ic_profile, "Hola James, que tal?"));
    }


}