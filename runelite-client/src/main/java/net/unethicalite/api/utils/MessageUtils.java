package net.unethicalite.api.utils;

import java.awt.Color;
import net.unethicalite.client.Static;
import net.runelite.api.ChatMessageType;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.QueuedMessage;

public class MessageUtils
{
    private static final ChatMessageBuilder chatMessageBuilder = new ChatMessageBuilder();

    public static void addMessage(String message, ChatColorType colorType, ChatMessageType messageType)
    {
        String chatMessage = chatMessageBuilder
                .append(colorType)
                .append(message)
                .build();

        Static.getChatMessageManager()
                .queue(QueuedMessage.builder()
                        .type(messageType)
                        .runeLiteFormattedMessage(chatMessage)
                        .build());

        chatMessageBuilder.clear();
    }

    public static void addMessage(String message, ChatMessageType messageType)
    {
        addMessage(message, ChatColorType.HIGHLIGHT, messageType);
    }

    public static void addMessage(String message, ChatColorType colorType)
    {
        addMessage(message, colorType, ChatMessageType.CONSOLE);
    }

    public static void addMessage(String message)
    {
        addMessage(message, ChatColorType.HIGHLIGHT, ChatMessageType.CONSOLE);
    }

    public static void addMessage(String message, Color color, ChatMessageType messageType)
    {
        String chatMessage = chatMessageBuilder
                .append(color, message)
                .build();

        Static.getChatMessageManager()
                .queue(QueuedMessage.builder()
                        .type(messageType)
                        .runeLiteFormattedMessage(chatMessage)
                        .build());

        chatMessageBuilder.clear();
    }

    public static void addMessage(String message, Color color)
    {
        addMessage(message, color, ChatMessageType.CONSOLE);
    }
}
