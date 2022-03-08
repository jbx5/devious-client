import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("do")
public class class117 implements MouseWheel {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1457;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1445;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1444;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1446;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1448;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1449;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1450;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1452;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1447;

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1453;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1454;

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1455;

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1456;

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1462;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1458;

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1451;

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "Ldo;")
    static final class117 field1460;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 866393745)
    final int field1461;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -2113404017)
    final int field1459;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -650243081)
    final int field1463;

    static {
        field1457 = new class117(0, 0, ((String) (null)), -1, -1);
        field1445 = new class117(1, 1, ((String) (null)), 0, 2);
        field1444 = new class117(2, 2, ((String) (null)), 1, 2);
        field1446 = new class117(3, 3, ((String) (null)), 2, 2);
        field1448 = new class117(4, 4, ((String) (null)), 3, 1);
        field1449 = new class117(5, 5, ((String) (null)), 4, 1);
        field1450 = new class117(6, 6, ((String) (null)), 5, 1);
        field1452 = new class117(7, 7, ((String) (null)), 6, 3);
        field1447 = new class117(8, 8, ((String) (null)), 7, 3);
        field1453 = new class117(9, 9, ((String) (null)), 8, 3);
        field1454 = new class117(10, 10, ((String) (null)), 0, 7);
        field1455 = new class117(11, 11, ((String) (null)), 1, 7);
        field1456 = new class117(12, 12, ((String) (null)), 2, 7);
        field1462 = new class117(13, 13, ((String) (null)), 3, 7);
        field1458 = new class117(14, 14, ((String) (null)), 4, 7);
        field1451 = new class117(15, 15, ((String) (null)), 5, 7);
        field1460 = new class117(16, 16, ((String) (null)), 0, 5);
    }

    @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)V", garbageValue = "-1")
    class117(int var1, int var2, String var3, int var4, int var5) {
        this.field1461 = var1;
        this.field1459 = var2;
        this.field1463 = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.field1459;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-37")
    int method2647() {
        return this.field1463;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Z", garbageValue = "57")
    @Export("isNumber")
    public static boolean isNumber(CharSequence var0) {
        boolean var2 = false;
        boolean var3 = false;
        int var4 = 0;
        int var5 = var0.length();
        int var6 = 0;
        boolean var1;
        while (true) {
            if (var6 >= var5) {
                var1 = var3;
                break;
            }
            label82 : {
                char var7 = var0.charAt(var6);
                if (var6 == 0) {
                    if (var7 == '-') {
                        var2 = true;
                        break label82;
                    }
                    if (var7 == '+') {
                        break label82;
                    }
                }
                int var9;
                if ((var7 >= '0') && (var7 <= '9')) {
                    var9 = var7 - '0';
                } else if ((var7 >= 'A') && (var7 <= 'Z')) {
                    var9 = var7 - '7';
                } else {
                    if ((var7 < 'a') || (var7 > 'z')) {
                        var1 = false;
                        break;
                    }
                    var9 = var7 - 'W';
                }
                if (var9 >= 10) {
                    var1 = false;
                    break;
                }
                if (var2) {
                    var9 = -var9;
                }
                int var8 = (var4 * 10) + var9;
                if (var4 != (var8 / 10)) {
                    var1 = false;
                    break;
                }
                var4 = var8;
                var3 = true;
            }
            ++var6;
        } 
        return var1;
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1425978843")
    static final int method2653(int var0, int var1) {
        int var2 = ((class343.method6251(var0 - 1, var1 - 1) + class343.method6251(var0 + 1, var1 - 1)) + class343.method6251(var0 - 1, 1 + var1)) + class343.method6251(var0 + 1, var1 + 1);
        int var3 = ((class343.method6251(var0 - 1, var1) + class343.method6251(var0 + 1, var1)) + class343.method6251(var0, var1 - 1)) + class343.method6251(var0, var1 + 1);
        int var4 = class343.method6251(var0, var1);
        return ((var2 / 16) + (var3 / 8)) + (var4 / 4);
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "-76")
    static int method2655(int var0, Script var1, boolean var2) {
        if ((var0 >= 7200) && (var0 < 7204)) {
            Interpreter.Interpreter_intStackSize -= 5;
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            return 1;
        } else if (var0 == 7204) {
            Interpreter.Interpreter_intStackSize -= 6;
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            return 1;
        } else if ((var0 >= 7205) && (var0 < 7209)) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = -1;
            return 1;
        } else if (var0 == 7209) {
            Interpreter.Interpreter_intStackSize -= 2;
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            return 1;
        } else if ((var0 >= 7210) && (var0 < 7214)) {
            --Interpreter.Interpreter_intStackSize;
            return 1;
        } else if (var0 == 7214) {
            Interpreter.Interpreter_intStackSize -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lf")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1683604829")
    static final void method2654(int var0, int var1) {
        if (Client.currentClanChannels[var0] != null) {
            if ((var1 >= 0) && (var1 < Client.currentClanChannels[var0].method2982())) {
                ClanChannelMember var2 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
                if (var2.rank == (-1)) {
                    PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2850, Client.packetWriter.isaacCipher);
                    var3.packetBuffer.writeByte(3 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var2.username.getName()));
                    var3.packetBuffer.writeByte(var0);
                    var3.packetBuffer.writeShort(var1);
                    var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
                    Client.packetWriter.addNode(var3);
                }
            }
        }
    }
}