package co.com.devjs.mestapp.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.devjs.mestapp.R;
import co.com.devjs.mestapp.adapters.ChatAdapter;

public class ChatFragment extends Fragment {

    @BindView(R.id.listViewMessages)
    ListView listViewMessages;

    ChatAdapter chatAdapter;

    private List<String> messages;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_content_chat, container, false);
        ButterKnife.bind(this,root);
        loadData();
        chatAdapter = new ChatAdapter(getContext(), messages);
        listViewMessages.setAdapter(chatAdapter);
        return root;
    }

    private void loadData() {
        messages = new ArrayList<>();
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
        messages.add("Hola James, que tal?");
    }
}
