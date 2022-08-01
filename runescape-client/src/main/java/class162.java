import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("fb")
public class class162 extends class165 {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("loginType")
	static LoginType loginType;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1315372909)
	int field1769;

	@ObfuscatedSignature(descriptor = "Lef;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Lef;Ljava/lang/String;I)V")
	class162(class155 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1769 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "28")
	public int vmethod3296() {
		return 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-116")
	public int vmethod3298() {
		return this.field1769;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "1909536168")
	public static void method3284(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "43")
	static final int method3283() {
		if (class260.clientPreferences.method2312()) {
			return FriendSystem.Client_plane;
		} else {
			int var0 = SecureRandomFuture.getTileHeight(WorldMapLabelSize.cameraX, Widget.cameraZ, FriendSystem.Client_plane);
			return var0 - class123.cameraY < 800 && (Tiles.Tiles_renderFlags[FriendSystem.Client_plane][WorldMapLabelSize.cameraX >> 7][Widget.cameraZ >> 7] & 4) != 0 ? FriendSystem.Client_plane : 3;
		}
	}
}