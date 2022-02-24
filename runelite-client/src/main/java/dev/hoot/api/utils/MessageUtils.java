package dev.hoot.api.utils;

import net.runelite.api.ChatMessageType;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;

import javax.inject.Inject;

public class MessageUtils
{
    @Inject
    private static ChatMessageManager chatMessageManager;

    public static void sendMessage(String message, ChatColorType colorType, ChatMessageType messageType)
    {
        String chatMessage = new ChatMessageBuilder()
                .append(colorType)
                .append(message)
                .build();

        chatMessageManager
                .queue(QueuedMessage.builder()
                        .type(messageType)
                        .runeLiteFormattedMessage(chatMessage)
                        .build());
    }

    public static void sendMesage(String message, ChatMessageType messageType)
    {
        sendMessage(message, ChatColorType.HIGHLIGHT, messageType);
    }

    public static void sendMessage(String message, ChatColorType colorType)
    {
        sendMessage(message, colorType, ChatMessageType.CONSOLE);
    }

    public static void sendMessage(String message)
    {
        sendMessage(message, ChatColorType.HIGHLIGHT, ChatMessageType.CONSOLE);
    }
}
