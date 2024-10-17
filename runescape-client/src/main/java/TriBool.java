import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "45"
	)
	static void method9141(WorldView var0) {
		if (Client.renderSelf) {
			Friend.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}
}
