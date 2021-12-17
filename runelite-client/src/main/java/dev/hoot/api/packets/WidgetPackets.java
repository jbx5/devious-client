package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;

import java.util.List;

public class WidgetPackets {

    public static void queueResumePauseWidgetPacket(int var0, int var1){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var2 = Game.getClient().preparePacket(clientPacket.RESUME_PAUSEBUTTON(), client.getPacketWriter().getIsaacCipher());
        var2.getPacketBuffer().writeIntME2(var0);
        var2.getPacketBuffer().writeShort(var1);
        client.getPacketWriter().queuePacket(var2);
    }

    public static void queueWidgetActionPacket(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON1(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }

    public static void queueWidgetAction2Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON2(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction3Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON3(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction4Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON4(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction5Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction6Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON6(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction7Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON7(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction8Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON8(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction9Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON9(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void queueWidgetAction10Packet(int widgetID, int itemID, int itemSlot){
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode var10 = Game.getClient().preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
        var10.getPacketBuffer().writeInt(widgetID);
        var10.getPacketBuffer().writeShort(itemSlot);
        var10.getPacketBuffer().writeShort(itemID);
        client.getPacketWriter().queuePacket(var10);
    }
    public static void widgetFirstOption(Widget widget){
        queueWidgetActionPacket(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSecondOption(Widget widget){
        queueWidgetAction2Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetThirdOption(Widget widget){
        queueWidgetAction3Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetFourthOption(Widget widget){
        queueWidgetAction4Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetFifthOption(Widget widget){
        queueWidgetAction5Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSixthOption(Widget widget){
        queueWidgetAction6Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetSeventhOption(Widget widget){
        queueWidgetAction7Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetEighthOption(Widget widget){
        queueWidgetAction8Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetNinthOption(Widget widget){
        queueWidgetAction9Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetTenthOption(Widget widget){
        queueWidgetAction10Packet(widget.getId(),widget.getItemId(),widget.getIndex());
    }
    public static void widgetAction(Widget widget,String action){
        List<String> actions = widget.getActions();
        if(actions==null){
            return;
        }
        int index = actions.indexOf(action);
        switch (index) {
            case 0:
                widgetFirstOption(widget);
                break;
            case 1:
                widgetSecondOption(widget);
                break;
            case 2:
                widgetThirdOption(widget);
                break;
            case 3:
                widgetFourthOption(widget);
                break;
            case 4:
                widgetFifthOption(widget);
                break;
            case 5:
                widgetSixthOption(widget);
                break;
            case 6:
                widgetSeventhOption(widget);
                break;
            case 7:
                widgetEighthOption(widget);
                break;
            case 8:
                widgetNinthOption(widget);
                break;
            case 9:
                widgetTenthOption(widget);
                break;
        }
    }
}
