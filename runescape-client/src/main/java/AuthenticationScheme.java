import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(3, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(2, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(4, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("TOKEN")
	TOKEN(0, 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1493(1, 4);

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -978634339
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -761276969
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)V",
		garbageValue = "4"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3739 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3871 == null) {
				var0.field3871 = new int[var0.field3739.length];
			}

			var0.field3871[var1] = Integer.MAX_VALUE;
		}
	}
}
