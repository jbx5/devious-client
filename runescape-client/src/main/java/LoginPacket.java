import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("LoginPacket")
public class LoginPacket implements class262 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final LoginPacket field3182;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static final LoginPacket field3180;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final LoginPacket field3187;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final LoginPacket field3179;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final LoginPacket field3183;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static final LoginPacket field3181;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Ljz;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1664223141
	)
	@Export("id")
	public final int id;

	static {
		field3182 = new LoginPacket(14, 0); // L: 5
		field3180 = new LoginPacket(15, 4); // L: 6
		field3187 = new LoginPacket(16, -2); // L: 7
		field3179 = new LoginPacket(18, -2); // L: 8
		field3183 = new LoginPacket(19, -2); // L: 9
		field3181 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field3182, field3181, field3183, field3179, field3180, field3187}; // L: 17
		LoginPacket[] var1 = var0; // L: 19

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 20
			LoginPacket_indexedValues[var1[var2].id] = var1[var2]; // L: 21
		}

	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27
}
