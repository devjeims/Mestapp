package co.com.devjs.mestapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Chat {
    private Long idChat;
    private String nameContact;
    private Integer urlProfilePhoto;
    private String message;
}
