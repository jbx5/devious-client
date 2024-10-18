import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class326 implements class321 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3587;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3584;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3588;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3585;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3590;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3586;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class326 field3589;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static final class326 field3583;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lmv;"
	)
	static final class326[] field3593;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1270591485
	)
	public final int field3591;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1874243187
	)
	public final int field3592;

	static {
		field3587 = new class326(14, 0);
		field3584 = new class326(15, 20);
		field3588 = new class326(16, -2);
		field3585 = new class326(18, -2);
		field3590 = new class326(19, -2);
		field3586 = new class326(20, 58);
		field3589 = new class326(21, 37);
		field3583 = new class326(27, 0);
		field3593 = new class326[32];
		class326[] var0 = new class326[]{field3590, field3584, field3585, field3587, field3588, field3589, field3583, field3586};
		class326[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3593[var1[var2].field3591] = var1[var2];
		}

	}

	class326(int var1, int var2) {
		this.field3591 = var1;
		this.field3592 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "946889204"
	)
	public static void method6529() {
		ByteArrayPool.field4902.clear();
		ByteArrayPool.field4902.add(100);
		ByteArrayPool.field4902.add(5000);
		ByteArrayPool.field4902.add(10000);
		ByteArrayPool.field4902.add(30000);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "600868912"
	)
	static SecureRandom method6528() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
