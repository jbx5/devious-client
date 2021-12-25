package dev.hoot.api.packets;
public class MousePackets {
    public static void queueClickPacket() {
        dev.hoot.api.packets.MousePackets.queueClickPacket(0, 0);
    }

    public static void queueClickPacket(int x, int y) {
        dev.hoot.api.game.Game.getClient().setMouseLastPressedMillis(java.lang.System.currentTimeMillis());
        int mousePressedTime = ((int) (dev.hoot.api.game.Game.getClient().getMouseLastPressedMillis() - dev.hoot.api.game.Game.getClient().getClientMouseLastPressedMillis()));
        if (mousePressedTime < 0) {
            mousePressedTime = 0;
        }
        if (mousePressedTime > 32767) {
            mousePressedTime = 32767;
        }
        dev.hoot.api.game.Game.getClient().setClientMouseLastPressedMillis(dev.hoot.api.game.Game.getClient().getMouseLastPressedMillis());
        int mouseInfo = (mousePressedTime << 1) + 1;
        dev.hoot.api.packets.MousePackets.queueClickPacket(mouseInfo, x, y);
    }

    public static void queueClickPacket(int mouseinfo, int x, int y) {
        net.runelite.api.Client client = dev.hoot.api.game.Game.getClient();
        net.runelite.api.packets.ClientPacket clientPacket = dev.hoot.api.game.Game.getClientPacket();
        net.runelite.api.packets.PacketBufferNode var18 = dev.hoot.api.game.Game.getClient().preparePacket(clientPacket.EVENT_MOUSE_CLICK(), client.getPacketWriter().getIsaacCipher());
        var18.getPacketBuffer().writeShort(mouseinfo);
        var18.getPacketBuffer().writeShort(x);
        var18.getPacketBuffer().writeShort(y);
        client.getPacketWriter().queuePacket(var18);
    }
}