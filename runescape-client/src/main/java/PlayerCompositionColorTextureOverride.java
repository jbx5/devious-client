import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("aj")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("az")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	public PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = KeyHandler.ItemDefinition_get(var1);
		if (var2.method4249()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4250()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1613433714"
	)
	static boolean method3776(int var0) {
		for (int var1 = 0; var1 < Client.field765; ++var1) {
			if (Client.field767[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1311417839"
	)
	static void method3777() {
		if (Decimator.field413 != null) {
			Client.field823 = Client.cycle;
			Decimator.field413.method7456();

			for (int var0 = 0; var0 < class358.scene.field1341.length; ++var0) {
				if (class358.scene.field1341[var0] != null) {
					Decimator.field413.method7443((class358.scene.field1341[var0].x >> 7) + class358.scene.field1337, (class358.scene.field1341[var0].y >> 7) + class358.scene.field1333);
				}
			}
		}

	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "0"
	)
	public static Clipboard method3778() {
		return class188.client.method482();
	}
}
