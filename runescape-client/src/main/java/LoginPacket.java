import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("is")
@Implements("LoginPacket")
public class LoginPacket implements class253 {
    @ObfuscatedName("td")
    @ObfuscatedGetter(intValue = -715768969)
    static int field3062;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lis;")
    public static final LoginPacket field3064;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lis;")
    static final LoginPacket field3071;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lis;")
    public static final LoginPacket field3067;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lis;")
    public static final LoginPacket field3065;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lis;")
    public static final LoginPacket field3066;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lis;")
    static final LoginPacket field3063;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lis;")
    static final LoginPacket field3068;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "[Lis;")
    @Export("LoginPacket_indexedValues")
    static final LoginPacket[] LoginPacket_indexedValues;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -997966029)
    @Export("id")
    public final int id;

    static {
        field3064 = new LoginPacket(14, 0);
        field3071 = new LoginPacket(15, 4);
        field3067 = new LoginPacket(16, -2);
        field3065 = new LoginPacket(18, -2);
        field3066 = new LoginPacket(19, -2);
        field3063 = new LoginPacket(26, 8);
        field3068 = new LoginPacket(27, 0);
        LoginPacket_indexedValues = new LoginPacket[32];
        LoginPacket[] var0 = new LoginPacket[]{ field3063, field3066, field3064, field3071, field3068, field3065, field3067 };
        LoginPacket[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; ++var2) {
            LoginPacket_indexedValues[var1[var2].id] = var1[var2];
        }
    }

    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "0")
    LoginPacket(int var1, int var2) {
        this.id = var1;
    }
}