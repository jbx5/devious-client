import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1974293395
	)
	static int field5002;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 366560499
	)
	public int field5000;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ak")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwx;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5000 = (int)(class77.method2338() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "22234"
	)
	static final int method8997(int var0, int var1) {
		int var2 = SecureUrlRequester.method3235(var0 - 1, var1 - 1) + SecureUrlRequester.method3235(1 + var0, var1 - 1) + SecureUrlRequester.method3235(var0 - 1, 1 + var1) + SecureUrlRequester.method3235(1 + var0, 1 + var1);
		int var3 = SecureUrlRequester.method3235(var0 - 1, var1) + SecureUrlRequester.method3235(var0 + 1, var1) + SecureUrlRequester.method3235(var0, var1 - 1) + SecureUrlRequester.method3235(var0, 1 + var1);
		int var4 = SecureUrlRequester.method3235(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
