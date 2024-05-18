package com.digitaldart.chatservice.ChatRoom.service.impl;

import com.digitaldart.chatservice.ChatRoom.model.ChatRoomModel;
import com.digitaldart.chatservice.ChatRoom.repository.ChatRoomRepository;
import com.digitaldart.chatservice.ChatRoom.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {
    @Autowired
    ChatRoomRepository chatRoomRepository;

    @Override
    public Optional<ChatRoomModel> getChatRoomById(String chatroomId) {
        return chatRoomRepository.findByRoomId(chatroomId);
    }

    @Override
    public void saveChatRoom(ChatRoomModel chatRoomModel) {
        chatRoomRepository.save(chatRoomModel);
    }
}
