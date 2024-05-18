package com.digitaldart.chatservice.ChatRoom.service;

import com.digitaldart.chatservice.ChatRoom.model.ChatRoomModel;

import java.util.Optional;

public interface ChatRoomService {
    Optional<ChatRoomModel> getChatRoomById(String chatroomId);
    void saveChatRoom(ChatRoomModel chatRoomModel);
}
