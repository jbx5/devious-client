package net.unethicalite.api.utils;

import net.unethicalite.client.Static;
import net.runelite.api.ChatMessageType;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.QueuedMessage;

public class MessageUtils
{

    public static void addMessage(String message, ChatColorType colorType, ChatMessageType messageType)
    {
        String chatMessage = new ChatMessageBuilder()
                .append(colorType)
                .append(message)
                .build();

        Static.getChatMessageManager()
                .queue(QueuedMessage.builder()
                        .type(messageType)
                        .runeLiteFormattedMessage(chatMessage)
                        .build());
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
}
