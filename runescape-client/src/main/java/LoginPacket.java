import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	public static final LoginPacket field3135;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	static final LoginPacket field3132;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	public static final LoginPacket field3133;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	public static final LoginPacket field3134;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	public static final LoginPacket field3137;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Ljx;")

	static final LoginPacket field3136;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"[Ljx;")

	static final LoginPacket[] field3138;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-441279243)

	@Export("id")
	public final int id;
	static 
	{
		field3135 = new LoginPacket(14, 0);
		field3132 = new LoginPacket(15, 4);
		field3133 = new LoginPacket(16, -2);
		field3134 = new LoginPacket(18, -2);
		field3137 = new LoginPacket(19, -2);
		field3136 = new LoginPacket(27, 0);
		field3138 = new LoginPacket[32];
		LoginPacket[] var0 = VertexNormal.method4495();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3138[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"0")

	LoginPacket(int var1, int var2) {
		this.id = var1;
	}
}